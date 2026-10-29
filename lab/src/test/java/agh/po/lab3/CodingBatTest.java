package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();

    @org.junit.Test
    public void nearHundred() {
        assertEquals(true, cb.nearHundred(150));
        assertEquals(true, cb.nearHundred(120));
        assertEquals(true, cb.nearHundred(210));
    }

    @org.junit.Test
    public void sleepIn() {
        assertEquals(true, cb.sleepIn(true, true));
        assertEquals(true, cb.sleepIn(false, true));
        assertEquals(true, cb.sleepIn(false, false));
    }

    @org.junit.Test
    public void diff21() {
        assertEquals(true, cb.diff21(21));
        assertEquals(true, cb.diff21(13));
        assertEquals(true, cb.diff21(211));

    }

    @org.junit.Test
    public void stringTimes() {
        assertEquals(true, cb.stringTimes("Hi", 2));
        assertEquals(true, cb.stringTimes("Hi", 2));
        assertEquals(true, cb.stringTimes("Hi", 2));

    }
}