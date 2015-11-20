(ns closure-practice.pig-latin)

(def vowel? (set "aeiou"))

(def map? {:red :cherry :green :apple})

(defn pig-latin [word]
  (let [first-letter (first word)]
    (if (vowel? first-letter)
      (str word "ay")
      (str (subs word 1) first-letter "ay"))))

(println (pig-latin "red"))

(println (if (vowel? \a) "yes" "no"))
(println (if (vowel? \b) "yes" "no"))
(println (if (map? :red) "yes" "no"))