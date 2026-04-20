(ns app.core)

;; Two refs — account balances that must stay in sync.
(def account-a (ref 100))
(def account-b (ref 0))

(defn transfer!
  "Move `amount` from one ref to another, atomically. Both updates
   either happen together or not at all."
  [from to amount]
  (dosync
    (alter from - amount)
    (alter to   + amount)))

(defn total
  "Sum of both balances — the invariant."
  []
  (dosync (+ @account-a @account-b)))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (println "Before       :" @account-a "/" @account-b "  total =" (total))

  (transfer! account-a account-b 30)
  (println "After  30 → B:" @account-a "/" @account-b "  total =" (total))

  (transfer! account-a account-b 20)
  (println "After  20 → B:" @account-a "/" @account-b "  total =" (total))

  ;; Hammer STM — 200 random transfers, concurrently, in both directions.
  (let [fs (doall (for [_ (range 200)]
                    (future (transfer! account-a account-b (rand-int 10))
                            (transfer! account-b account-a (rand-int 10)))))]
    (run! deref fs))

  (println "After 200 ops:" @account-a "/" @account-b "  total =" (total)))
