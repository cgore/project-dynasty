(ns project-dynasty.data)

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
                             :site {:body "D 1" :coordinates {:lat -23.0615 :lon -174.8785}}
                             :logs [{:date "30/08/3270"
                                     :text "“Been travelling for weeks. Passed this amazing twin nebula just recently, about the only interesting sight on this whole trip. We are a long way out now, I don’t think anyone else has been this far. Still, pay is good!”"}
                                    {:date "12/09/3270"
                                     :text "“Stars have thinned out and we’ve started dropping our cargo. Looks like some kind of long-range beacon to me. It’s all hush-hush, no questions asked stuff. Heard some of the senior bods talking about a Dynasty project. Careless talk and all that…”"}
                                    {:date "18/09/3270"
                                     :text "“Nothing prepared me for the boredom. It’s very dark out here. Really dark… darker than normal space. There’s hardly any stars ahead of us, it’s just blackness… the void.”"}
                                    {:date "01/10/3270"
                                     :text "“Picked up some kind of signal yesterday and it looks like the crew weren’t expecting it. Got them proper rattled. There’s definitely something very strange about this area of space. Won’t be sad to turn around and head horne.”"}
                                    {:date "11/11/3270"
                                     :text "“Last batch of cargo due today, but the hyperdrive has malfunctioned. We tried jumping and got yanked straight back out. So we’re stuck here, Randomius knows where…”"}
                                    {:date "29/11/3270"
                                     :text "“We can’t fix it. Hyperdrive is dead. Lucky we’re in a system with a habitable world. We’ve sent a distress call but who knows if anyone will ever hear it. We’re going to abandon ship. If anyone finds this, we’re in…” AUTOMATED TELEMETRY REPORT: POWER FAILURE."}]}
                    :gamma  {:system {:name "Eafots RA-G b11-0"}
                             :site {:body "3" :coordinates {:lat -17.8739 :lon -76.052}}
                             :logs [{:date "30/08/3270"
                                     :text "“Looks like I drew a short straw somewhere along the line. These long range missions pay well, but it’s a year out in the void. A year! We’re out far beyond the Frontier. The boys call this place the ‘Formidine Rift’. Apparently that means ‘terror’ in some oid Earth language. Nice. Just looks like more space to me.”"}
                                    {:date "12/09/3270"
                                     :text "“Finally arrived in place after five months of hyperspace travel. Now we have two months of laying a bunch of beacons before another five months travel back home. At least I’ll have enough credits to retire by then.”"}
                                    {:date "18/09/3270"
                                     :text "“Supposedly there are a bunch of other ships out here doing the same job as us, but no comms allowed. All a bit strange. It’s vast and lonely out here, pretty much the whole galaxy is behind us. It’s getting to some of the crew.”"}
                                    {:date "01/10/3270"
                                     :text "“We picked up some kind of bizarre signal yesterday. Whatever it was it wasn’t human. At least, that’s the scuttlebutt going around the decks. Everyone is looking out of the canopies now. We’re seeing some strange lights during hyperspace transits. Terror? Yeah, we got some of that…”"}
                                    {:date "11/11/3270"
                                     :text "“More strange lights. We’ve got equipment malfunctions, scanners dropping in and out, systems resetting. Ship is limping on. Everyone wants to turn about, but if we don’t complete the mission we don’t get paid. No one wants to give up those credits either. You expect to turn around and see…”"}
                                    {:date "29/11/3270"
                                     :text "“We’re done and we’re heading home. We picked up some heat signatures in the last system. Definitely something there and it wasn’t any profile I had seen before. Something was watching us. There’s something evil out here, and it doesn’t like company!”"}]}
                    :delta  {:system {:name "Eafots GL-Y e2"}
                             :site {:body "6" :coordinates {:lat 21.2752 :lon 19.066}}
                             :ucb "DYJEPQYUWLUDCQCKJXUEOKJ DJPQYP6UNL003 NEHHYLKCJQ6 SKNICDCJUNCSQ UESKQP AH Y U 2 IKDUPQEJDXY"
                             :logs [{:date "30/08/3270"
                                     :text "“I should have paid a bit more attention to the mission description. I just saw the credit count and signed up there and then. More money than I’ve ever earned and all in one go, just for taking a year out. What’s a poor girl got to do? A bit of a jaunt into the void, how bad could it be? Didn’t read the bit about several thousand light years. I’ve never even been past Leesti before! Get rich quick scheme – let’s go!”"}
                                    {:date "12/09/3270"
                                     :text "“It’s pretty out here. We’ve seen a gorgeous double nebula called the Heart and Soul. You should see it, lots of bright blue stars nearby, wish we could divert to have a closer look, but our mission is beyond apparently. Really brings back how big the galaxy is. Makes you feel real small and insignificant.”"}
                                    {:date "18/09/3270"
                                     :text "“My job is the EVA. Taking out one of our two Sidewinders and dropping beacons out in the void and then making sure they’re activated. Not sure what these things are for. Who needs a beacon this far out anyway? Weird, they all have this code in their BIOS – ‘Exodus’. Still, at least I now have something to do. The journey was so dull! Months of travel to get out here.”"}
                                    {:date "01/10/3270"
                                     :text "“Something weird happened to day. Unloaded another beacon and set it up, then everything went off line – and l mean everything! Life support too! No comms, nothing. Stayed that way for about two minutes. Then everything was back to normal. Affected our support ship too. No idea what caused it. Going to need new underwear when I get back. Rumours are there is something odd about this area of space.”"}
                                    {:date "11/11/3270"
                                     :text "“Oh my god… someone help me. Where are they… please… this can’t be happening…”"}
                                    {:date "29/11/3270"
                                     :text "“I’ve had time to accept it now. I went out as normal with one of the beacons, set it up. Had that weird power loss again. I waited and it all came back online like before. Signalled my support ship – no response. Flew back and it was gone, just debris. No survivors. Don’t know what happened. It’s just me and this crappy old Sidewinder a zillion miles from home. Should have known it wasn’t going to work out. If it’s too good to be true… There’s an Earth-like world here, going to try and reach it… you never know.”"}]}
                    :zurara {:system {:name "Syreadiae JX-F c0"
                                      :coordinates {:cartesian {:x -9529.4375 :y -64.5 :z -7428.4375}
                                                    :galactic {:r 12082.881 :l 127.937 :b -0.306}
                                                    :equatorial {:ra {:string "1h 34m 29.354s"
                                                                      :h 1 :m 34 :s 29.354}
                                                                 :dec {:string "62° 8' 48.403\""
                                                                       :deg 62 :m 8 :s 48.403}}}}}}
   :hawkins-gap {}})
