(ns magic-server.pages.wizardsatwork.css.layouts.tablet
  (:require [garden.stylesheet :refer [at-media]]
            [garden.units :refer [px percent em]]))

(def style
  [(at-media
     {:min-width (px 400)}
     [[:nav.main
       [:ul
        [:li {:float "left"
              :margin [[(em 0.2) (em 0.2) 0]]
              :width "auto"}
         [:a {:margin [[(em 0.2) 0 0]]}]]]
       [:.logo {:display "none"
                :width (px 30)}]

       [:.toggle {:display "none"}]]

      [:section#wizards
       [:ul
        [:li {:float "left"
              :margin [[0 (percent 1) (em 1)]]
              :width (percent 48)}]]]])
   (at-media
     {:min-width (px 440)}
     [:nav.main
      [:ul
       [:li
        [:a {:font-size (em 1)}]]]])])