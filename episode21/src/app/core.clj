(ns app.core
  (:require [clojure.string :as str]))

;; Parse a CSV-like person record into a map.
;; Grown one step at a time at the REPL.

(defn parse-person
  "Parse a line like \"alice,30,engineer\" into a person map."
  [line]
  (let [[name age role] (->> (str/split line #",")
                             (map str/trim))]
    {:name name
     :age  (Long/parseLong age)
     :role role}))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (println (parse-person "alice,30,engineer")))

(comment
  ;; Rich comment block — a scratchpad for REPL-driven development.
  ;; These forms are ignored at load time. Paste one into your REPL
  ;; to watch the function take shape.

  ;; Step 1 — split the line on commas
  (str/split "alice,30,engineer" #",")

  ;; Step 2 — trim each piece
  (map str/trim ["  alice" " 30 " " engineer "])

  ;; Step 3 — destructure into names
  (let [[name age role] ["alice" "30" "engineer"]]
    {:name name :age age :role role})

  ;; Step 4 — put it together
  (parse-person "  alice , 30 , engineer ")

  ;; Try a different input
  (parse-person "bob,42,baker")

  ;; A line that breaks the current implementation — redefine and retry
  ;; (parse-person "carol,thirty,dentist")
  )
