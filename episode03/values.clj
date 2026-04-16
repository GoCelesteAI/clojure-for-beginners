;; Episode 3: Values, Not Variables
;; Clojure for Beginners in Neovim

;; def — bind a name to a value at the top level
(def pi 3.14159)
(def radius 5)

;; Use them to compute the area of a circle
(println "Circle area:" (* pi radius radius))

;; let — bind names locally, just for the body of one expression
(let [w 10
      h 4]
  (println "Rectangle area:" (* w h)))

;; Kebab-case names are idiomatic in Clojure
(def first-name "Ada")
(def last-name "Lovelace")
(println "Name:" (str first-name " " last-name))

;; let can shadow a def — but only inside the let block
(let [pi 3]
  (println "Shadow inside:" pi))
(println "pi outside is still:" pi)
