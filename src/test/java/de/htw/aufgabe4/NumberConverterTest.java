package de.htw.aufgabe4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class NumberConverterTest {

    // TODO TIPP: wenn Ihnen Testcases zum Entwickeln fehlen ergänzen Sie diese.

    public static Stream<Object[]> getInputAndExpecded() {
        return Stream.of(new Object[][]{
                {"A", Code.A, "B"},
                {"A", Code.B, "C"},
                {"a",Code.A, "B"},
                {"Klausur",Code.A, "LMBVTVS"},
                {"Hochschule",Code.A, "IPDITDIVMF"},
                {"Apfel",Code.A, "BQGFM"},
                {"Informatik",Code.A, "JOGPSNBUJL"},
                {"INFORMATIK",Code.A, "JOGPSNBUJL"},
                {"Mathematik",Code.A, "NBUIFNBUJL"},
                {"Xylophon",Code.A, "YZMPQIPO"},
                {"Zimmer",Code.A, "nullJNNFS"},
                {"C",Code.A, "D"},
                {"Buecher",Code.B, "DWGEJGT"},
                {"Haftpflichtversicherung",Code.A, "IBGUQGMJDIUWFSTJDIFSVOH"},
                {"Dampfschifffahrtsgesellschaft",Code.A, "EBNQGTDIJGGGBISUTHFTFMMTDIBGU"},
                {"Finanzdienstleistungsunternehmen",Code.A, "GJOBOnullEJFOTUMFJTUVOHTVOUFSOFINFO"},
                {"Veranstaltungsinformationsdienst",Code.C, "YHUDQVWDOWXQJVLQIRUPDWLRQVGLHQVW"},
                {"Wortschatx",Code.C, "ZRUWVFKDWnull"},
                {"Aepfel",Code.E, "FJUKJQ"},
                {"M",Code.A, "N"},
                {"Geheimgesellschaft",Code.A, "HFIFJNHFTFMMTDIBGU"},
                {"Mathe",Code.E, "RFYMJ"},
                {"Kinder",Code.A, "LJOEFS"},
                {"Kinder",Code.D, "OMRHIV"},
                {"Studentinnen",Code.A, "TUVEFOUJOOFO"}
        });
    }

    @ParameterizedTest
    @MethodSource("getInputAndExpecded")
    public void checkAllInputs(String input, Code code, String expected) {
        Encoder converter = new Encoder();
        String result = converter.encode(input, code);
        assertEquals(expected, result);
    }

}