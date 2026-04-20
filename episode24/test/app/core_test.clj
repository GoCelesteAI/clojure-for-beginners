(ns app.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [app.core :as c]))

(deftest greet-test
  (testing "greets with capitalized name + exclamation"
    (is (= "Hello, Alice!" (c/greet "alice")))
    (is (= "Hello, World!" (c/greet "world")))
    (is (= "Hello, Bob!"   (c/greet "BOB")))))
