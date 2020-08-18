(ns dynasty.brute
  (:require [dynasty.cipher :as cipher]))

(defn any-ceasar?
  ([needle haystack]
   (map #(any-ceasar? needle haystack %)
        (range 27)))
  ([needle haystack offset]
   (->> haystack
        (map #(cipher/caesar % offset))
        (filter #(re-matches needle %)))))
