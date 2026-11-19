package agh.po.symulator;

public class Silnik extends Komponent {
    private int max_Obroty;
    private int obroty;
    public Silnik(String nazwa, double waga, double cena, int max_Obroty) {
        super(nazwa, waga, cena);
        this.max_Obroty = max_Obroty;
        this.obroty = 0;
    }
    public void uruchom() {
        if(obroty == 0) {
            this.obroty = 800;
            System.out.println("Silnik uruchomiony, ilosc obrotow: " + obroty);
        }
    }
    public void zatrzymaj() {
        this.obroty = 0;
        System.out.println("Silnik zatrzymany, ilosc obrotow: 0");
    }
    public void zwiekszObroty() {
        if(obroty > 0) {
            if(obroty + 500 <= max_Obroty) {
                obroty = obroty + 500;
            } else {
                obroty = max_Obroty;
            }
            System.out.println("Zwiekszono obroty do: " + obroty);
        } else {
            System.out.println("ALERT: Nie uruchomiono silnika!");
        }
    }
    public void zmniejszObroty() {
        if(obroty > 800) {
            obroty = Math.max(800, obroty - 500);
            System.out.println("Zmniejszono obroty do: " + obroty);
        }
    }
    public int getMax_Obroty() {
        return max_Obroty;
    }
    public int getObroty() {
        return obroty;
    }
}
