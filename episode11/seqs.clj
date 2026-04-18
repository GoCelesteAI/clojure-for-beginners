;; Episode 11: The Seq Abstraction
;; Clojure for Beginners in Neovim

;; seq works on vectors, lists, maps, sets, strings
(println "Vector:" (seq [1 2 3]))
(println "List:" (seq '(:a :b :c)))
(println "Map:" (seq {:name "Ada" :age 30}))
(println "Set:" (seq #{:red :green}))
(println "String:" (seq "hello"))
(println "Empty:" (seq []))

;; first and rest work on anything seqable
(println "first vec:" (first [10 20 30]))
(println "rest vec:" (rest [10 20 30]))
(println "first map:" (first {:a 1 :b 2}))
(println "first str:" (first "hello"))

;; A function that works on any collection
(defn describe-coll [coll]
  (println "Type:" (type coll))
  (println "First:" (first coll))
  (println "Rest:" (rest coll))
  (println "Count:" (count coll))
  (println))

(describe-coll [1 2 3])
(describe-coll '(:a :b :c))
(describe-coll "Clojure")
