package de.htw.aufgabe2;

public class QuadratPrimzahlErkennen {

    // TODO
    // * Schreiben Sie mindestens 5 verschiedene Tests für die Klasse QuadratPrimzahlErkennen.
    //   (Verschiedene bedeutet hier, dass ihre Tests unterschiedliche Outputs der Methode abtesten.)
    // * Die Rückgabe verschiedener Zahlen als String gilt nicht als unterschiedliche Tests. Sie können
    //   den Namen der Testmethoden nutzen um klar zu machen, worauf Sie testen.
    // * Erreichen Sie eine Test-Coverage von 100 % der Klasse QuadratPrimzahlErkennen.

    public String pruefe(int i) {
        String result = "";
        if (istQuadrat(i)) {
            result = i + " Quadrat";
        } else if (istPrimzahl(i)) {
            result = i + " Primzahl";
        } else {
            result = String.valueOf(i);
        }
        return result;
    }

    public boolean istQuadrat(int zahl) {
        int wurzel = (int) Math.sqrt(zahl);
        return wurzel * wurzel == zahl;
    }

    public boolean istPrimzahl(int zahl) {
        if (zahl < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(zahl); i++) {
            if (zahl % i == 0) {
                return false;
            }
        }
        return true;
    }
}
