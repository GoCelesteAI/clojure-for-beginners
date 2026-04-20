;; Episode 17: Function Composition and Partial Application
;; Clojure for Beginners in Neovim

(println "== comp ==")

;; comp composes functions right-to-left
(def inc-then-str (comp str inc))
(println (inc-then-str 5))

;; build a bigger pipeline
(def shout (comp clojure.string/upper-case clojure.string/trim))
(println (shout "  hello  "))

(println)
(println "== partial ==")

;; partial pre-fills arguments
(def add10 (partial + 10))
(println (add10 5))

;; partial with map — multiply everything by 3
(def times3 (partial * 3))
(println (map times3 [1 2 3 4]))

(println)
(println "== juxt ==")

;; juxt applies many fns to one input, returns a vector of results
(def bounds (juxt first last))
(println (bounds [1 2 3 4 5]))

;; pull multiple keys from a map
(def name-and-age (juxt :name :age))
(println (name-and-age {:name "Ada" :age 30 :city "London"}))

(println)
(println "== complement ==")

;; complement flips a predicate
(def not-empty? (complement empty?))
(println (not-empty? [1 2 3]))
(println (not-empty? []))

(println)
(println "== pipeline: cleaning names ==")

(def clean-name
  (comp clojure.string/capitalize
        clojure.string/trim
        clojure.string/lower-case))

(def names ["  ADA  " "grace" " LiNuS "])
(println (map clean-name names))

(println)
(println "== partial + map: add prefix ==")

(def tag (partial str "user:"))
(println (map tag ["ada" "grace" "linus"]))
