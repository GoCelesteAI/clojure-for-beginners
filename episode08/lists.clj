;; Episode 8: Lists
;; Clojure for Beginners in Neovim

;; Create a list — quote prevents evaluation
(def fruits '("apple" "banana" "cherry"))
(println "Fruits:" fruits)

;; first and rest — head and tail
(println "First:" (first fruits))
(println "Rest:" (rest fruits))

;; conj adds to the FRONT of a list (opposite of vectors!)
(def more-fruits (conj fruits "mango"))
(println "After conj:" more-fruits)

;; cons prepends one item — similar to conj for lists
(println "cons:" (cons "kiwi" fruits))

;; list? checks the type
(println "list?" (list? fruits))
(println "vector?" (vector? fruits))

;; Lists vs vectors — conj behavior differs
(println "conj to vector:" (conj [1 2 3] 4))
(println "conj to list:" (conj '(1 2 3) 0))

;; A stack — push and pop with a list
(def stack '())
(def stack (conj stack "first"))
(def stack (conj stack "second"))
(def stack (conj stack "third"))
(println "Stack:" stack)
(println "Top:" (peek stack))
(def stack (pop stack))
(println "After pop:" stack)
