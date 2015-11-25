(ns magic-server.pages.wizardsatwork.css.layouts.desktop
  (:require [garden.stylesheet :refer [at-media]]
            [garden.units :refer [px percent]]))

(def style
  (at-media
    {:min-width (px 600)}
    [:body
     {:font-size (px 20)}
     [:section [:ul [:li {:float "left"
                          :margin [[0 (px 1)]]
                          :width (percent 31.333)}]]]]))
