package agh.po.symulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PozycjaTest {

    @Test
    // dodatnie wspolrzedne
    void przemiescWartosciDodatnie() {
        Pozycja p = new Pozycja(0.0, 0.0);
        Pozycja cel = new Pozycja(10.0, 0.0);

        p.przemiesc(0.1, 5.0, cel); // krok = v * dt = 5.0 * 0.1 = 0.5

        assertEquals(0.5, p.getX(), 1e-6);
        assertEquals(0.0, p.getY(), 1e-6);
    }
    @Test
    // dla wartosci ujemnych (ruch w strone ujemnych wspolrzednych)
    void przemiescWartosciUjemne() {
        Pozycja p = new Pozycja(0.0, 0.0);
        Pozycja cel_ujemny = new Pozycja(-10.0, 0.0);
        p.przemiesc(0.1, 5.0, cel_ujemny);
        assertEquals(-0.5, p.getX(), 1e-6);
        assertEquals(0.0, p.getY(), 1e-6);

        // Ujemne dt lub v nie powinno cofać obiektu
        p.przemiesc(-0.1, 5.0, cel_ujemny);
        p.przemiesc(0.1, -5.0, cel_ujemny);
        assertEquals(-0.5, p.getX(), 1e-6);
    }

}