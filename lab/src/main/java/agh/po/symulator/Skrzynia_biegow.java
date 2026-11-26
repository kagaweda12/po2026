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

    private void aktualizujPrzelozenie() {
        // Przykładowe przeliczenie przełożenia na podstawie aktualnego biegu
        if (aktualnyBieg == 0) {
            aktualnePrzelozenie = 0.0;
        } else {
            aktualnePrzelozenie = aktualnyBieg * 0.5;
        }
    }
    public void zwiekszBieg() throws Exception {
        if (sprzeglo == null || !sprzeglo.isSprzeglo()) {
            throw new Exception("Nie można zmienić biegu bez wciśniętego sprzęgła!");
        }
        if (aktualnyBieg < iloscBiegow) {
            aktualnyBieg++;
            aktualizujPrzelozenie();
            System.out.println("Zmieniono bieg na: " + aktualnyBieg);
        } else {
            System.out.println("Osiągnięto maksymalny bieg!");
        }
    }

    public void zmniejszBieg() throws Exception {
        if (sprzeglo == null || !sprzeglo.isSprzeglo()) {
            throw new Exception("Nie można zmienić biegu bez wciśniętego sprzęgła!");
        }
        if (aktualnyBieg > 0) {
            aktualnyBieg--;
            aktualizujPrzelozenie();
            System.out.println("Zmieniono bieg na: " + aktualnyBieg);
        } else {
            System.out.println("Skrzynia jest już na luzie (bieg 0).");
        }
    }

    public void wyzerujBieg() {
        this.aktualnyBieg = 0;
        this.aktualnePrzelozenie = 0.0;
    }

    public int getAktualnyBieg() {

        return aktualnyBieg;
    }

    public double getAktPrzelozenie() {
        return aktualnePrzelozenie;
    }

    public Sprzeglo getSprzeglo() {
        return sprzeglo;
    }
}
