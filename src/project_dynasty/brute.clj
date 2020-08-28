(ns project-dynasty.brute
  (:require [project-dynasty.cipher :as cipher]
            [project-dynasty.strings :as strings]))

(defn any-caesar?
  ([needle haystack]
   (flatten (map #(any-caesar? needle haystack %)
                 (range 27))))
  ([needle haystack offset]
   (->> haystack
        (map #(cipher/caesar offset %))
        (filter #(re-matches needle %)))))

(defn any-straddled?
  ([needle haystack]
   (flatten (map #(any-straddled? needle haystack %)
                 (range 1 16))))
  ([needle haystack width]
   (flatten (map #(any-straddled? needle haystack width %)
                 (range 0 width))))
  ([needle haystack width offset]
   (->> haystack
        (map #(strings/straddled % width offset))
        (filter #(re-matches needle %)))))
