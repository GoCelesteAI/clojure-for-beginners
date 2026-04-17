;; Episode 5: Conditionals
;; Clojure for Beginners in Neovim

;; if is an expression — it returns a value
(def x 7)
(println (if (> x 5) "big" "small"))

;; when — single branch, returns nil if false
(when (> x 0) (println "x is positive"))

;; Truthiness — only nil and false are falsy
(println (if 0 "truthy" "falsy"))
(println (if "" "truthy" "falsy"))
(println (if nil "truthy" "falsy"))

;; cond — multi-way branching
(defn describe [n]
  (cond (< n 0) "negative" (= n 0) "zero" :else "positive"))

(println (describe -3))
(println (describe 0))
(println (describe 42))
