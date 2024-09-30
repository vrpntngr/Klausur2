package de.htw.aufgabe1;

import java.util.*;

public class BuecherSammlung {

    private final List<Buch> buecher;

    public BuecherSammlung() {
        this.buecher = new ArrayList<>();
    }

    public void addBuch(Buch buch) {
        buecher.add(buch);
    }

    // TODO Diese Methode soll alle Titel der Buechersammung zurückgeben.
    //  ACHTUNG nutzen Sie STREAMS
    public List<String> getAllTitel() {
        return null;
    }

    // TODO Diese Methode soll alle Autoren der Buechersammung zurückgeben.
    //  ACHTUNG nutzen Sie STREAMS
    public Set<Autor> getAllAutoren() {
        return null;
    }

    // TODO Diese Methode soll den/die älteste Autor*in aus der Buechersammung zurückgeben.
    //  ACHTUNG nutzen Sie STREAMS
    public Optional<Autor> getDenAeltestenAutoren() {
        return null;
    }

    // TODO Diese Methode soll alle Buecher aus der Buechersammung zurückgeben, die in dem uebergebenen
    //  Jahr veroeffentlich worden sind.
    //  ACHTUNG nutzen Sie STREAMS
    public List<Buch> getAlleBuecherAusDemJahr(int jahr) {
        return null;
    }

    // TODO Diese Methode soll alle Genres und die Anzahl der Buecher, die dazu zauhlen, aus der
    //  Buechersammung zurückgeben.
    //  ACHTUNG nutzen Sie STREAMS
    public Map<Genre, Long> getAlleGenreMitAnzahlDerBuecher() {
        return null;
    }
}
