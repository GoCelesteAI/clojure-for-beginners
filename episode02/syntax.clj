;; Episode 2: S-Expressions and Syntax
;; Clojure for Beginners in Neovim

;; Prefix notation — function first, arguments after
(println (+ 1 2 3))

;; Variable arity — as many args as you want
(println (* 2 3 4 5))

;; Nested expressions evaluate inside-out
(println (+ 10 (* 2 3)))

;; Code is data — a quoted list is a list
(println '(+ 1 2 3))
(println (first '(+ 1 2 3)))
