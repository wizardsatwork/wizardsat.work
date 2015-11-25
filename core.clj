(ns magic-server.pages.wizardsatwork.core
  (:require [taoensso.timbre :as timbre]
            [magic-server.pages.wizardsatwork.html.index :as page]
            [magic-server.pages.wizardsatwork.css.main :as css]
            [magic-server.builders.hiccup :as hiccup]
            [magic-server.builders.garden :as garden]
            [magic-server.builders.nginx :as nginx]
            [magic-server.builders.cljs :as cljs]
            [magic-server.builders.cljs-dev :as cljs-dev]
            [magic-server.builders.assets :as assets]))

(def dir "wizardsatwork/")

(defn build
  [dev]
  (mapv hiccup/build [{:content page/content
                       :src-file (str dir page/file)}])

  (mapv garden/build [{:content css/style
                       :src-file (str dir "css/" css/file)}])

  (mapv nginx/build [{:file "localhost"
                      :routes [page/routes]}])

  (assets/build {:src-dir "/src/magic_server/pages/wizardsatwork/assets/"
                 :dist-dir "/resources/public/wizardsatwork/"})

  (if (-> dev)
    (cljs-dev/build {:src-path "src/magic_server/pages/wizardsatwork/cljs/"
                     :dist-dir "resources/public/wizardsatwork/js/"
                     :dist-file "main.js"
                     :namespace 'magic-server.pages.wizardsatwork.cljs.core})
    (cljs/build {:src-dir ["src/magic_server/pages/wizardsatwork/cljs/"]
                 :dist-dir "resources/public/wizardsatwork/js/"
                 :dist-file "main.js"
                 :main 'magic-server.pages.wizardsatwork.cljs.core})))
