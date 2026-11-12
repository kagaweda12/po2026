package agh.po.zadania;

import agh.po.animals.Animal;
import agh.po.animals.Dog;
import agh.po.animals.Parrot;
import agh.po.animals.Snake;
import java.util.Random;

public class Zoo {
    Animal[] animals = new Animal[100];
    //generujemy losowe zwierzeta w tablicy
    public void randomAnimals() {
        Random random = new Random();
        for (int i = 0; i < animals.length; i++) {
            int choice = random.nextInt(3); // losuje 0, 1 lub 2
            if (choice == 0) {
                animals[i] = new Parrot("Ara" + i);
            } else if (choice == 1) {
                animals[i] = new Dog("latek" + i);
            } else {
                animals[i] = new Snake("anakonda" + i);
            }
        }
    }

    // Metoda obliczająca sumę nóg wszystkich zwierząt
    public int sumaNog() {
        int sum = 0;
        for (Animal animal : animals) { // skrocona petle
            if (animal != null) { // zabezpiecnie przed brakiem liczby
                sum += animal.getLegs();
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.randomAnimals();
        System.out.println("Suma nóg wszystkich zwierząt w Zoo: " + zoo.sumaNog());
    }
}
