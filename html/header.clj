(ns magic-server.pages.wizardsatwork.html.header)

(defn html [args]
  (let [{:keys [menu-items]} args]
    [:header.main
     [:a.logo {:href "/"}
      [:img {:src "/img/wizardsatwork-logo.png"}]
      [:img {:src "/img/wizardsatwork-text.png"}]]
     (when menu-items
       [:nav.main
        [:ul
         [:li.logo
          [:img {:src "/img/wizardsatwork-logo.png"}]]
         (for [item menu-items]
           [:li
            [:a {:href (-> item :href)
                 :title (-> item :title)}
             (-> item :text)]])]

        [:div.toggle
         [:span]
         [:span]
         [:span]]])]))
