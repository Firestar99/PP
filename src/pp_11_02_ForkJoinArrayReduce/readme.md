# ForkJoin-Framework #

## Reduce als *divide and conquer* ##

Das ForkJoin-Framework eignet sich besonders gut zur Implementierung von Array-Algorithmen.

Alle Werte eines Arrays aufaddieren.

Das Array soll halbiert werden, bis <= 4 Elemente übrig sind.

## Aufgaben ##
* Implementieren Sie die Summierungsfunktion in der Klasse ``ReduceTask``.
* Führen Sie Messungen der Laufzeit durch.
* Visualisieren Sie die Ergebnisse und analysiseren Sie das Ergebnis.

## Anregung (bei Interesse, Zeit und Gelegenheit) ##
* Verallgemeinern Sie ``ReduceTask`` für allgemeine Aggregationsfunktionen und Typen (Typ-Parameter für Klasse und Aggregierungsfunktion über ``FunctionalInterface`` ``BiFunction`` übergeben). 
* Berechnen Sie die optimale Array-Größe für den Rekursionsanker: Da keine (blockierenden) Betriebssystemaufrufe oder synchronisierte Zugriffe auf gemeinsame Variablen erfolgen, die zu einer Blockierung von Threads führen könnte, ist ``Runtime.getRuntime().availableProcessors()-1`` bzw. ``ForkJoinPool.commonPool().getParallelism()`` eine sinnvolle Schätzung für die anzustrebende Anzahl von Teilproblemen. ``SLICE_LEN`` darf also keine Konstante mehr sein, sondern muss in Abhängigkeit der Konstante ``ARRAY_LEN` berechnet werden.  
