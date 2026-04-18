;; Episode 13: Destructuring
;; Clojure for Beginners in Neovim

(println "== vector destructuring ==")
(let [[x y z] [1 2 3]]
  (println "x:" x "y:" y "z:" z))

;; Rest args with &
(let [[head & others] [10 20 30 40]]
  (println "head:" head)
  (println "others:" others))

(println)
(println "== map destructuring ==")

(let [{:keys [name age]} {:name "Ada" :age 30}]
  (println name "is" age))

;; Default values with :or
(let [{:keys [name role] :or {role "unknown"}} {:name "Bob"}]
  (println name "-" role))

(println)
(println "== destructuring in function params ==")

(defn greet [{:keys [name]}]
  (str "Hello, " name "!"))

(println (greet {:name "Ada" :age 30}))

;; Nested destructuring
(defn describe [{:keys [name address]}]
  (let [{:keys [city]} address]
    (println name "lives in" city)))

(describe {:name "Ada" :address {:city "London"}})

(println)
(println "== :as keeps the whole thing ==")

(defn log-user [{:keys [name] :as user}]
  (println "Name:" name)
  (println "Full:" user))

(log-user {:name "Ada" :email "ada@acme.com"})
