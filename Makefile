src/vdom_to_html/vdom-to-html.min.js: src/vdom_to_html/vdom-to-html.js
	node_modules/.bin/uglifyjs src/vdom_to_html/vdom-to-html.js -o src/vdom_to_html/vdom-to-html.min.js

src/vdom_to_html/vdom-to-html.js: src/vdom_to_html/vdom-to-html-main.js
	node_modules/.bin/browserify src/vdom_to_html/vdom-to-html-main.js -o src/vdom_to_html/vdom-to-html.js
