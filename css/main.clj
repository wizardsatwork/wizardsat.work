(ns magic-server.pages.wizardsatwork.css.main
  (:require [garden.units :refer [px percent em]]
            [magic-server.pages.wizardsatwork.css.layouts.desktop :as layout-desktop]
            [magic-server.pages.wizardsatwork.css.layouts.tablet :as layout-tablet]
            [magic-server.pages.wizardsatwork.css.layouts.mobile :as layout-mobile]
            [magic-server.pages.wizardsatwork.css.reset :as reset]))

(def file "main.css")

(def colors {:body "#fefefe"
             :body-bg "#f0f0f2"
             :link "#555"
             :link-hover "#000"
             :bg "#fff"
             :heart "#f00"})

(def style [reset/style
            [:* {:box-sizing "border-box"}]

            [:body {:font-size (px 18)
                    :background-color (-> colors :body-bg)
                    :font-family ["Ubuntu" "Segoe UI" "Lucida Grande" "Helvetica" "Arial" "sans-serif"]}]

            [:a
             :a:link
             :a:visited {:color (-> colors :link)}
             [:&:hover {:color (-> colors :link-hover)}]
             [:&.active {:text-decoration "underline"}]]

            [:body {:margin 0
                    :padding 0}]

            [:h1 {:margin 0}]

            [:h2 {:font-size (em 1.3)
                  :margin [[0 0 (em 1)]]
                  :text-align "center"}]

            [:h3 {:font-size (em 1.2)
                  :margin [[0 0 (em 0.5)]]}]

            [:h4 {:font-size (em 1.2)
                  :margin [[(em 1.5) 0 (em 0.5)]]}]


            [:img {:max-height (percent 100)
                   :max-width (percent 100)}]

            [:header.main {:display "inline-block"
                           :margin [[0 0 (em 2)]]
                           :position "relative"
                           :text-align "center"}]

            [:a.logo {:display "inline-block"
                      :margin "0 auto"
                      :width (percent 80)}

             [:img {:float "left"}

              [:&:first-child {:width (percent 15)}]

              [:&:last-child {:margin [[(percent 5) 0 0 (percent -3)]]
                              :width (percent 87)}]]]

            [:div#wrapper {:margin "0 auto"
                           :max-width (px 800)
                           :width (percent 90)
                           :padding [[ (em 1) 0]]}]

            [:div.content {:border-radius (em 1)
                           :padding [[0 (em 3) (em 2)]]
                           :margin [[(em -1.5) 0 0]]}]

            [:p {:line-height (em 1.3)
                 :margin [[0 0 (em 0.5)]]}]

            [:nav.main {:border-bottom-left-radius (em 2)
                        :border-bottom-right-radius (em 2)
                        :font-size (em 1.1)
                        :position "absolute"
                        :width (percent 100)}

             [:ul {:display "inline-block"
                   :margin "0 auto"
                   :padding [[0 (em 1) (em 0.2)]]
                   :position "relative"}

              [:li {:margin [[0 (em 0.3) 0 0]]
                    :display "inline-block"
                    :width (percent 100)}

               [:a {:text-decoration "none"
                    :font-size (em 0.8)}]]]

             [:.logo {:display "none"
                      :width (px 25)}]]

            [:body.scrolled
             [:nav.main {:left 0
                         :position "fixed"
                         :top 0}
              [:.logo {:display "block"}]]]

            [:section {:display "inline-block"
                       :padding [[(em 3) 0]]
                       :text-align "center"
                       :width (percent 100)}

             [:ul
              [:li {:margin [[0 0 (em 2)]]
                    :text-align "center"}]]

             [:&#wizards
              [:img {:border-radius (em 1)}]
              [:a {:text-decoration "none"}]]

             [:&#work
              [:ul
               [:li {:clear "both"
                     :display "inline-block"
                     :float "none"
                     :margin [[0 0 (em 2)]]
                     :width (percent 100)}

                [:a {:float "left"
                     :width (percent 30)}]

                [:div {:float "right"
                       :text-align "left"
                       :width (percent 65)}]]]]]

            [:div.content {:background-color (-> colors :bg)}]

            [:header.main :nav.main {:background-color (-> colors :body-bg)}]
            [:footer.main {:color (-> colors :heart)
                           :font-size (em 1.2)
                           :margin [[(em 10) 0 0]]
                           :text-align "center"
                           :width (percent 100)}]
            [:.toggle
             [:span {:background-color (-> colors :link)}]]

            layout-desktop/style
            layout-tablet/style
            layout-mobile/style])