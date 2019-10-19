(ns core
  (:require [quil.core :as q]
            [dynamic :as d])
  (:gen-class))

(q/defsketch main
  :title "sketch"
  :setup d/setup
  :draw d/draw
  :size [900 900])

(defn refresh
  []
  (use :reload 'dynamic)
  (.loop main))
