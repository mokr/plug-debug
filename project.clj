(defproject net.clojars.mokr/plug-debug "0.1.0-SNAPSHOT"
  :description "A Clojure and Clojurescript library with small debug helpers"
  :url "https://github.com/mokr/plug-debug"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [org.clojure/clojurescript "1.10.844" :scope "provided"]]
  :repl-options {:init-ns plug-debug.core})
