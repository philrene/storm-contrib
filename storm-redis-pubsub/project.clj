(defproject storm-redis-pubsub "0.0.3-SNAPSHOT"
  :source-paths ["src/clj"]
  ;:jvm-opts ["-Djava.library.path=/usr/local/lib:/opt/local/lib"]
  :aot :all
  :java-source-paths ["src/jvm"]
  :profiles {:dev
             {:dependencies
              [[storm "0.8.1"] 
               [org.clojure/clojure "1.4.0"]
               [redis.clients/jedis "2.0.0"]
               ]}}
  :min-lein-version "2.0.0"
  :javac-options {:debug "true"}
 ) 

