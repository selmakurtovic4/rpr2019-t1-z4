package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class SupermarketTest {
    Artikl a=new Artikl("mandarina",4,"22");
    Supermarket s=new Supermarket();
    Artikl b=new Artikl("jagoda",6,"11");
    @BeforeAll
    public void dodavanje() {
        s.dodajArtikl(a);
        s.dodajArtikl(b);
    }
    @Test
    void dodajArtikl() {
     boolean postojiLi= Arrays.asList(s.getArtikli()).contains(a);
     assertTrue(postojiLi);
    }

    @Test
    void getArtikli() {
       boolean sviPrisutni=false;
        Artikl[]niz=new Artikl[1000];
        niz[0]=a;
        if(Arrays.equals(s.getArtikli(),niz))
            sviPrisutni=true;
       assertTrue(sviPrisutni);

    }

    @Test
    void izbaciArtiklSaKodom() {
        s.izbaciArtiklSaKodom(b.getKod());
        boolean postojiLi= Arrays.asList(s.getArtikli()).contains(b);
        assertFalse(postojiLi);

    }
}