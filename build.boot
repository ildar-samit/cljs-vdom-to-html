(set-env!
 :resource-paths #{"src"}
 :dependencies '[[adzerk/bootlaces "0.1.13" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])

(def +version+ "0.1.0-SNAPSHOT")
(bootlaces! +version+)

(task-options!
 pom  {:project     'ildar/vdom-to-html
       :version     +version+
       :description "Turn Virtual DOM nodes into HTML"
       :url         "https://github.com/ildar-samit/cljs-vdom-to-html.git"})
