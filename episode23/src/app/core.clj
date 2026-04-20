(ns app.core
  (:require [cheshire.core :as json]
            [clojure.java.io :as io]))

;; Adding a dependency: cheshire parses JSON into Clojure data.
;; deps.edn → {cheshire/cheshire {:mvn/version "5.13.0"}}

(defn load-book
  "Read resources/book.json and parse it as a Clojure map.
   The second argument `true` to parse-string keywordizes keys."
  []
  (-> (io/resource "book.json")
      slurp
      (json/parse-string true)))

(defn -main
  "Run with: clj -M:run"
  [& _]
  (let [book (load-book)]
    (println "Title :" (:title book))
    (println "Author:" (:author book))
    (println "Tags  :" (clojure.string/join ", " (:tags book)))
    (println "Pages :" (count (:pages book)))))
