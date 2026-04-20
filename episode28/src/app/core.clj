(ns app.core)

(defn slow-double
  "Fake slow computation — sleep 50*n ms, then return 2*n."
  [n]
  (Thread/sleep (* 50 n))
  (* 2 n))

(defn -main
  "Run with: clj -M:run"
  [& _]
  ;; ─── future: run something in the background, deref to collect ───
  (println "── futures ──")
  (let [f1 (future (slow-double 3))
        f2 (future (slow-double 1))
        f3 (future (slow-double 5))]
    (println "started three; main blocks on each @f")
    (println "f1 =" @f1 "  (was n=3)")
    (println "f2 =" @f2 "  (was n=1)")
    (println "f3 =" @f3 "  (was n=5)"))

  ;; ─── promise: a one-shot handoff between threads ───
  (println)
  (println "── promise ──")
  (let [p (promise)]
    (future
      (Thread/sleep 300)
      (deliver p :ready!))
    (println "main waiting on @p ...")
    (println "delivered:" @p))

  (shutdown-agents))
