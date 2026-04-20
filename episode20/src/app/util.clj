(ns app.util
  (:require [clojure.string :as str]))

;; A small utility namespace — the kind every project grows.
;; File path: src/app/util.clj   ↔   namespace: app.util

(defn shout
  "Uppercase s and add an exclamation mark."
  [s]
  (str (str/upper-case s) "!"))

(defn slugify
  "Turn a phrase into a URL-friendly slug."
  [s]
  (-> s
      str/lower-case
      str/trim
      (str/replace #"\s+" "-")
      (str/replace #"[^a-z0-9-]" "")))

(defn wrap
  "Wrap s with the same character on both sides."
  [ch s]
  (str ch s ch))

(def version "0.1.0")
