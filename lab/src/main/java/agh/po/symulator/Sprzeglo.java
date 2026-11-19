package agh.po.symulator;

public class Sprzeglo extends Komponent {
    private boolean stanSprzeglo; // czy jest wcisniete

    public Sprzeglo(String nazwa, double waga, double cena) {
        super(nazwa, waga, cena); // do klasy komponent uruchamiamy konstruktor
        this.stanSprzeglo = false;
    }
    public void wcisnij(){
        this.stanSprzeglo = true;
        System.out.println("Sprzeglo wcisniete");
    }
    public void zwolnij(){
        this.stanSprzeglo = false;
        System.out.println("Sprzeglo zwolnione");
    }
    public boolean isSprzeglo(){
        return this.stanSprzeglo;
    }
}
