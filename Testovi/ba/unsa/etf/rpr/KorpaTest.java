package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class KorpaTest {

    Korpa k=new Korpa();
    Artikl a=new Artikl("mandarina",4,"22");
    Artikl b=new Artikl("jagoda",6,"11");
    @BeforeAll
    public void dodaj(){
        k.dodajArtikl(a);
        k.dodajArtikl(b);
    }
    @Test
    void getArtikli() {
        boolean sviPrisutni=false;
        Artikl[]niz=new Artikl[50];
        niz[0]=a;
        if(Arrays.equals(k.getArtikli(),niz))
            sviPrisutni=true;
        assertTrue(sviPrisutni);
    }

    @Test
    void dodajArtikl() {
        boolean postojiLi= Arrays.asList(k.getArtikli()).contains(a);
        assertTrue(postojiLi);
    }

    @Test
    void izbaciArtiklSaKodom() {
        k.izbaciArtiklSaKodom(b.getKod());
        boolean postojiLi= Arrays.asList(k.getArtikli()).contains(b);
        assertFalse(postojiLi);
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        assertEquals(4, k.dajUkupnuCijenuArtikala());
    }
}