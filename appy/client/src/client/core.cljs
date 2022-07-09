(ns client.core
    (:require
     [reagent.core :as reagent :refer [atom]]
     [reagent.dom :as rdom]
     [client.navbar.header :refer [header]]
     [client.content.content :refer [content]]
     [client.footer.footer :refer [footer]]))

(enable-console-print!)

(defn App []
  [:div.body
   [:div.cover.black]
   [:video.video-bg {:src "img/coast.mp4" :type "video/mp4" ;; :poster "img/minimal.jpg" 
                     :autoPlay true
                     :loop true :controls false :preload "auto"}]
   [:div.main
    [header]
    [content]
    [footer "Glenn-Po" "https://glenn-po.github.io"]]])



(rdom/render [App]
           (. js/document (getElementById "app")))




(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
