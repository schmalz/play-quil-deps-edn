(ns dynamic
  (:require [quil.core :as q]))

(def ^:private yellow [45 100 71])
(def ^:private orange [8 89 80])
(def ^:private red [1 79 86])
(def ^:private magenta [331 74 83])
(def ^:private violet [237 45 77])
(def ^:private blue [205 82 82])
(def ^:private cyan [175 74 63])
(def ^:private green [68 100 60])

(def ^:private phi (/ (+ 1 (q/sqrt 5)) 2)) ; The golden ration.

(defn setup
  []
  (q/color-mode :hsb 360 100 100 1.0))

(comment (defn draw
          []
          (q/no-loop)
          (q/background 44 10 99)
          (q/no-fill)
          (q/triangle 1 1 1 10 10 1)))

(defn- draw-triangle
  []
  (let [h (* (q/sin (q/radians 72)) 300)
        w (* (q/cos (q/radians 72)) 300)]
    (q/triangle 0 0 w h (* 2 w) 0)))

(defn draw
  []
  (q/no-loop)
  (q/background 44 10 99)
  (q/no-fill)
  (q/push-matrix)
  (q/translate 400 400)
  (q/rotate (q/radians 108))
  (draw-triangle)
  (q/pop-matrix)
  (comment (q/save "sketch.tif")))
