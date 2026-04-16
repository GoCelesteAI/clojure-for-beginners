;; Episode 1: Hello REPL
;; Clojure for Beginners in Neovim

(println "Hello, Clojure!")

(defn greet [name]
  (str "Hello, " name "!"))

(println (greet "World"))

(println "2 + 3 =" (+ 2 3))
