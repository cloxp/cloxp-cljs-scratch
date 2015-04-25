(defproject cloxp-scratch "0.1.0-SNAPSHOT"
  :description "Just the cloxp scratch project. You can try stuff out here but your real projects should got into their own folders."
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3126"]
                 [org.rksm/cloxp-com "0.1.3"]
                 [http-kit "2.1.19"]
                 [compojure/compojure "1.3.2"]]
  :source-paths ["src/clj" "src/cljs"])
