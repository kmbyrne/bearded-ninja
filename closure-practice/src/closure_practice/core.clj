(ns closure-practice.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(defn rename [{:keys [name] :as o} new-name]
  (if name (assoc o :name new-name) o))


(def person {:name           "Mark"
             :age            :undisclosed
             :favorite-color :green})
(def corp {:name          "Clearwater Analytics"
           :address       "Corner of 9th and Bannock"
           :num-employees 400})

(def movie {:name          "Star Wars"
            :lengh         120
            :year-released 1978})

(def noname {:do-I-have-a-name false})

(println person)
(println (rename person "Clearwater Analytics, LLC"))
(println (rename corp "Mike"))
(println (rename movie "A New Hope"))
(println (rename noname "What happens here?"))
(println (rename "This ain't a map!" "frak"))

