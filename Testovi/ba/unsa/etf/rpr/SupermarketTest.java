package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    Artikl a=new Artikl("mandarina",4,"22");
    Artikl[]niz=new Artikl[1000];
    @Test
    void dodajArtikl() {
     Supermarket s=new Supermarket();
     s.dodajArtikl(a);
     boolean postojiLi=false;
     for(Artikl n: s.getArtikli()) {
      if (a.getNaziv().equals(n.getNaziv()))
       postojiLi = true;
     }
     assertTrue(postojiLi);
    }

    @Test
    void getArtikli() {

    }

    @Test
    void setNizArtikala() {
    }

    @Test
    void izbaciArtiklSaKodom() {
    }
}