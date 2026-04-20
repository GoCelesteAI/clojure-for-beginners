;; Episode 19: for, doseq, and List Comprehensions
;; Clojure for Beginners in Neovim

(println "== for: list comprehension ==")

;; `for` generates a lazy sequence — think "for every x, give me f(x)"
(println (for [x (range 5)] (* x x)))

(println)
(println "== multiple bindings ==")

;; Multiple bindings = nested loop; the RIGHTMOST binding varies fastest
(println (for [x [:a :b :c] y [1 2]] [x y]))

(println)
(println "== chess board coordinates ==")

;; Classic list-comp use-case: a Cartesian grid
(def files [:a :b :c :d :e :f :g :h])
(def ranks (range 1 9))
(def board (for [f files r ranks] [f r]))

(println (count board))
(println (take 8 board))

(println)
(println "== :when filters ==")

;; :when drops bindings that don't match — like filter, inline
(println (for [x (range 10) :when (odd? x)] x))

;; Dark squares only — (file + rank) is odd
(def file-index {:a 1 :b 2 :c 3 :d 4 :e 5 :f 6 :g 7 :h 8})
(def dark-squares
  (for [f files r ranks
        :when (odd? (+ (file-index f) r))]
    [f r]))

(println (count dark-squares))
(println (take 4 dark-squares))

(println)
(println "== :let bindings ==")

;; :let names intermediate values so downstream :when / body stay clean
(def pythagorean-triples
  (for [a (range 1 20)
        b (range a 20)
        :let [c2 (+ (* a a) (* b b))
              c  (Math/sqrt c2)]
        :when (= c2 (* (int c) (int c)))]
    [a b (int c)]))

(println pythagorean-triples)

(println)
(println "== doseq: for side effects ==")

;; Same shape as `for`, but returns nil and runs eagerly
;; Use it when you want the effects (println, writes) — not a collection
(doseq [n (range 1 4)]
  (println "tick" n))

(println)
(println "== multiplication table with doseq ==")

;; doseq with multiple bindings — two nested loops, no collection built
(doseq [x (range 1 6)]
  (doseq [y (range 1 6)]
    (print (format "%3d " (* x y))))
  (println))

(println)
(println "== for vs doseq — the rule ==")

;; for  => returns a lazy sequence of results (value-producing)
;; doseq => returns nil, runs eagerly (effect-producing)
(def squares (for [x (range 5)] (* x x)))
(println "for   =>" squares)

(def nothing (doseq [x (range 5)] (print x " ")))
(println)
(println "doseq =>" nothing)
