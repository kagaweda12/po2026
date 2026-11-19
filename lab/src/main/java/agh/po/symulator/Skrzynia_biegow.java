package agh.po.symulator;

public class Skrzynia_biegow extends Komponent {
    private int aktualnyBieg;
    private int iloscBiegow;
    private double aktualnePrzelozenie;
    private Sprzeglo sprzeglo;

    public Skrzynia_biegow(String nazwa, double waga, double cena) {
        super(nazwa, waga, cena);
        this.iloscBiegow = iloscBiegow;
        this.sprzeglo = sprzeglo;
        this.aktualnyBieg = 0; // czyli u nas 800
        this.aktualnePrzelozenie = 0.0;
    }
    public void zwiekszBieg() {
        if (!sprzeglo.isSprzeglo()) {
            System.out.println("Błąd: Wciśnij sprzęgło przed zmianą biegu!");
            return;
        }
    }
    public int getAktualnyBieg() {
        return aktualnyBieg;
    }
    public int getIloscBiegow() {
        return iloscBiegow;
    }
}
