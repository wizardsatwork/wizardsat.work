(ns magic-server.pages.wizardsatwork.html.index
  (:require [magic-server.pages.wizardsatwork.html.head :as head]
            [magic-server.pages.wizardsatwork.html.header :as header]
            [magic-server.utils.core :refer [ln]]
            [magic-server.pages.wizardsatwork.i18n :refer [menu-items
                                                           title
                                                           description
                                                           wizards
                                                           contact
                                                           at
                                                           work]]))

(def file "index.html")

(def routes
  (str
    (ln "  location ~* ^/(about|contact) {")
    (ln "    try_files /wizardsatwork$uri /wizardsatwork/index.html;")
    (ln "  }")
    (ln "  location / {")
    (ln "    try_files /wizardsatwork$uri =404;")
    (ln "  }")
    (ln "  location = / {")
    (ln "    try_files /wizardsatwork/index.html =404;")
    (ln "  }")
    (ln "  error_page 404 /wizardsatwork/index.html;")))

(def content
  (conj
    (head/html {:title title
                :description description})
    [:body#♥.nojs
     [:div#wrapper
      (header/html {:menu-items menu-items})
      [:div.content
       [:section#about
        [:h2 "about"]

        [:div
         [:p (str
               "we are a tribe of makers, programmers, engineers, philosophers,"
               " activists, hackers, artists, clowns, and scientists.")]

         [:p "we are wizards (and witches) at work."]

         [:h4 "mission"]
         [:div
          [:p "our goal is to magically shift paradigms."]
          [:p
           [:span "we are proud to be a part of the "]
           [:a {:href "https://wiki.hackerspaces.org"
                :target "utopia"} "make- and hackspace"]
           [:span " community."]]

          [:p
           [:span "some of us are founding members of one of the oldest hackspaces in europe, the "]

           [:a {:href "https://metalab.at"
                :target "metalab"} "metalab"]
           [:span "."]]

          [:p (str
                "freedom, creativity and constructivism are our main guiding principles "
                "and the driving force behind everything we do.")]

          [:p (str
                "we free and open source as much of our work as possible "
                "and we will proudly keep doing so.")]]]]

          (when wizards
            [:section#wizards
             [:h2 (-> wizards :title)]

             [:ul
              (for [{:keys [url slug firstname lastname job]} (wizards :list)]
                [:li {:class slug}
                 [:a {:href url
                      :target slug}
                  [:img {:src (str "/img/wizards/" slug ".jpg")
                         :alt slug}]]
                 [:p (str firstname " " lastname)]
                 [:p job]])]])

          (when at
            (let [{:keys [title list]} at]
              [:section#at
               [:h2 title]

               [:ul
                (for [{:keys [url name img]} list]
                  [:li
                   [:a {:href url
                        :target name}
                    (when img
                      [:img {:src (str "/img/at/" img)
                             :alt name}])]])]]))
          (when work
            (let [{:keys [title list]} work]
              [:section#work
               [:h2 title]

               [:ul
                (for [{:keys [url name description img]} list]
                  [:li
                   [:a {:href url
                        :target name}
                    (when img
                      [:img {:src (str "/img/work/" img)}])]

                   [:div
                    (when name
                      [:h3 name])
                    (when description
                      (for [paragraph description]
                        [:p paragraph]))]])]]))

          (when contact
            (let [{:keys [title email]} contact]

              [:section#contact
               [:h2 title]

               [:p
                [:span "If you have questions or suggestions just contact us via "]
                [:a {:href email} "email"]]
               [:p
                [:span "Found a bug on this homepage? File an issue on "]
                [:a {:href "https://github.com/wizardsatwork/wizardsat.work/issues"
                     :target "github wizardsat.work"} "github"]]]))]

      [:footer.main "wizards ♥ work"]]

     [:script
      (str
        "var d = document;"
        "var b = d.body;"
        "var s = d.createElement('script');"
        "b.className = b.className.replace('nojs', 'js');"
        "s.src = '/js/main.js';"
        "b.appendChild(s);")]]))