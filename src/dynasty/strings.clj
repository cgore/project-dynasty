(ns dynasty.strings
  (:require [clojure.string :as str]))

(defn stripped [string]
  (apply str (filter #(Character/isLetter %)
                     (str/lower-case string))))
