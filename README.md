# **Di**ce **Ga**me **L**anguage

DiGaL ist eine domainspezifische Sprache, die mit das Ziel erreicht, Würfelspiele in einer einfachen Art und Weise auszudücken. Besonderer Fokus liegt auf der Nähe zur Natürlichen Sprache, sodass zwar nicht jeder Satz ein valides Konstrukt in DiGaL, jedoch jedes valide Konstrukt ein sinnvoller Satz der deutschen Sprache ist.

## Quick Start

#### DiGaL Eclipse Project.zip:
Diese ZIP-Datei enthält das Eclipse Projekt unserer Referenzimplementierung. Im Optimalfall reicht es, dieses zu importieren.

#### digalc.jar
Falls es mit dem Eclipse Import nicht ohne Weiteres klappt, haben wir ein kompiliertes Paket der Referenzimplementierung. Das können Sie ausführen, um ein Würfelspiel (.dg Datei) zu kompilieren. Dazu geben sie folgendes im Terminal ein:
java -jar digalc.jar PATH_TO_DIGAL_FILE

Im Ordner Examples liegen einige Beispiele: für "Own.dg" sieht der Aufruf wie folgt aus:

```
java -jar digalc.jar Examples/Own.dg
```

Das kompilierte Spiel ist ein Python-Skript:
```python PATH_TO_PYTHON_FILE```

Für Own.py:
```python Examples/bin/OWN.py```

##### Report.pdf
Das ist das Assay über die Domänenbeschreibung, Sprachspezifikation und Diskussion zur Sprache. 