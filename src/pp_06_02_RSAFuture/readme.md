# Completable Futures #

## RSA Schlüsselerzeugung ##

Die Klasse ``KeyValue`` dient der Repräsentation des Schlüssel-Tripels für RSA. Diese Klasse wird hier nicht weiter betrachtet.

## Aufgaben ##

* Fügen Sie Code in die ``main``-Methode ein, um herauszufinden wie lange die Berechnung der Schlüssel dauert.
* Ändern Sie die Berechung von sequentiell zu nebenläufig, indem Sie einen ``ExecutorService`` der Art ``FixedThreadPool`` erzeugen und Teilaufgaben zur nebenläufigen Lösung dort bearbeiten lassen.
* Variieren Sie die Größe des Thread-Pools und lassen Sie das Programm jeweils mehrfach laufen. Vergleichen Sie die erforderliche Zeitdauer mit der für die sequentielle Berechnung.