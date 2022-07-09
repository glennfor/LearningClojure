(ns client.footer.footer)

(defn footer [text, link]
  [:div.form-container.sticky-bottom.mt-5
   [:div.container.text-center.mt-5
    [:p.text-center.text-lg "© " (.getFullYear (js/Date.)) [:span.text-danger.fw-bold {:style {:text-shadow "6px 5px 3px #000000"}} " Simba "] ", Inc."]
    [:p {:style {:font-size "12px"}} "Made with " [:i.d-inline-block.bi.bi-heart-fill.text-danger.animate__animated.animate__heartBeat.animate__infinite.infinite.animate__slow] " by " [:a.fw-bold.text-white {:href link} text] "."]]])