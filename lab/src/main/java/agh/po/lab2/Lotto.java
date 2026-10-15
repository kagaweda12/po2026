package agh.po.lab2;

import java.util.Random;
import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Random l = new Random();
        ArrayList<Integer> new1 = new ArrayList<>();
        ArrayList<Integer>  strzal = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int liczba = l.nextInt(1, 50);
            new1.add(liczba);

        }

        System.out.println(new1);
    }
}
