package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {
    CodingBat cb = new CodingBat();

    @org.junit.Test
    public void nearHundred() {
        assertTrue(cb.nearHundred(90));
        assertTrue(cb.nearHundred(93));
        assertFalse(cb.nearHundred(89));
    }

    @org.junit.Test
    public void sleepIn() {
        assertTrue(cb.sleepIn(true, true));
        assertTrue(cb.sleepIn(false, true));
        assertTrue(cb.sleepIn(false, false));
    }

    @org.junit.Test
    public void diff21() {
        assertEquals(2, cb.diff21(19));
        assertEquals(11, cb.diff21(10));
        assertEquals(0, cb.diff21(21));
    }

    @org.junit.Test
    public void stringTimes() {
        assertEquals("HiHi", cb.stringTimes("Hi", 2));
        assertEquals("HiHiHi", cb.stringTimes("Hi", 3));
        assertEquals("Hi", cb.stringTimes("Hi", 1));
    }
}