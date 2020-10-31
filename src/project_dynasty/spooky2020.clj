(ns project-dynasty.spooky2020
  (:require [project-dynasty.brute   :as brute]
            [project-dynasty.cipher  :as cipher]
            [project-dynasty.data    :as data]
            [project-dynasty.strings :as strings]))

(def spooky "8BFGTY4PLU67-RTYO06.45:GN63-74PHGJI E67-:F563-21-574.9 ER34.6-DER8+WEST U.5 -RTG10 RTH8-4 6T.WR4564-21 +G134.2 RT55.4 GDW THE42.1LY 764.2Y-45TG4.BTJ-Y.6ORT437.1D341-67.Y5DS 243 45TY-3234")

;; ⇒ {\space 13,
;;     \B 2,
;;     \D 4,
;;     \E 5,
;;     \F 2,
;;     \G 7,
;;     \H 3,
;;     \I 1,
;;     \J 2,
;;     \+ 2,
;;     \L 2,
;;     \- 13,
;;     \. 13,
;;     \N 1,
;;     \O 2,
;;     \0 2,
;;     \P 2,
;;     \1 7,
;;     \2 7,
;;     \R 8,
;;     \3 9,
;;     \S 2,
;;     \4 19,
;;     \T 12,
;;     \5 10,
;;     \U 2,
;;     \6 11,
;;     \7 7,
;;     \W 3,
;;     \8 3,
;;     \9 1,
;;     \Y 7,
;;     \: 2}

