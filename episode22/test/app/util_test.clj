(ns app.util-test
  (:require [clojure.test :refer [deftest is testing]]
            [app.util :as u]))

(deftest shout-test
  (testing "uppercases and appends a bang"
    (is (= "HI!" (u/shout "hi")))
    (is (= "HELLO WORLD!" (u/shout "hello world")))))

(deftest slugify-test
  (testing "lowercase, trim, replace spaces, strip punctuation"
    (is (= "hello-world"     (u/slugify "Hello World")))
    (is (= "hello-world"     (u/slugify "  Hello,  World!  ")))
    (is (= "the-little-schemer" (u/slugify "The Little Schemer")))))

(deftest wrap-test
  (testing "wraps with the same character on both sides"
    (is (= "*hi*" (u/wrap "*" "hi")))
    (is (= "|a|"  (u/wrap "|" "a")))))
