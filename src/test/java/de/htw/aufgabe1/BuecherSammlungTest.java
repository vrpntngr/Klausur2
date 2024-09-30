package de.htw.aufgabe1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import static de.htw.aufgabe1.Genre.*;
import static org.junit.jupiter.api.Assertions.*;

class BuecherSammlungTest {

    private BuecherSammlung sammlung;

    private Autor tolkien;
    private Autor mcFearlane;
    private Autor  stokowski;
    private Autor kling;

    @BeforeEach
    void setup() {
        this.sammlung = new BuecherSammlung();

        this.tolkien = new Autor("J.R.R.", "Tolkien", Year.of(1892));
        this.mcFearlane = new Autor("Mhairi", "McFarlane", Year.of(1976));
        this.stokowski = new Autor("Margarete", "Stokowski", Year.of(1986));
        this.kling = new Autor("Marc-Uwe", "Kling", Year.of(1982));

        this.sammlung.addBuch(new Buch("Der kleine Hobbit", LocalDate.of( 2012, 10, 1), tolkien, 16, ROMAN));
        this.sammlung.addBuch(new Buch("Der Hobbit: Oder Hin und zurück", LocalDate.of( 2013, 6, 9), tolkien, 1, ROMAN));
        this.sammlung.addBuch(new Buch("Der Herr der Ringe", LocalDate.of( 2024, 8, 17), tolkien, 1, ROMAN));
        this.sammlung.addBuch(new Buch("Fang jetzt bloß nicht an zu lieben", LocalDate.of( 2022, 12, 1), mcFearlane, 1, ROMAN));
        this.sammlung.addBuch(new Buch("Wir in drei Worten", LocalDate.of( 2013, 9, 26), mcFearlane, 1, ROMAN));
        this.sammlung.addBuch(new Buch("Vielleicht mag ich dich morgen", LocalDate.of( 2015, 4, 24), mcFearlane, 20, ROMAN));
        this.sammlung.addBuch(new Buch("Untenrum frei", LocalDate.of( 2018, 4, 24), stokowski, 22, SACHBUCH));
        this.sammlung.addBuch(new Buch("Die letzten Tage des Patriarchats", LocalDate.of( 2019, 12, 17), stokowski, 10, SACHBUCH));
        this.sammlung.addBuch(new Buch("Das NEINhorn und der Geburtstag", LocalDate.of( 2024, 9, 26), kling, 1, Genre.KINDERBUCH));
    }

    @Test
    public void getAllTitek() {
       List<String> expected = List.of("Der kleine Hobbit",
                "Der Hobbit: Oder Hin und zurück",
               "Der Herr der Ringe",
                "Fang jetzt bloß nicht an zu lieben",
               "Wir in drei Worten",
               "Vielleicht mag ich dich morgen",
                "Untenrum frei",
               "Die letzten Tage des Patriarchats",
                "Das NEINhorn und der Geburtstag");
        List<String> result = this.sammlung.getAllTitel();
        assertEquals(expected, result);
    }

    @Test
    public void getAllAutoren() {
        Set<Autor> expected = Set.of(tolkien, mcFearlane, stokowski, kling);
        Set<Autor> result = this.sammlung.getAllAutoren();
        assertEquals(expected, result);
    }

    @Test
    public void getDenAeltestenAutoren() {
        Optional<Autor> result = this.sammlung.getDenAeltestenAutoren();
        assertEquals(tolkien, result.get());
    }

    @Test
    public void getAlleBuecherAusDemJahr2024() {
        List<Buch> expected = List.of(
                new Buch("Der Herr der Ringe", LocalDate.of( 2024, 8, 17), tolkien, 1, ROMAN),
                new Buch("Das NEINhorn und der Geburtstag", LocalDate.of( 2024, 9, 26), kling, 1, Genre.KINDERBUCH));
        List<Buch> result = this.sammlung.getAlleBuecherAusDemJahr(2024);
        assertEquals(expected, result);
    }

    @Test
    public void getAlleGenreMitAnzahlDerBuecher() {
        Map<Genre, Long> expected = Map.of(ROMAN, 6L, SACHBUCH, 2L, KINDERBUCH, 1L);
        Map<Genre, Long> result = this.sammlung.getAlleGenreMitAnzahlDerBuecher();
        assertEquals(expected, result);
    }

}