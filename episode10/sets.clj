;; Episode 10: Sets
;; Clojure for Beginners in Neovim

;; Create a set — unique elements only
(def colors #{:red :green :blue})
(println "Colors:" colors)

;; conj adds, disj removes
(println "Add yellow:" (conj colors :yellow))
(println "Remove red:" (disj colors :red))

;; Duplicates are ignored
(println "Add red again:" (conj colors :red))

;; Membership — sets are functions of their elements
(println "Has blue?" (colors :blue))
(println "Has pink?" (colors :pink))
(println "Contains?" (contains? colors :green))

;; Set operations with clojure.set
(require '[clojure.set :as set])

(def frontend #{:html :css :js :react})
(def backend #{:java :python :js :sql})

(println "Union:" (set/union frontend backend))
(println "Intersection:" (set/intersection frontend backend))
(println "Frontend only:" (set/difference frontend backend))
