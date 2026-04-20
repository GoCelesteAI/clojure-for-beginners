(ns app.core)

;; An agent holds a log — a vector of entries.
;; send queues a fn against it; the fn runs on an agent thread.
(def logger (agent []))

(defn log!
  "Fire-and-forget: queue an entry on the logger.
   Returns the agent immediately — the actual conj happens asynchronously."
  [entry]
  (send logger conj entry))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (log! "server started")
  (log! "request /users")
  (log! "request /products")
  (log! "shutdown")

  ;; `await` blocks until all pending sends have completed.
  (await logger)

  (println "=== log ===")
  (doseq [e @logger] (println " ·" e))

  ;; Reset the log and hammer it with 1000 async sends.
  (send logger (fn [_] []))
  (await logger)

  (dotimes [i 1000]
    (log! (str "entry-" i)))
  (await logger)

  (println)
  (println "After 1000 async log!s, count:" (count @logger))

  ;; Essential — otherwise the agent thread pool keeps the JVM alive.
  (shutdown-agents))
