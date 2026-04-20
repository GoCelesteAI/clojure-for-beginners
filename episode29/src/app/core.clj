(ns app.core
  (:require [clojure.core.async :as a
             :refer [chan >! <! <!! go go-loop close! timeout]]))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (let [ch (chan 3)]
    (println "── producer / consumer over a channel ──")

    ;; Producer go block: 5 messages, 100ms apart, then close
    (go
      (dotimes [i 5]
        (>! ch {:n i :msg (str "payload-" i)})
        (<! (timeout 100)))
      (close! ch))

    ;; Consumer go-loop: read until the channel closes (nil)
    (<!!
      (go-loop []
        (when-let [v (<! ch)]
          (println "consumer got:" v)
          (recur))))

    (println "channel closed, consumer done"))

  (shutdown-agents))
