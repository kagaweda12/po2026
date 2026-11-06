package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

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
    public void testMapAB3() {
        CodingBat cb = new CodingBat();

        Map<String, String> input = new HashMap<>();
        input.put("a", "aaa");
        input.put("c", "cake");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "aaa");
        expected.put("b", "aaa");
        expected.put("c", "cake");

        assertEquals(expected, cb.mapAB3(input));
    }
    @org.junit.Test
    public void testOnlyBExistsWithDifferentWords() {
        CodingBat cb = new CodingBat();

        Map<String, String> input = new HashMap<>();
        input.put("b", "pies");
        input.put("x", "drzewo");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "pies");
        expected.put("b", "pies");
        expected.put("x", "drzewo");

        org.junit.Assert.assertEquals(expected, cb.mapAB3(input));
    }
    @org.junit.Test
    public void testBothAAndBExistDoNotChange() {
        CodingBat cb = new CodingBat();

        Map<String, String> input = new HashMap<>();
        input.put("a", "kot");
        input.put("b", "ptak");
        input.put("c", "cake");

        Map<String, String> expected = new HashMap<>();
        expected.put("a", "kot");
        expected.put("b", "ptak");
        expected.put("c", "cake");

        org.junit.Assert.assertEquals(expected, cb.mapAB3(input));
    }
    @org.junit.Test
    public void testSomeMultipleSomeSingle() {
        CodingBat cb = new CodingBat();
        String[] input = {"a", "b", "a", "c", "b"};

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", true);
        expected.put("c", false);

        assertEquals(expected, cb.wordMultiple(input));
    }

    @org.junit.Test
    public void testAllSingles() {
        CodingBat cb = new CodingBat();
        String[] input = {"c", "b", "a"};

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("a", false);
        expected.put("b", false);
        expected.put("c", false);

        assertEquals(expected, cb.wordMultiple(input));
    }

    @org.junit.Test
    public void testSingleKeyManyTimes() {
        CodingBat cb = new CodingBat();
        String[] input = {"c", "c", "c", "c"};

        Map<String, Boolean> expected = new HashMap<>();
        expected.put("c", true);

        assertEquals(expected, cb.wordMultiple(input));
    }
    @org.junit.Test
    public void stringTimes() {
        CodingBat cb = new CodingBat();
        assertEquals("HiHiHi", cb.stringTimes("Hi", 3));
        assertEquals("HiHi", cb.stringTimes("Hi", 2));
        assertEquals("Hi", cb.stringTimes("Hi", 1));
    }
}