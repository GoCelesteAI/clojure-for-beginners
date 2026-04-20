(ns app.core
  (:require [clojure.string :as str]))

(defn greet
  "Capitalize name and wrap it in a friendly hello."
  [name]
  (str "Hello, " (str/capitalize name) "!"))

(defn -main
  "Run with: clj -M:run  (or)  clj -M:run alice"
  [& args]
  (println (greet (or (first args) "friend"))))
