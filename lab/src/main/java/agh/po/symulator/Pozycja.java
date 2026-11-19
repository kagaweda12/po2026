package agh.po.symulator;

public class Pozycja {
    private double x;
    private double y;
    public Pozycja(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void aktualPozycja(double primX, double primY) {
        this.x += primX;
        this.y += primY;
    }
    public String getPozycja() {
        return "(" + x + ", " + y + ")";
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
}
