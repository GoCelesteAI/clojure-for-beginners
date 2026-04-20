(ns app.core
  (:require [app.util :as u]
            [clojure.string :refer [join]]))

;; Entry point for the project.
;; File path: src/app/core.clj   ↔   namespace: app.core

(defn make-card
  "Turn a label into a loud, sluggable display card."
  [label]
  (let [shouted (u/shout label)
        slug    (u/slugify label)
        boxed   (u/wrap "*" shouted)]
    (join "\n"
          [(str "version: " u/version)
           (str "label:   " shouted)
           (str "slug:    " slug)
           (str "boxed:   " boxed)])))

(defn -main
  "Run with: clj -M -m app.core  (or)  clj -M:run"
  [& args]
  (let [label (or (first args) "the little schemer")]
    (println (make-card label))))
