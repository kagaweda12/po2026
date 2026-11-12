package agh.po.animals;

public class Parrot extends Animal {
    public Parrot(String name) {
        super(name, 2); // super odnosi sie do klasy animal uruchamia konstruktor
    }
    public String getDescription() {
        return "Papuga nazywana: " + name + "posiada " + legs + "nog";
    }
}
