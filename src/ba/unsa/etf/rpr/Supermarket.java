package ba.unsa.etf.rpr;

public class Supermarket {
Artikl[] nizArtikala=new Artikl[1000];
private static int brojac=0;
    public void dodajArtikl(Artikl artikl) {
        if(brojac<999) {
            nizArtikala[brojac] = artikl;
            brojac++;
      //      System.out.println(brojac);
        }
    }

    public Artikl[] getArtikli() {
        return nizArtikala;
    }

    public void setNizArtikala(Artikl[] nizArtikala) {
        this.nizArtikala = nizArtikala;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {
        for(int i=0; i<brojac; i++){
            if(nizArtikala[i].getKod().equals(kod)){
                //izbaciti
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
}
