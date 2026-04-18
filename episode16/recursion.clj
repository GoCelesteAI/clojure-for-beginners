;; Episode 16: Recursion and loop/recur
;; Clojure for Beginners in Neovim

(println "== factorial ==")

(defn factorial [n]
  (loop [i n acc 1]
    (if (zero? i)
      acc
      (recur (dec i) (* acc i)))))

(println (factorial 5))
(println (factorial 10))

(println)
(println "== big factorials — no stack overflow ==")

;; recur reuses the stack frame, so huge n just works
(println (factorial 20N))

(println)
(println "== sum-to ==")

(defn sum-to [n]
  (loop [i 1 total 0]
    (if (> i n)
      total
      (recur (inc i) (+ total i)))))

(println (sum-to 10))
(println (sum-to 100))
(println (sum-to 1000))

(println)
(println "== tree walker — count the leaves ==")

(def tree
  [:branch
   [:leaf 1]
   [:branch
    [:leaf 2]
    [:leaf 3]]
   [:leaf 4]])

(defn count-leaves [root]
  (loop [stack [root] n 0]
    (if (empty? stack)
      n
      (let [node (peek stack) rest-stack (pop stack)]
        (if (= :leaf (first node))
          (recur rest-stack (inc n))
          (recur (into rest-stack (rest node)) n))))))

(println "leaves:" (count-leaves tree))

(println)
(println "== when to reach for HOFs instead ==")

;; map, filter, reduce cover most walks —
;; reach for loop/recur when you need custom flow.
(println (reduce + (range 1 11)))
(println (reduce * 1 (range 1 6)))
