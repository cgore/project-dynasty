(ns project-dynasty.cipher
  (:require [project-dynasty.strings :as strings]))

(defn caesar
  "Assumes offset >=0, words entirely lowercase English characters or spaces"
  ([words] ; classical Caesar shift was 3
   (caesar 3 words))
  ([offset words]
   (let [alphabet-chars (map char "abcdefghijklmnopqrstuvwxyz")
         alphabet-shifted (->> (cycle alphabet-chars) (take 100) (drop offset))
         shifted-map (-> (zipmap alphabet-chars alphabet-shifted)
                         (assoc \space \space))]
     (apply str (map shifted-map (map char words))))))

(defn keyed-caeser [keyword words]
  (let [alphabet-chars (map char "abcdefghijklmnopqrstuvwxyz")
        keyword-chars (distinct (map char keyword))
        keyed-alphabet (distinct (concat keyword-chars alphabet-chars))
        keyed-map (-> (zipmap keyed-alphabet alphabet-chars)
                      (assoc \space \space))]
    (apply str (map keyed-map (map char (strings/stripped words))))))
