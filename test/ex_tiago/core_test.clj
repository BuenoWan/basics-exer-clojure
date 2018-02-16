(ns ex-tiago.core-test
(:use midje.sweet)
(:require [clojure.test :refer :all]
          [ex-tiago.core :refer :all]))



(facts "about `triangle`"
  (fact "Three equal sides is an equilateral, only two equal sides is isosceles and all different sides is scalene."
    (triangle 1 1 1) => "Equilateral"
      (triangle 1 1 2) => "Isosceles"
        (triangle 1 2 3) => "Scalene"))


(facts "about `scrabble_letter`"
  (fact "toda letra é retornada com caixa baixa"
    (scrabble_letter "A") => 1
      (scrabble_letter "B") => 3
        (scrabble_letter "C") => 3
          (scrabble_letter " ") => nil))


(facts "about `scrabble_word`"
  (fact "cada letra recebe um valor"
    (scrabble_word "a") => 1
      (scrabble_word "bala") => 6
        (scrabble_word "cabbage") => 14
          (scrabble_word " ") => nil))
