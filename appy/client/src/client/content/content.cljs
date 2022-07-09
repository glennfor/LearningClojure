(ns client.content.content)


(defn content []
  [:div.content.text-center.mt-5
   [:h1.logo.mt-5.mb-2 "Simba" ];; [:span>i.bi.bi-arrow-right-circle-fill]]
   [:div.content.mt-2.mb-5
    [:h4.motto.m-3 "Delivering the perfect solutions for your business needs."]
    [:div.subscribe.m-2.mt-5
     [:h5.info-text "Join the waiting list for the beta. We will keep you posted."]
     [:div.row
      [:div.form-container
       [:form.form {:role "form" :id "email-form"}
        [:div.form-group
         [:label.visually-hidden {:for "email"} "Email Address"]
         [:input.form-control.transparent. {:type "email" :name "email" :placeholder "Your Email here ..."}]]
        [:div.form-group
         [:button.btn.btn-danger {:type "submit"} "Notify Me"]]]]]]]])