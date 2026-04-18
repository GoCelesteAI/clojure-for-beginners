;; Episode 12: Lazy Sequences
;; Clojure for Beginners in Neovim

(println "== range — finite and infinite ==")
(println "range 5:" (range 5))
(println "range 1-10:" (range 1 11))
(println "take 5 from infinite:" (take 5 (range)))

(println)
(println "== repeat and iterate ==")
(println "3 hellos:" (take 3 (repeat "hello")))

(defn double-it [x] (* 2 x))
(println "powers of 2:" (take 8 (iterate double-it 1)))
(println "counting from 10:" (take 6 (iterate inc 10)))

(println)
(println "== take-while — stop when condition fails ==")
(defn under-50? [x] (< x 50))
(println "under 50:" (take-while under-50? (range)))

(println)
(println "== laziness means no wasted work ==")
(println "first 3 evens:" (take 3 (filter even? (range))))
