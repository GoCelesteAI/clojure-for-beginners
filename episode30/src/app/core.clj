(ns app.core
  (:require [clojure.core.async :as a :refer [chan >!! <! close! go-loop]]))

;; ─── One counter, four primitives, side by side ───

;; atom — independent state, synchronous, compare-and-set
(def atom-count (atom 0))
(defn atom-hit! [] (swap! atom-count inc))

;; ref — coordinated state, transactional; would shine with multiple refs
(def ref-count (ref 0))
(defn ref-hit! [] (dosync (alter ref-count inc)))

;; agent — async state, fn runs on agent thread, side effects OK
(def agent-count (agent 0))
(defn agent-hit! [] (send agent-count inc))

;; core.async — channel + consumer go-loop; many producers possible
(def ch (chan 1024))
(def async-count (atom 0))
(go-loop []
  (when-some [_ (<! ch)]
    (swap! async-count inc)
    (recur)))
(defn async-hit! [] (>!! ch :hit))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (let [n 100]
    (dotimes [_ n] (atom-hit!))
    (println "atom  :" @atom-count)

    (dotimes [_ n] (ref-hit!))
    (println "ref   :" @ref-count)

    (dotimes [_ n] (agent-hit!))
    (await agent-count)
    (println "agent :" @agent-count)

    (dotimes [_ n] (async-hit!))
    (close! ch)
    (Thread/sleep 200)
    (println "async :" @async-count))

  (println)
  (println "decision tree —")
  (println "  atom   : one value, caller wants it synchronously")
  (println "  ref    : multiple values must change together")
  (println "  agent  : fire-and-forget async state, side effects OK")
  (println "  async  : producer/consumer, many workers, backpressure")
  (println "  future : one-shot async computation (not state)")

  (shutdown-agents))
