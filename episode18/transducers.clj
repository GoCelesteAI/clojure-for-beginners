;; Episode 18: Transducers
;; Clojure for Beginners in Neovim

(println "== a transducer is a function ==")

;; map, filter, etc. called WITHOUT a collection return a transducer
(def xf-inc (map inc))
(println (type xf-inc))

;; A transducer knows HOW to transform but not WHAT collection to use yet
;; Apply it with `sequence`, `transduce`, or `into`

(println (sequence xf-inc [1 2 3 4 5]))

(println)
(println "== compose with comp ==")

;; Transducers compose LEFT-TO-RIGHT — the reverse of regular function comp
(def xf-pipeline
  (comp (filter even?)
        (map #(* % %))))

(println (sequence xf-pipeline (range 1 11)))

(println)
(println "== transduce: apply + fold ==")

;; transduce threads items through xf, then folds with a reducing fn
(println (transduce xf-pipeline + (range 1 11)))

;; Same thing with a seed value
(println (transduce xf-pipeline + 1000 (range 1 11)))

(println)
(println "== into: collect into a new coll ==")

;; `into` with a transducer builds a new collection directly
(println (into [] xf-pipeline (range 1 11)))
(println (into #{} xf-pipeline (range 1 11)))

(println)
(println "== Ep14 pipeline as a transducer ==")

(def orders
  [{:id 1 :paid? true  :total 40}
   {:id 2 :paid? false :total 25}
   {:id 3 :paid? true  :total 80}
   {:id 4 :paid? true  :total 15}])

;; Ep14 used threading — three separate seq passes, two intermediate colls
;; Transducer version — ONE pass, no intermediate collections
(def xf-revenue
  (comp (filter :paid?)
        (map :total)))

(println (transduce xf-revenue + orders))
