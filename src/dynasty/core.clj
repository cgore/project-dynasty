(ns dynasty.core
  (:require [dynasty.brute   :as brute]
            [dynasty.cipher  :as cipher]
            [dynasty.data    :as data]
            [dynasty.strings :as strings]))

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
  (brute/any-ceasar? #"syreadiae" form-rift-logs-stripped)
  )
