# Aufgaben für die Suchmaschine und den Crawler

## Vorgegebene Klassen

Im Paket `dieprogrammierdozenten.www` finden Sie drei Klassen, die auf sehr einfache Weise die Funktionsweise des World Wide Web (WWW) simulieren. Sie können über ein Objekt der Klasse `Resolver` eine URL aufrufen (`getUrl(String url)`) und erhalten
ein Objekt der Klasse `Response` zurück. Dieses enthält einen `ResponseStatus`, der entweder den Wert `FOUND` oder, falls die URL nicht gefunden wurde, `NOT_FOUND` besitzt. Darüber kann Ihr Webcrawler erkennen, ob der übergebene Link valide ist bzw.
existiert und in die Datenbank aufgenommen werden muss. Außerdem enthält eine `Response` neben der aufgerufenen `domain` sowie dem
`Path` auch den Quelltext der Seite (`source`), der in der Hypertext Markup Language (HTML) verfasst ist und Textinhalte (bspw. `<p></p>`) sowie Links zu weiteren Webseiten (`<a></a>`) enthalten kann. Eine Einführung in die Syntax von HTML finden 
Sie z. B.
bei [W3Schools](https://www.w3schools.com/html/).

## Basis-Aufgaben

Im Quell-Ordner sind eine `App`-Klasse und eine Reihe von `Interfaces` vorgegeben. Ein Interface ist eine leere Klassenvorlage, die vorgibt, welche Methoden eine Klasse besitzen muss.

Ihre Aufgaben bestehen zunächst darin, diese Interfaces zu implementieren, d. h. Sie sollen Klassen (`Crawler.java` und `Database.java`) bereitstellen, die die Methoden der Interfaces implementieren.

Dabei verwendet man das Schlüsselwort ```implements```, um dem Compiler mitzuteilen, dass man ein bestimmtes Interface implementiert. Der Compiler prüft dann den eigenen Code darauf, ob das Interface korrekt umgesetzt wurde.

Ihre Klassen dürfen neben den vom Interface vorgegebenen Methoden noch weitere enthalten, wenn Sie das für sinnvoll halten. Die Interfaces dürfen allerdings nicht geändert werden!

Zur Erfüllung der Basisaufgaben sollte eine einfache, funktionierende Anwendung umgesetzt werden, die die Klassen im Paket `dieprogrammierdozenten.www` nutzt, um Adressen (URLs) aufzurufen und die Inhalte zu analysieren. Ihre Datenbank sollte 
nach dem Start des Webcrawlers mit der Domain `https://www.dhbw.de/startseite` mindestens **N** Links identifiziert und in der Datenbank hinterlegt haben. Diese können über die Methode `getVisitedLinks()` abgerufen und angezeigt werden.

## Fortgeschrittene Aufgaben

1. Ermöglichen Sie die Konfiguration Ihres Programms beim Start über die Kommandozeile. Fügen Sie dazu einen Parameter `startUrl` hinzu, der einen `String` erwartet und die erste vom Webcrawler zu besuchende Webseite bestimmt.
2. Erweitern Sie Ihre Anwendung, sodass diese auch die Texte aus dem Quellcode der Webseiten speichert. Dazu müssen Sie zumindest die Absätze (`<p>`) und Überschriften (`<h1>` und `<h2>`) sowie die Webseiten-Title (`<title>`) berücksichtigen.
3. Fügen Sie eine Eingabemöglichkeit zu Ihrem Programm hinzu. Der Benutzende soll vom Programm nach der gewünschten Aktion gefragt werden, auf die Eingabe warten und diese (falls sie gültig ist) umsetzen.
4. Implementieren Sie die Funktionalität von `findLinksContaining(String query)` in der Klasse `Datenbank`, sodass für einen beliebigen Suchbegriff (bspw. "bachelor") alle Webseiten (Links) angezeigt werden, die diesen Suchbegriff beinhalten. Die 
   Groß- und Kleinschreibung des Suchbegriffs sollte dabei keine Rolle spielen.

## Bonusaufgaben
Die Bonusaufgaben sind optional und nicht für das Erreichen der vollen Punktzahl notwendig, können aber bspw. kleinere Fehler in den Basis- oder fortgeschrittenen Aufgaben kompensieren.

### Ranking
Integrieren Sie eine Möglichkeit zum Rating von Webseiten in Ihr Programm. Dabei soll der Webcrawler Webseiten ein höheres Rating zuweisen, auf die von mehreren anderen Webseiten verlinkt werden. Außerdem sollen Webseiten ein höheres Ranking 
erhalten, wenn Sie mehr Unterseiten besitzen. Bei der Abfrage der Ergebnisse zu einem Suchbegriff über `findLinksContaining(String query)` in der Klasse `Datenbank` sollten Webseiten mit einer höheren Bewertung oben erscheinen und absteigend 
sortiert sein.

### Skalierbarkeit
Erweitern Sie Ihr Programm, damit es das gleichzeitige Starten einer beliebigen Anzahl von Webcrawlern ermöglicht. Dafür soll das Programm beim Start einen Parameter `splitAfterNLinks` übergeben bekommen, der die Anzahl von zu startenden 
Webcrawlern als `Integer` enthält. Allerdings starten diese Webcrawler nicht alle gleichzeitig, sondern es wird alle zwei zu analysierenden Links ein neuer Webcrawler gestartet.

Für den Parameterwert `2` sieht das bspw. wie folgt aus:
1. Programm wird mit Parameter `splitAfterNLinks = 3` gestartet
2. `Crawler 1` startet mit der über den Parameter `startUrl` übergebenen Startseite
3. `Crawler 1` findet die vier Links `A`, `B`, `C` und `D`
4. `Crawler 1` folgt den Links `A` und `B` und startet `Crawler 2`
5. `Crawler 2` arbeitet die Links `C` und `D` ab
6. ...
