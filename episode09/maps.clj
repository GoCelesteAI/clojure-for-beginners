;; Episode 9: Maps
;; Clojure for Beginners in Neovim

;; Create a user map with keyword keys
(def user {:name "Ada" :age 30 :lang "Clojure"})
(println "User:" user)

;; Access with get and keyword-as-function
(println "Name:" (get user :name))
(println "Age:" (:age user))

;; assoc adds or updates a key
(def user2 (assoc user :email "ada@example.com"))
(println "With email:" user2)

;; dissoc removes a key
(println "Without lang:" (dissoc user :lang))

;; update applies a function to a value
(println "Birthday:" (update user :age inc))

;; Original unchanged — maps are immutable
(println "Original:" user)

;; Nested maps with get-in
(def profile {:name "Ada" :address {:city "London" :zip "SW1"}})
(println "City:" (get-in profile [:address :city]))
