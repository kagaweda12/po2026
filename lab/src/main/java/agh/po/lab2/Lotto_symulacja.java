package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto_symulacja {
    public static void main(String[] args) {
        Random l = new Random();
        ArrayList<Integer> wygraneLiczby = new ArrayList<>();
        while (wygraneLiczby.size() < 6) {
            int liczba = l.nextInt(1, 50);
            if (!wygraneLiczby.contains(liczba)) {
                wygraneLiczby.add(liczba);
            }
        }

        long iloscLosowan = 0; // licznik losowan
        boolean wygrana = false;

        long czasStart = System.currentTimeMillis(); // pobranie aktulanego czasu

        while (!wygrana) {
            iloscLosowan++; // zwiekszamy licznik prób

            ArrayList<Integer> proba = new ArrayList<>();
            while (proba.size() < 6) { // losowanie 6 liczb
                int liczba = l.nextInt(1, 50);
                if (!proba.contains(liczba)) {
                    proba.add(liczba);
                }
            }

            ArrayList<Integer> trafienia = new ArrayList<>(proba); // sprawdzenie
            trafienia.retainAll(wygraneLiczby); // wygrane liczby
            if (trafienia.size() == 6) { // po trafieniu 6 petla sie konczy
                wygrana = true;
            }
        }

        long czasKoniec = System.currentTimeMillis(); // czas po zakonczeniu petli

        long lacznyCzas = czasKoniec - czasStart; // calkowity czas działania

        System.out.println("Szczesliwe liczby: " + wygraneLiczby);
        System.out.println("Liczba losowan: " + iloscLosowan);
        System.out.println("Czas dzialania: " + lacznyCzas + " ms");
    }
}