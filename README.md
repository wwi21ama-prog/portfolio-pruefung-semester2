# Suchmaschine und Crawler (Portfolioprüfung)

## Hintergrund

Ein befreundeter Unternehmensgründer möchte eine eigene Suchmaschine entwickeln, um das World Wide Web automatisiert nach Inhalten abzusuchen. Dafür bittet er um Mithilfe.

Nach kurzer Recherche wird klar, dass die Suchmaschine aus zwei elementaren Teilen bestehen muss: einem Webcrawler und einer Datenbank, die alle gefundenen Seiten speichert und durchsuchbar macht.

> Ein Webcrawler (auch Spider, Searchbot oder Robot) ist ein Computerprogramm, das automatisch das World Wide Web
> durchsucht und Webseiten analysiert. Webcrawler werden vor allem von Suchmaschinen zur Indexierung von Webseiten eingesetzt. [Webcrawler - Wikipedia](https://de.wikipedia.org/wiki/Webcrawler)

Jede/r Studierende soll nun ein Konzept und einen Applikationsprototyp einreichen, der das World Wide Web durchsuchbar macht.

## Aufgabenstellung

Alle Aufgaben sind detailliert in der Datei [Aufgaben.md](Aufgaben.md) aufgeführt. In diesem Repository ist ein Grundgerüst einer Java-Applikation inklusive mehrerer Interfaces vorgegeben. Implementieren Sie diese Interfaces (ohne sie zu verändern), 
um die
Funktionalität der Applikation sicherzustellen und die Aufgaben zu erfüllen.

Denken Sie auch daran, dass der Webcrawler Verlinkungen auf unterschiedlichen Webseiten beliebig tief folgen muss.

**Hinweis:** Ihr Auftraggeber möchte das Programm nach Fertigstellung von einer zertifizierten Prüforganisation überprüfen lassen - dabei wird insbesondere die Codequalität beachtet!

## Organisatorisches
### Bearbeitung
Diese Portfolioprüfung wird **einzeln** bearbeitet und abgegeben.

### Abstimmungstermin
Pro Person ist ein verpflichtender Termin angesetzt, bei dem der jeweilige Zwischenstand besprochen wird. Ziel ist die Prüfung der Eigenständigkeit.
Die möglichen Terminslots werden auf Moodle veröffentlicht und gebucht. Die Zeitpunkte werden individuell zwischen Studierenden und Dozenten vereinbart.
Zu diesem Zeitpunkt muss das Projekt noch nicht vollständig umgesetzt sein. Sie sollten aber zumindest schon die Basis-Aufgaben gründlich bearbeitet haben, um eine gute Diskussionsgrundlage zu besitzen.

Das Bestehen dieses Termins ist Voraussetzung für die Zulassung zur Prüfung.

### Abgabe
Die Abgabe hat spätestens am **xx.xx.2022 um 23:59 Uhr (MESZ)** über Moodle zu erfolgen. Abzugeben ist eine ZIP-Datei mit dem **ausführbaren** Quellcode (`.java`-Dateien) und der Dokumentation (PDF).

Bitte nennen Sie Name und Matrikelnummer auf dem Deckblatt der Dokumentation.

## Bewertungskriterien

### Dokumentation

- **Sprache:** Deutsch
- **Deckblatt:** Name und Matrikelnummer
- **Umfang:** Keine Vorgabe für minimale oder maximale Seitenanzahl, ca. 8 - 10 Seiten sind realistisch
- **Ziel:** Gesamtkonzept beschreiben
    - Visualisierung des Konzepts
    - Vorgehen und Umsetzung z. B. von Datenbank, Crawling-Algorithmus und Suchlogiken beschreiben und erklären
    - Entscheidungen (z. B. für spezielle Datenstrukturen) erklären
    - Komplexitätsbetrachtung der verwendeten Algorithmen und Datenstrukturen

### Funktionalität

Siehe [Aufgaben.md](Aufgaben.md).

### Codequalität

- Einheitliche Formatierung (Klammern, Einrückung usw.)
- Sinnvolle Kommentare im Code
    - Kurzbeschreibungen der wichtigsten Methoden ("**was** macht die Methode?")
    - an komplizierten Stellen Erklärungen der Funktionsweise ("**wie** wird das in der Methode umgesetzt?")
- (Sinnvolle) Anwendung von Prinzipien der Objektorientierung
- Verwendung adäquater Datentypen
- Sinnvolle Attributs- und Methodennamen
- Namenskonventionen und Schreibweisen beachten

## Deadlines

- Abgabe von Dokumentation und Code spätestens am **06.05.2022 um 23:59 Uhr (MESZ)** über Moodle
