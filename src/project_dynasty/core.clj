(ns project-dynasty.core
  (:require [project-dynasty.brute   :as brute]
            [project-dynasty.cipher  :as cipher]
            [project-dynasty.data    :as data]
            [project-dynasty.strings :as strings]))

(def form-rift
  (-> data/systems :formidine-rift (select-keys [:alpha :beta :gamma :delta])))

(def hawkins-gap
  (-> data/systems :hawkins-gap (select-keys [:alpha :beta :gamma :delta])))

(def form-rift-logs
  (->> form-rift
       (map (fn [[k v]] (-> v :logs)))
       flatten
       (map :text)
       (filter (complement nil?))))

(def form-rift-dates
  (->> form-rift
       (map (fn [[k v]] (-> v :logs)))
       flatten
       (map :date)
       (filter (complement nil?))))

(def hawkins-gap-logs
  (->> hawkins-gap
       (map (fn [[k v]] (-> v :logs)))
       flatten
       (map :text)
       (filter (complement nil?))))

(def hawkins-gap-dates
  (->> hawkins-gap
       (map (fn [[k v]] (-> v :logs)))
       flatten
       (map :date)
       (filter (complement nil?))
       sort
       distinct))

(def form-rift-logs-stripped
  (->> form-rift-logs
       (map strings/stripped)))

(def hawkins-gap-logs-stripped
  (->> hawkins-gap-logs
       (map strings/stripped)))

(comment
  (brute/any-caesar? #"syreadiae" form-rift-logs-stripped) ; Syreadiae

  (brute/any-caesar? #"pruaed"    hawkins-gap-logs) ; Pru Aed
  (brute/any-caesar? #"plaaaec"   hawkins-gap-logs) ; Plaa Aec
  (brute/any-caesar? #"nyeakeia"  hawkins-gap-logs) ; Nyeakeia
  (brute/any-caesar? #"prungeou"  hawkins-gap-logs) ; Prungeou
  (brute/any-caesar? #"priaaescs" hawkins-gap-logs) ; Pria Aescs
  (brute/any-caesar? #"plielao"   hawkins-gap-logs) ; Plielao
  (brute/any-caesar? #"slenguia"  hawkins-gap-logs) ; Slenguia
  

  (def winner (brute/any-caesar? #"s.+y.+r.+e.+a.+d.+i.+a.+e" form-rift-logs-stripped))
  (def winner (brute/any-caesar? #"z.+u.+r.+a.+r.+a" form-rift-logs-stripped))
  (brute/any-caesar? #"p.+r.+i.+a.+a.+e.+s.+c.+s" form-rift-logs-stripped)
  
  (brute/any-caesar? #"syreadiae" [(-> data/systems :formidine-rift :delta :ucb)])
  (brute/any-caesar? #"exodus" [(-> data/systems :formidine-rift :delta :ucb)])


  (cipher/keyed-caeser "exodus" (-> data/systems :formidine-rift :delta :ucb))
  (map #(cipher/keyed-caeser "exodus" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "raxxla" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "eafots" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "zurara" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "syreadiae" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "salome" %) form-rift-logs-stripped)
  (map #(cipher/keyed-caeser "rebecca" %) form-rift-logs-stripped)

  (-> data/systems :formidine-rift :delta :logs
      (#(map :text %))
      (nth 3)
      strings/stripped
      (strings/straddled 8)
      )

  (brute/any-straddled? #"syreadiae" form-rift-logs-stripped)

  (sort-by count form-rift-logs-stripped)

  (map (fn [log] (-> log count char)) form-rift-logs-stripped)

  (map (fn [i]
         (->> form-rift-logs-stripped
              (map count)
              (map #(mod (- % i) 255))
              (map char)
              (apply str)))
       (range 255))

  (map (fn [i]
         (->> form-rift-logs
              (map count)
              (map #(mod (- % i) 255))
              (map char)
              (apply str)))
       (range 255))

  hawkins-gap-logs

  (map int "foobar")
  )

(comment
  (def first-letters "WWFTIABSNPLWLFSWMWIIMSOI")
  (def time-sorted-first-letters "WWBLIFSFINSMTPWSIALMOWWI")
  (map (fn [x] [(cipher/keyed-caeser x first-letters)
                (cipher/keyed-caeser x time-sorted-first-letters)])
       [
        "beacon"
        "dark"
        "darkness"
        "doolally"
        "dynasty"
        "exodus"
        "exodus"
        "fear"
        "formidine"
        "frontier"
        "heart"
        "hyperdrive"
        "latin"
        "light"
        "odysseus"
        "odyssey"
        "randomius"
        "reorte"
        "riedquat"
        "signal"
        "siren"
        "soul"
        "zurara"
        "void"
        "terror"
        "evil"
        "leesti"
        ])
  )
