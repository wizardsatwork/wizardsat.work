(ns magic-server.pages.wizardsatwork.html.head)

(defn html [args]
  (let [{:keys [title description]} args]
    [:head
     [:meta {:charset "utf-8"}]
     [:title title]
     [:link {:rel "icon" :href "/favicon.ico"}]
     [:meta {:type "description" :value description}]
     [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
     [:meta {:property "og:title"
             :content "Wizards@Work"}]
     [:meta {:name "description"
             :property "og:description"
             :content "We are Wizards@Work. We are magically changing paradigms. We ♥ Work."}]
     [:link {:rel "stylesheet" :href "/css/main.css"}]]))