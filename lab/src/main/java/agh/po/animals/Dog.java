package agh.po.animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, 4);
    }
    public String getDescription() {
        return "Pies nazywa sie: " + name + "posiada " + legs + "nog";
    }
}
