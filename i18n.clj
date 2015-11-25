(ns magic-server.pages.wizardsatwork.i18n)

(def menu-items [{:href "#♥"       :text "about"   :title "What we are"}
                 {:href "#wizards" :text "wizards" :title "Who we are"}
                 {:href "#at"      :text "at"      :title "Where we are"}
                 {:href "#work"    :text "work"    :title "What we do"}
                 {:href "#contact" :text "contact" :title "How we communicate"}])


(def title "Wizards@Work")
(def description "Wizards@Work - Magically shifting paradigms")

(def wizards {:title "wizards"
              :list [{:nick "wizard23"
                      :slug "wizard23"
                      :first:name "philipp"
                      :last:name "tiefenbacher"
                      :url "http://wizards23.net"
                      :job "ceo"}
                     {:nick "j"
                      :slug "j"
                      :first:name "jay"
                      :last:name "vaughan"
                      :job "cto"}
                     {:nick "jascha"
                      :slug "jascha"
                      :first:name "jascha"
                      :last:name "ehrenreich"
                      :url "https://jaeh.at"
                      :job "full stack programmer"}
                     {:nick "tompeak"
                      :slug "tompeak"
                      :first:name "tom"
                      :last:name "peak"
                      :url "http://tompeak.com"
                      :job "programmer, graphics"}
                     {:nick "danny"
                      :slug "danny"
                      :first:name "daniela"
                      :last:name "weiss"
                      :job "graphics"}]})

(def at {:title "at"
         :list [{:name "metalab"
                 :url "https://metalab.at"
                 :img "metalab.png"}
                {:name "hackerspaceshop"
                 :url "http://hackerspaceshop.com"
                 :img "hackerspaceshop.png"}
                {:name "raumzeitlabor"
                 :url "http://raumzeitlabor.de"
                 :img "raumzeitlabor.png"}]})


(def work {:title "work"
           :list [{:name "magicshifter"
                   :img "magicshifter.jpg"
                   :url "http://magicshifter.net"
                   :description ["lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"]}

                  {:name "evocell"
                   :img "evocell.jpg"
                   :url "https://wizard23.github.io/evocell/cellspace.html"
                   :description ["lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"]}

                  {:name "printables"
                   :img "printables.jpg"
                   :url "http://www.thingiverse.com/wizard23/designs"
                   :description ["lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"
                                 "lorem ipsum dolor sit amet"]}]})

(def contact {:title "contact"
              :email "team@magicshifter.net"})