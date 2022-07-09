(ns client.navbar.header)


(defn site-lang []
  [:ul.nav.navbar-nav
   [:li.dropdown
    [:a.dropdown-toggle.btn.text-white {:type "button" :role "button" :data-bs-toggle "dropdown"
                                        :style {:font-size "24px"}
                                        :id "dropdown-lang-button" :aria-expanded "false"}
     [:img {:src "img/flags/US.png" :style {:height "28px"}}]
     " English (US) "
     [:b.caret]]
    [:ul.dropdown-menu.px-1.py-3 {:aria-labelledby "dropdown-lang-button"}
     [:li[:a {:href "#"} [:img {:src "img/flags/DE.png"}] " Deutsch "]]
     [:li[:a {:href "#"} [:img {:src "img/flags/GB.png"}] " English(UK) "]]
     [:li[:a {:href "#"} [:img {:src "img/flags/FR.png"}] " Français "]]
     [:li[:a {:href "#"} [:img {:src "img/flags/RO.png"}] " Română "]]
    ;;  [:li.divider]
    ;;  [:li[:a {:href "#"} [:img {:src "img/flags/ES.png"}] " Español "] [:span.label.label-default "soon"]]
    ;;  [:li[:a {:href "#"} [:img {:src "img/flags/BR.png"}] " Português "] [:span.label.label-default "soon"]]
    ;;  [:li[:a {:href "#"} [:img {:src "img/flags/JP.png"}] " 日本語 "] [:span.label.label-default "soon"]]
    ;;  [:li[:a {:href "#"} [:img {:src "img/flags/TR.png"}] " Türkçe "] [:span.label.label-default "soon"]]
     ]]])

(defn navbar []
  [:ul.nav.navbar-nav.ms-auto
   [:li.nav-item.nav-link.text-md.m-2
    [:a [:i.bi.bi-facebook] " Share"]]
   [:li.nav-item.nav-link.text-md.m-2 
    [:a [:i.bi.bi-twitter] " Tweet"]]
   [:li.nav-item.nav-link.text-md.m-2 
    [:a [:i.bi.bi-envelope-fill] " Email"]]])

(defn header []
  [:nav.navbar.navbar-expand-lg.navbar-transparent.sticky-top.px-4.px-lg-5.py-4.py-lg-4.wow.fadeIn.header 
   {:role "navigation" :data-wow-delay "150ms"}
   [:div.container
    ;;Toggle for mobile display
    [:div.navbar-header.ms-auto
     [:button.navbar-toggler.shadow-none {:type "button", :data-bs-toggle "collapse"
                             :data-bs-target "#navbar-collapse-1"}
      [:span.visually-hidden "Toggle Navigation"]
      [:span>i.bi.bi-list {:style {:font-size "32px", :color "var(--light-color)"}}]]]
    
    [:div.collapse.navbar-collapse {:id "navbar-collapse-1"}
     [site-lang]
     [navbar]]]])

