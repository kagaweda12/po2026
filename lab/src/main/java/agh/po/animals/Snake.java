package agh.po.animals;

public class Snake extends Animal {
    public Snake(String name) {
        super(name, 0);
    }
    public String getDescription() {
        return "Wąż nazywany: " + name + "nie posiada nog";
    }
}
