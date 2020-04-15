(defn fizzbuzz [x]
 (loop [y x] 
  (if (<= y 100) 
    (do (if (and (= (rem y 3) 0) (= (rem y 5) 0)) (println "FizzBuzz")
     (if (= (rem y 3) 0) (println "Fizz")
      (if (= (rem y 5) 0) (println "Buzz") 
      (println y)))) (recur (inc y))) (println "Loop ended"))))

(fizzbuzz 1)