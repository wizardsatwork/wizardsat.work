(ns magic-server.pages.wizardsatwork.css.reset
  (:require [garden.units :refer (percent)]))

; Based on [Eric Meyer's reset](http://meyerweb.com/eric/thoughts/2007/05/01/reset-reloaded/)

(def reset-box-model {:margin 0
                      :padding 0
                      :border 0
                      :outline 0})

(def reset-font {:font-weight "inherit"
                 :font-style "inherit"
                 :font-family "inherit"
                 :font-size (percent 100)
                 :vertical-align "baseline"})

(def reset-body {:line-height 1})

(def reset-table {:border-collapse "separate"
                  :border-spacing 0
                  :vertical-align "middle"})

(def reset-table-cell {:text-align "left"
                       :font-weight "normal"
                       :vertical-align "middle"})

(def style [[:html
             :body
             :div :span :p :blockquote :pre
             :applet :object :iframe
             :h1 :h2 :h3 :h4 :h5 :h6
             :a :abbr :acronym :address :big :cite :code
             :del :dfn :em :img :ins :kbd :q :s :samp
             :small :strike :strong :sub :sup :tt :var
             :dl :dt :dd :ol :ul :li,
             :fieldset :form :label :legend
             :table :caption :tbody :tfoot :thead :tr :th :td
             (conj
               reset-box-model
               reset-font)]

            [:article
             :aside
             :canvas
             :details
             :figcaption
             :figure
             :footer
             :header
             :hgroup
             :menu
             :nav
             :section
             :summary
             :main
             (conj
               reset-box-model
               {:display "block"})]

            [:audio
             :canvas
             :video {:display "inline-block"
                     :*display "inline"
                     :*zoom 1}]
            [:body reset-body]
            [:ol :ul {:list-style "none"}]
            [:table (-> reset-table)]
            [:caption :th :td (-> reset-table-cell)]
            [:a
             [:img {:border "none"}]]])

