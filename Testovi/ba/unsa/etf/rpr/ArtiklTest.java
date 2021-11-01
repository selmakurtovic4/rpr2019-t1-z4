package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    Artikl a=new Artikl("mandarine",5,"225");
    @Test
    void getNaziv() {
        assertEquals("mandarine",a.getNaziv());
    }

    @Test
    void setNaziv() {
        a.setNaziv("jagode");
        assertEquals("jagode",a.getNaziv());

    }

    @Test
    void getCijena() {
        assertEquals(5,a.getCijena());
    }

    @Test
    void getKod() {
        assertEquals("225",a.getKod());
    }

    @Test
    void setKod() {
        a.setKod("445");
        assertEquals("445",a.getKod());
    }
}