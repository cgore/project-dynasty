(ns dynasty.data)

(def systems
  {:conflux {}
   :formidine-rift {:alpha  {:system {:name "Eafots EU-R c4-1"}
                             :site {:body "C 2" :coordinates {:lat -34.2070 :lon -77.6690}}
                             :logs [{:date "21/08/3270"
                                     :text "“Why the hell are we out here? No one seems to know. It’s taken months and still we’re not there, wherever ‘there’ is. We’re dropping these beacons. Supposedly nobody knows what they’re for. If they do they ain’t telling. Makes no sense, there’s nothing out here… and who would come all this way anyway?”"}
                                    {:date "28/08/3270"
                                     :text "We’re still travelling. Jump drive malfunctioned today, that made an interesting diversion. It’s going to take a while to fix. This area of space is freaking me out. Could have sworn I heard some weird voices in the last jump. We are a long way from home. We’re struggling to plot a course now, we’re leaving the galactic arm and the jumps are getting longer.”"}
                                    {:date "07/09/3270"
                                     :text "“Finally fixed the drive. More monotony. Can’t believe it’s nearly six months since we set out from Riedquat. Did I say Riedquat? I meant Reorte. It’s getting to me, this endless emptiness. The guys are showing the strain. Three more months before we can turn and head back. The stars are thinning out, you can see the whole galaxy just hanging there…”"}
                                    {:date "22/09/3270"
                                     :text "“The darkness grows. The galaxy is faint and dim behind us. I’m told this place has been nicknamed the Formidine Rift. Apparently that means fear in some old Earth language. It’s an apt name, some of the guys are going space crazy out here in the void. We had to sedate one guy, he went completely doolally. We’ve not seen another soul for weeks. Just us and this ship… alone… in the darkness…”"}
                                    {:date "07/10/3270"
                                     :text "“I’m scared… help me someone… I can’t bear another jump. The lights in witch-space are coming for me, the lights… always the lights… they’re calling to me… a siren song… I must join them…”"}
                                    {:date "08/10/3270"
                                     :text "AUTOMATED TELEMETRY REPORT: CANOPY BLAST BOLTS ACTIVATED. LIFE SUPPORT MALFUNCTION. CREW VITAL SIGNS TERMINATED. SHIP SYSTEMS ENGAGING STANDBY MODE. DISTRESS BEACON ACTIVATED."}]}
                    :beta   {:system {:name "Eafots LZ-H b10-0"}
                             :site {:body "D 1" :coordinates {:lat -23.0615 :lon -174.8785}}}
                    :gamma  {:system {:name "Eafots RA-G b11-0"}
                             :site {:body "3" :coordinates {:lat -17.8739 :lon -76.052}}}
                    :delta  {:system {:name "Eafots GL-Y e2"}
                             :site {:body "6" :coordinates {:lat 21.2752 :lon 19.066}}}
                    :zurara {:system {:name "Syreadiae JX-F c0"
                                      :coordinates {:cartesian {:x -9529.4375 :y -64.5 :z -7428.4375}
                                                    :galactic {:r 12082.881 :l 127.937 :b -0.306}
                                                    :equatorial {:ra {:string "1h 34m 29.354s"
                                                                      :h 1 :m 34 :s 29.354}
                                                                 :dec {:string "62° 8' 48.403\""
                                                                       :deg 62 :m 8 :s 48.403}}}}}}
   :hawkins-gap {}})
