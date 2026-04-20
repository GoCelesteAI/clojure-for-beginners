(ns hello.core)

(defn greet [name]
  (str "Hello, " name "!"))

(defn -main [& args]
  (println "Welcome to my first Clojure project!")
  (println (greet "World"))
  (when args
    (println "Arguments:" args)
    (doseq [a args]
      (println (greet a)))))
