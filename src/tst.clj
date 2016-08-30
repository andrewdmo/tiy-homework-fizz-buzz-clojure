 (ns tst)

(defn echo [word times]
  (loop [word word
         times times
         accumulator ""]
    (if (= times 0)
      accumulator
      (recur word (- times 1) (str accumulator " " word)))))


(def f "Fizz")
(def b "Buzz")
(def fb "FizzBuzz")


(defn fizzbuzz []
  ;start loop, clearly      (and set initial values)
  (loop [start 1
         end 101
         accumulatron ""]
    ; run loop if still going up to 100 but stop if there and bust out accumulator's value:
    (if (> start end)
      (println accumulatron))
        ; if not look out for these return values, assuming recur can change their values


    (if (or ((= 0 (% start 15)) (=0 (% start 5) (% start 3)))
            then
            ())
      recur (+ start 1) (str accumulatron " "))))



