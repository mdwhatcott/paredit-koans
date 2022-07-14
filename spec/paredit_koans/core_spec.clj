(ns paredit-koans.core-spec
  (:require [paredit-koans.core :refer :all]
            [speclj.core :refer :all]))

; Pre-requisites:
; 1. Navigation from form to form w/ ⌘ + left/right arrows
; 2. Expand/contract selection w/ ⌥ + up/down arrows
; 3. Backspace & Delete (w/ ⌥)
; 4. Formatter: ⌘⌥l

(describe "Structural Editing with Paredit"
  (it "Move Form Up/Down: ⇧⌘↑ [and] ⇧⌘↓"
    (should= [:a :b :c [:d :e] :f]
             [:b [:e :d] :c :a :f]))

  #_(it "Raise: ⌘'" (should= :d [:a :b :c :d :e :f :g]))

  #_(it "Wrap Quotes: ⇧⌘\"" (should= ":a" :a))
  #_(it "Wrap Square: ⇧⌘[" (should= [:a] :a))
  #_(it "Wrap Curly: ⇧⌘{" (should= #{:a} :a))
  #_(it "Wrap List: ⇧⌘(" (should= (print "") ""))

  #_(it "Kill: ⌥⌘k"
      (should= [:a :b :c :g]
               [:a :b :c :d :e :f :g]))

  #_(it "Split: ⌃⌥s"
      (should= [[:a :b] [:c :d]]
               [[:a :b :c :d]]))

  #_(it "Join: ⌃⌥j"
      (should= [[:a :b :c :d]]
               [[:a :b] [:c :d]]))

  #_(it "Splice: ⌥s"
      (should= [1 2 3 4 5]
               [[1 2 3 4 5]]))

  #_(it "Thread: ⌃⌥,"
      (should= (->> (range) (map #(* % %)) (filter even?) (take 10) (reduce +))
               (reduce + (take 1234 (filter even? (map #(* % %) (range))))))

      #_(should= (-> "a b c d" .toUpperCase (.replace "A" "X") (.split " ") first)
                 (first (.split (.replace (.toUpperCase "a b c d") "A" "Q") " "))))

  #_(it "Un-thread: ⌃⌥."
      (should= (reduce + (take 10 (filter even? (map #(* % %) (range)))))
               (->> (range) (map #(* % %)) (filter even?) (take 1234) (reduce +)))

      #_(should= (first (.split (.replace (.toUpperCase "a b c d") "A" "Q") " "))
                 (-> "a b c d" .toUpperCase (.replace "A" "X") (.split " ") first)))

  #_(it "Slurp Forwards: ⇧⌘k"
      (should= [[1 2 3 4 5]]
               [[1] 2 3 4 5]))

  #_(it "Barf Forwards: ⇧⌘j"
      (should= [[1] 2 3 4 5]
               [[1 2 3 4 5]]))

  #_(it "Slurp Backwards: ⌃⌘j"
      (should= [[1 2 3 4 5]]
               [1 2 3 4 [5]]))

  #_(it "Barf Backwards: ⌃⌘k"
      (should= [1 2 3 4 [5]]
               [[1 2 3 4 5]]))

  #_(it "Cycle Collection Type: ⇧⌘c [must assign in keymap]"
      (should= [{1 2} #{3 4} [5 6]]
               [#{1 2} [3 4] {5 6}]))

  )
