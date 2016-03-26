# cljs-vdom-to-html

Example usage:

```clojure
(ns my-project.core
  (:require [vdom-to-html.core :refer [to-html]]
            cljsjs.virtual-dom))

(println (to-html (js/virtualDom.VNode. "a")))
; "<a></a>"
```
