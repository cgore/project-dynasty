(ns dynasty.core
  (:require [dynasty.data :as data]
            [dynasty.strings :as strings]))

(def form-rift
  (-> data/systems :formidine-rift (select-keys [:alpha :beta :gamma :delta])))

(def form-rift-logs
  (->> form-rift
       (map (fn [[k v]] (-> v :logs)))
       flatten
       (map :text)
       (filter (complement nil?))))

(comment

  )
