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

}
