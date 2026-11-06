package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.print("NearHundred: " + cb.nearHundred(150));

        Map<String, String> testMap = new HashMap<>();
        testMap.put("a", "aaa");
        testMap.put("c", "cake");
        System.out.println("Przed: " + testMap);
        System.out.println("Po:    " + cb.mapAB3(testMap));
    }
    public boolean nearHundred(int n) {

        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
    }
    public boolean sleepIn(boolean weekday, boolean vacation) {

        return !weekday || vacation;
    }
    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    public Map<String, String> mapAB3(Map<String, String> map) {
        if (map.containsKey("a") && !map.containsKey("b")) {
            map.put("b", map.get("a"));
        } else if (map.containsKey("b") && !map.containsKey("a")) {
            map.put("a", map.get("b"));
        }
        return map;
    }
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            if (!map.containsKey(s)) {
                map.put(s, false);
            } else {
                map.put(s, true);
            }
        }
        return map;
    }

    public String stringTimes(String str, int n) {

        return str.repeat(n);
    }
}


