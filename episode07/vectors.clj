;; Episode 7: Vectors
;; Clojure for Beginners in Neovim

;; Create a vector with literal syntax
(def colors ["red" "green" "blue"])
(println "Colors:" colors)

;; Access by index — get and nth
(println "First:" (get colors 0))
(println "Third:" (nth colors 2))

;; Count returns how many items
(println "Count:" (count colors))

;; conj adds to the end of a vector
(def more-colors (conj colors "yellow"))
(println "After conj:" more-colors)

;; Vectors are immutable — the original is unchanged
(println "Original:" colors)

;; peek and pop — last item and everything but last
(println "Peek:" (peek more-colors))
(println "Pop:" (pop more-colors))

;; Vectors work as functions of their index
(println "colors at 1:" (colors 1))

;; A shopping list example
(def cart ["apples" "bread" "milk"])
(def cart (conj cart "eggs"))
(def cart (conj cart "cheese"))
(println "Cart:" cart)
(println "Items:" (count cart))
