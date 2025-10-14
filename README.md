# Übungsblatt
[Link to English version](./README_en.md)

In diesem Übungsblatt lernt ihr Testfälle in Java-Projekten kennen und lernt, wie ihr die integrierten Testfälle nutzen könnt, um eure Lösung zu kontrollieren. 
Alle Übungsblätter in der Veranstaltung **INF520-Programmierprojekt** enthalten Testfälle, die euch dabei unterstützen sollen, die Aufgaben richtig zu lösen. Die Testfälle helfen euch aber natürlich nur dann, wenn ihr sie auch regelmäßig ausführt.
In diesem Übungsblatt geht es **nicht** darum, dass ihr selbst Testfälle für eure Programme schreiben könnt. Dies lernt ihr bei einem späteren Übungsblatt.

## Übung 0: Tutorial zu Tests in Visual Studio Code

Scheut euch die in Moodle verlinkten Tutorials zur Durchführung von Testfällen in Visual Studio Code an: 
* [VS Code: Run/Debug test cases](
https://code.visualstudio.com/docs/java/java-testing#_rundebug-test-cases)
* https://youtu.be/vZm0lHciFsQ?t=336
* https://youtu.be/nYQaDWISKUI?t=198


## Übung 1: Testfälle ausfüllen

Das Paket [`de.phl.programmingproject.calculator`](src/main/java/de/phl/programmingproject/calculator/) enthält eine einfache Implementierung eines Taschenrechners ([`SimpleCalculator`](src/main/java/de/phl/programmingproject/calculator/SimpleCalculator.java)). Der [`SimpleCalculator`](src/main/java/de/phl/programmingproject/calculator/SimpleCalculator.java) unterstützt die vier Grundrechenarten:

- Addition
- Subtraktion
- Multiplikation
- Division

Um die Implementierung zu testen, gibt es im Testordner die Klasse [`SimpleCalculatorTest`](src/test/java/de/phl/programmingproject/calculator/SimpleCalculatorTest.java). Für jede Grundrechenart existiert ein Testfall, der jedoch noch unvollständig ist.

**Aufgaben:**

1. Ergänzt die Testfälle entsprechend den **`TODO`-Kommentaren**.
2. Führt die Testfälle aus und prüft, ob alle Operationen korrekt funktionieren.
3. Analysiert fehlschlagende Testfälle und beschreibt die Ursache.
4. Erstellt eine Datei `calculator.md` im Hauptverzeichnis und dokumentiert dort, welche Fehler ihr gefunden habt.
5. Ladet die Datei `calculator.md` ins Repository hoch.

---

## Übung 2: Fehlerhaften Code korrigieren

In der vorherigen Aufgabe habt ihr möglicherweise fehlerhafte Implementierungen entdeckt. Korrigiert diese wie folgt:

**Aufgaben:**

1. Behebt die Fehler in den betroffenen Methoden.
2. Führt die Testfälle erneut aus.
3. Wiederholt die Korrekturen, bis alle Tests erfolgreich sind.
4. Ladet den korrigierten Code ins Repository hoch.
