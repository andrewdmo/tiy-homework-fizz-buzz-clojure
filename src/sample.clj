 (ns sample)



(defn echo [word times]
  (loop [word word
         times times
         accumulator ""]
    (if (= times 0)
      (println accumulator)
      (recur word (- times 1) (str accumulator " " word)))))

(defn -main[])
(echo "beer" 3)

(-main)