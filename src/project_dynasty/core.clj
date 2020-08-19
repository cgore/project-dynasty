(ns project-dynasty.core
  (:require [project-dynasty.brute   :as brute]
            [project-dynasty.cipher  :as cipher]
            [project-dynasty.data    :as data]
            [project-dynasty.strings :as strings]))

(def form-rift
  (-> data/systems :formidine-rift (select-keys [:alpha :beta :gamma :delta])))

(def form-rift-logs
  (->> form-rift
       (map (fn [[k v]] (-> v :logs)))
       flatten
       (map :text)
       (filter (complement nil?))))

(def form-rift-logs-stripped
  (->> form-rift-logs
       (map strings/stripped)))

(comment
  (brute/any-caesar? #"syreadiae" form-rift-logs-stripped)
  (cipher/keyed-caeser "exodus" (-> data/systems :formidine-rift :delta :ucb))
  (map #(cipher/keyed-caeser "exodus" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "raxxla" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "eafots" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "zurara" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "syreadiae" %) form-rift-logs-stripped)
  )
