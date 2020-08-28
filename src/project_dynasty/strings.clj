(ns project-dynasty.strings
  (:require [clojure.string :as str]))

(defn stripped [string]
  (apply str (filter #(Character/isLetter %)
                     (str/lower-case string))))

(defn straddled
  ([string width]
   (straddled string width 0))
  ([string width offset]
   (apply str (map #(nth % offset) (partition width string)))))
