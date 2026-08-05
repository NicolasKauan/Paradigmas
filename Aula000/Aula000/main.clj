(println "Hello world!")

(println "Tabuada - Digite um numero: ")
(flush)

(def entrada(read-line))
(def numero(Integer/parseInt entrada))

(doseq [x(range 1 11)]
    (println (* numero x)))