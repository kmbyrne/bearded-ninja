(ns closure-practice.core-test
  (:require [clojure.test :refer :all]
            [closure-practice.core :refer :all]))

(deftest a-test
  (testing "FIXED"
    (is (= 1 1))))
