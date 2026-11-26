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
    public void przemiesc(double dt, double v, Pozycja cel) {
        if (cel == null || dt <= 0 || v <= 0) {
            return;
        }
        double dx = cel.getX() - this.x;
        double dy = cel.getY() - this.y;
        double dystans = Math.hypot(dx, dy);

        if(dystans == 0) {
            return;
        }
        double krok = v * dt;

        if(krok >= dystans) {
            this.x = cel.getX();
            this.y = cel.getY();
        } else {
            double wspolczynnik = krok / dystans;
            this.x += dx*wspolczynnik;
            this.y += dy*wspolczynnik;
        }
    }
}
