package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Korpa {
    Artikl[] nizArtikala=new Artikl[50];
    static int brojac=0;
    public Artikl[] getArtikli() {
        return nizArtikala;
    }


    public boolean dodajArtikl(Artikl a) {
        if (brojac<49) {
            nizArtikala[brojac]=a ;
            brojac++;
            return true;
        }
        else
            return false;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<brojac; i++){
            if(nizArtikala[i].getKod().equals(kod)){
                //izbacivanje iz niza
                Artikl trazeni=nizArtikala[i];
                for(int j=i; j<brojac; j++)
                    nizArtikala[j]=nizArtikala[j+1];
                nizArtikala[brojac]=null;
                brojac--;

                return trazeni;
            }
        }
        return null;
    }

    public int dajUkupnuCijenuArtikala() {
        int cijena=0;
        for(int i=0; i<brojac; i++){
            cijena=cijena+nizArtikala[i].getCijena();
        }
        return cijena;

    }
}
