;; Episode 14: map, filter, reduce
;; Clojure for Beginners in Neovim

(println "== map ==")

(println (map inc [1 2 3 4 5]))

;; map with a named function
(defn square [n] (* n n))
(println (map square [1 2 3 4 5]))

;; map with an anonymous fn
(println (map (fn [n] (* n 10)) [1 2 3]))

;; map with the #() shorthand
(println (map #(* % 10) [1 2 3]))

(println)
(println "== filter ==")

(println (filter even? (range 10)))

;; filter with a predicate
(defn big? [n] (> n 100))
(println (filter big? [10 200 30 400 50]))

;; filter with #()
(println (filter #(> % 3) [1 2 3 4 5]))

(println)
(println "== reduce ==")

(println (reduce + [1 2 3 4 5]))

;; reduce with an initial value
(println (reduce + 100 [1 2 3 4 5]))

;; reduce to find the max
(println (reduce max [3 1 4 1 5 9 2 6]))

;; reduce to build a map
(println (reduce (fn [acc n] (assoc acc n (* n n)))
                 {}
                 [1 2 3 4]))

(println)
(println "== pipeline: orders ==")

(def orders
  [{:id 1 :paid? true  :total 40}
   {:id 2 :paid? false :total 25}
   {:id 3 :paid? true  :total 80}
   {:id 4 :paid? true  :total 15}])

(def paid-orders (filter :paid? orders))
(def totals (map :total paid-orders))
(def revenue (reduce + totals))

(println "paid orders:" (count paid-orders))
(println "totals:" totals)
(println "revenue:" revenue)
