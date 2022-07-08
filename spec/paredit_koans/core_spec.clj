(ns paredit-koans.core-spec
  (:require [paredit-koans.core :refer :all]
            [speclj.core :refer :all]))

(def command "⌘")
(def control "⌃")
(def option "⌥")
(def shift "⇧")
(def up "↑")
(def down "↓")

; Pre-requisites:
; 1. Navigation from form to form w/ ⌘ + left/right arrows
; 2. Expand/contract selection w/ ⌥ + up/down arrows

(describe "Structural Editing with Paredit"
  (it "#1 - Move Form Up/Down: ⇧⌘↑ [and] ⇧⌘↓"
    (should= [:a :b :c [:d :e] :f]
             [:b [:e :d] :c :a :f]))

  ;(it "#2 - Raise: ⌘'" (should= :d [:a :b :c :d :e :f :g]))

  ;(it "#3 - Wrap Quotes: ⇧⌘\"" (should= ":a" :a))
  ;(it "#4 - Wrap Square: ⇧⌘[" (should= [:a] :a))
  ;(it "#5 - Wrap Curly: ⇧⌘{" (should= #{:a} :a))
  ;(it "#6 - Wrap List: ⇧⌘(" (should= (print "") ""))

  ;(it "#7 - Kill: ⌥⌘k"
  ;  (should= [:a :b :c :g]
  ;           [:a :b :c :d :e :f :g]))

  ;(it "#5 - Split - ⌃⌥s"
  ;  (should= [[:a :b] [:c :d]]
  ;           [[:a :b :c :d]]))

  ;(it "#6 - Join - ⌃⌥j"
  ;  (should= [[:a :b :c :d]]
  ;           [[:a :b] [:c :d]]))
  )
