package src.lesson23;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        int i = romanToInteger.romanToInt("LIX"); //59
        System.out.println(i);
    }

    public int romanToInt(String s) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int number = getInt(s.charAt(i));
            if (i < s.length()-1 && number < getInt(s.charAt(i+1)) ) {
                res -= number;
            } else {
                res += number;
            }
        }

        return res;
    }

    private int getInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new RuntimeException();
        };
    }






















    public int romanToIntV1(String s) {

        Map<Character, Integer> romans = new HashMap<>();
        romans.put('M', 1000);
        romans.put('D', 500);
        romans.put('C', 100);
        romans.put('L', 50);
        romans.put('X', 10);
        romans.put('V', 5);
        romans.put('I', 1);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer number = romans.get(s.charAt(i));

            if ( i<s.length()-1 && number < romans.get(s.charAt(i+1)) ) {
                res -= number;
                continue;
            }

            res += number;
        }

        return res;
    }


    public int romanToIntV2(String s) {

        Map<Character, Integer> romans = new HashMap<>();
        romans.put('M', 1000);
        romans.put('D', 500);
        romans.put('C', 100);
        romans.put('L', 50);
        romans.put('X', 10);
        romans.put('V', 5);
        romans.put('I', 1);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            Integer number = romans.get(s.charAt(i));

            if ( i<s.length()-3 && number < romans.get(s.charAt(i+3)) ||
                    i<s.length()-2 && number < romans.get(s.charAt(i+2)) ||
                    i<s.length()-1 && number < romans.get(s.charAt(i+1)) ) {
                res -= number;
                continue;
            }

            res += number;
        }

        return res;
    }

}
