(fn [sq] 
  (loop [i 1 s sq]
    (if (= (next s) nil)
    	i
    	(recur (inc i) (rest s)))))