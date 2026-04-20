(ns app.core)

;; ─── Counter ─── an atom holds a single integer
(def counter (atom 0))

(defn hit!
  "Record a hit. Returns the new count."
  []
  (swap! counter inc))

(defn hit-count [] @counter)

(defn reset-counter! [] (reset! counter 0))

;; ─── Cache ─── an atom holds a map; swap! with assoc updates it
(def cache (atom {}))

(defn cache-set! [k v] (swap! cache assoc k v))

(defn cache-get [k] (get @cache k))

(defn cache-size [] (count @cache))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (dotimes [_ 5] (hit!))
  (println "Counter    :" (hit-count))

  (cache-set! :greeting "Hello")
  (cache-set! :lang     "Clojure")
  (cache-set! :year     2026)

  (println "Cache size :" (cache-size))
  (println "Cache      :" @cache))
