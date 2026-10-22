package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto2 {
    public static void main(String[] args) {
        if (args.length != 6) {
            System.out.println("Proszę podać dokładnie 6 liczb");
            return;
        }
        ArrayList<Integer> wybrane = new ArrayList<>(); // lista typow

        for(int i = 0; i < args.length; i++) { // dodawanie argumentow tekstowyh do listy
            wybrane.add(Integer.parseInt(args[i])); // ze stringa na integer
        }
        Random l = new Random();
        ArrayList<Integer> wylosowane = new ArrayList<>();

        while(wylosowane.size() < 6) { // petla na uzyskanie 6 liczb
            int liczba = l.nextInt(1, 50); // zakres liczb
            if (!wylosowane.contains(liczba)) { // unikalne liczby
                wylosowane.add(liczba);
            }
        }
        System.out.println("Typy uzytkownika: " + wybrane);
        System.out.println("Wylosowane liczby: " + wylosowane);

        // kopia listy typow aby moc zliczyc trafienia
        ArrayList<Integer> trafienia = new ArrayList<>(wybrane);

        // sprawdzenie ktore elementy z typow sa w wylsoowane i je zostawiamy w trafieniach
        trafienia.retainAll(wylosowane);

        System.out.println("Liczba trafień: " + trafienia.size());
    }
}