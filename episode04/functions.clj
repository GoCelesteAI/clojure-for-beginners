;; Episode 4: Functions with defn
;; Clojure for Beginners in Neovim

;; A simple function — takes one argument, returns a string
(defn greet [name] (str "Hello, " name "!"))
(println (greet "Ada"))

;; Functions can take multiple arguments and return any value
(defn add [a b] (+ a b))
(defn square [x] (* x x))
(println "Sum:" (add 10 20))
(println "Square:" (square 9))

;; A docstring describes the function — it lives between name and args
(defn cube "Return x cubed." [x] (* x x x))
(println "Cube:" (cube 4))

;; Multi-arity — different bodies for different argument counts
(defn hello
  ([] "Hello!")
  ([name] (str "Hello, " name "!")))
(println (hello))
(println (hello "World"))
