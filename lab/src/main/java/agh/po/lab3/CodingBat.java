package agh.po.lab3;

public class CodingBat {
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.print("NearHundred: " + cb.nearHundred(150));
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
    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }
}


