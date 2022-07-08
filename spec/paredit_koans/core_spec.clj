(ns paredit-koans.core-spec
  (:require [speclj.core :refer :all]
            [paredit-koans.core :refer :all]))

(describe "Structural Editing with Paredit"
  (it "#1 - Move Form Up/Down"
    (should= [:a :b :c :d :e :f]
             [:b :c :e :a :f :d]))

  )
