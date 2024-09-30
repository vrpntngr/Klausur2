package de.htw.aufgabe1;

import java.time.LocalDate;
import java.util.Objects;

public class Buch {

    private final String titel;
    private final LocalDate erscheinungsJahr;
    private final Autor autor;
    private final int auflagen;
    private final Genre genre;

    public Buch(String titel, LocalDate erscheinungsJahr, Autor autor, int auflagen, Genre genre) {
        this.titel = titel;
        this.erscheinungsJahr = erscheinungsJahr;
        this.autor = autor;
        this.auflagen = auflagen;
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buch buch = (Buch) o;
        return auflagen == buch.auflagen && Objects.equals(erscheinungsJahr, buch.erscheinungsJahr) && Objects.equals(autor, buch.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(erscheinungsJahr, autor, auflagen);
    }

    public String getTitel() {
        return titel;
    }

    public LocalDate getErscheinungsJahr() {
        return erscheinungsJahr;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getAuflagen() {
        return auflagen;
    }

    public Genre getGenre() {
        return genre;
    }
}
