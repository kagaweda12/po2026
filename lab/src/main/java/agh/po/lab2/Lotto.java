package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Random l = new Random();
        ArrayList<Integer> wylosowane = new ArrayList<>();
        while (wylosowane.size() < 6) { //petla na uzyskanie 6 liczb
            int liczba = l.nextInt(1, 50); // zakres liczb
            if (!wylosowane.contains(liczba)) { // unikalne liczby
                wylosowane.add(liczba);
            }
        }
        System.out.println(wylosowane);
    }
}