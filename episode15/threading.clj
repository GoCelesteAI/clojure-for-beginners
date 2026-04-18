;; Episode 15: Threading Macros -> and ->>
;; Clojure for Beginners in Neovim

(println "== the nested mess ==")

;; Read this inside-out: reverse, then drop 1, then take 3
(println (take 3 (drop 1 (reverse [1 2 3 4 5 6]))))

(println)
(println "== thread-last ->> ==")

;; Same thing, top-to-bottom
(println (->> [1 2 3 4 5 6]
              reverse
              (drop 1)
              (take 3)))

;; A map/filter/reduce pipeline
(println (->> (range 1 11)
              (filter even?)
              (map #(* % %))
              (reduce +)))

(println)
(println "== thread-first -> ==")

;; -> passes the value as the FIRST argument
(def user {:name "Ada" :age 30})

(println (-> user
             (assoc :role "engineer")
             (update :age inc)))

;; String transforms — also first-arg style
(println (-> "  Hello, World!  "
             .trim
             (.toLowerCase)))

(println)
(println "== first vs last — when to use which ==")

;; -> for maps and strings (first-arg APIs)
;; ->> for sequences (last-arg APIs: map, filter, reduce)

(def orders
  [{:id 1 :paid? true  :total 40}
   {:id 2 :paid? false :total 25}
   {:id 3 :paid? true  :total 80}
   {:id 4 :paid? true  :total 15}])

;; Rewrite Episode 14's pipeline as one threaded expression
(println (->> orders
              (filter :paid?)
              (map :total)
              (reduce +)))
