# Completable Futures #

## RSA Schlüsselerzeugung ##

Die Klasse ``KeyValue`` dient der Repräsentation des Schlüssel-Tripels für RSA. Diese Klasse wird hier nicht weiter betrachtet. 

## Aufgaben ##

* Die Berechnung soll nun auf das ``CompletableFuture``-Framework umgestellt werden. Sie brauchen deshalb keinen eigenen *Thread-Pool* als ``ExecutorService`` erzeugen. Das ``CompletableFuture``-Framework verwendet den ``commonPool``. 

* Die Berechnung der RSA-Schlüssel soll nun auf ``CompletableFuture`` umgestellt werden. In ``RSAKeyPar`` ist bereits ein Gerüst  für einen *Supplier* vorgegeben. Der ``Supplier`` muss aber noch um die eigentliche Berechnung einer Primzahl vervollständigt werden. Da das Ziehen einer Primzahl mit ``BigInteger.probablePrime`` eine Zufallskomponente beinhaltet, ist es sinnvoll im *Supplier* mehrere Aufrufe von ``BigInteger.probablePrime`` zu starten (in der Hoffnung, dass zufällig eine schnellere Lösung dabei ist) und das erste Ergebnis, das von den parallel arbeitenden ``BigInteger.probablePrime``-Versuchen zurückgeliefert wird, als Gesamtergebnis zu benutzen.

**Achtung:** Die "Fehlversuche", also die Berechnungen von ``BigInteger.probablePrime``, die nicht zum Zuge kommen, also langsamer als der schnellste Versuch sind, können nicht vorzeitig (z.B. von außen oder durch Koordination untereinander) abgebrochen werden. Dies muss man bei der Verwendung des ``CompletableFuture``-Frameworks in Kauf nehmen.   

* Verwenden Sie den Supplier um die zwei Primzahlen in ``getKeyParallel`` zu ziehen. Das Ergebnis ist jeweils ein ``CompletableFuture<...>``. Führen Sie auch die anderen Berechnungen mit ``thenCombineAsync`` und ``thenApplyAsync`` aus.

* Führen Sie das Programm mehrfach aus und messen Sie dabei die Zeit. Vergleichen Sie den Aufwand mit der sequentiellen und *Future*-Lösung. Vergleichen Sie auch Übersichtlichkeit und Aufbau der Lösung mit ``Future<...>`` und ``CompletableFuture<...>``. 
