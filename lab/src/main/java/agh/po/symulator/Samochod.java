package agh.po.symulator;

public class Samochod {
    private boolean stanWlaczenia;
    private String nrRejest;
    private String model;
    private double predkoscMax;
    private Silnik silnik;
    private Skrzynia_biegow skrzynia;
    private Pozycja aktualnaPozycja;

    public Samochod(String nrRejest, String model, double predkoscMax, Silnik silnik, Skrzynia_biegow skrzynia, Pozycja aktualnaPozycja) {
        this.nrRejest = nrRejest;
        this.model = model;
        this.predkoscMax = predkoscMax;
        this.silnik = silnik;
        this.skrzynia = skrzynia;
        this.aktualnaPozycja = aktualnaPozycja;
        this.stanWlaczenia = false;
    }

    public void wlacz() {
        this.stanWlaczenia = true;
        silnik.uruchom();
        System.out.println("Samochód " + model + " (" + nrRejest + ") został włączony.");

    }

    public void wylacz() {
        this.stanWlaczenia = false;
        silnik.zatrzymaj();
        skrzynia.wyzerujBieg();
        System.out.println("Samochód " + model + "został wyłączony.");
    }

    public double getWaga() {
        return silnik.getWaga() + skrzynia.getWaga() + skrzynia.getSprzeglo().getWaga();
    }

    public double getAktPredkosc() {
        if (!stanWlaczenia || skrzynia.getAktualnyBieg() == 0) {
            return 0.0;
        }
        double wyliczonaPredk = (silnik.getObroty() / 100.0) * skrzynia.getAktPrzelozenie();
        return Math.min(wyliczonaPredk, predkoscMax);
    }
    public Pozycja getAktPozycja() {
        return aktualnaPozycja;
    }

    public Silnik getSilnik() {
        return silnik;
    }

    public Skrzynia_biegow getSkrzynia() {
        return skrzynia;
    }

    public String getModel() {
        return model;
    }

    public String getNrRejest() {
        return nrRejest;
    }

    public boolean isStanWlaczenia() {
        return stanWlaczenia;
    }
}
