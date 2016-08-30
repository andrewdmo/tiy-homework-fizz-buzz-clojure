(ns tiy-homework-fizz-buzz-clojure)

(println "Three...\nTwo...\nOne...\n\n")

(defn fizzbuzz [start end]
  (if
    (= start end)
    ((println "\nLa Fin!") (System/exit 0))
    (if (and (>= start 0) (<= start end))

      ;if both of these true then:
      (let [start (+ start 1)]
        ;test conditions:
        (cond
          ;cond1:
          ;(= start end) (println start "fin3")
          (= (mod start 15) 0) ((println "FizzBuzz") (fizzbuzz start end))
          ;cond2:
          (= (mod start 5) 0) ((println "Buzz") (fizzbuzz start end))
          ;cond3:
          (= (mod start 3) 0) ((println "Fizz") (fizzbuzz start end))
          :else ((println start) (fizzbuzz start end))
          )
        )
      )
    )
  )

(defn -main []

  (fizzbuzz 0 100))

(-main)