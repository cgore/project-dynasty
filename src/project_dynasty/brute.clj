(ns project-dynasty.brute
  (:require [project-dynasty.cipher :as cipher]))

(defn any-caesar?
  ([needle haystack]
   (map #(any-caesar? needle haystack %)
        (range 27)))
  ([needle haystack offset]
   (->> haystack
        (map #(cipher/caesar offset %))
        (filter #(re-matches needle %)))))
