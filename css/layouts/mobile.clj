(ns magic-server.pages.wizardsatwork.css.layouts.mobile
  (:require [garden.stylesheet :refer [at-media]]
            [garden.units :refer [px percent em]]))

(def style
  (at-media
    {:max-width (px 400)}
    [:body
     [:&.menu-toggled
      [:header.main
       [:nav.main
        [:ul {:display "inline-block"}]]]]

     [:&.scrolled
      [:nav.main {:border-radius 0}]]

     [:header.main {:width (percent 100)}
      [:nav.main
       [:ul {:display "none"
             :padding [[(em 0.5) (em 1)]]
             :width (percent 100)}
        [:.logo {:position "absolute"}]]

       [:.toggle {:display "inline-block"
                  :margin "0 auto"
                  :width (px 25)}

        [:span {:border-radius (px 3)
                :display "block"
                :height (px 3)
                :margin [[(px 3) 0]]
                :width (percent 100)}]]]]]))
