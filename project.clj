(defproject paredit-koans "0.1.0-SNAPSHOT"
  :description "Paredit Koans"
  :url "https://github.com/mdwhatcott/paredit-koans"
  :license {:name "MIT" :url "https://opensource.org/licenses/MIT"}
  :main paredit-koans.core
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :profiles {:dev {:dependencies [[speclj "3.4.1"]]}}
  :plugins [[speclj "3.4.1"]]
  :test-paths ["spec"])
