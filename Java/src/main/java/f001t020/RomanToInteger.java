package f001t020;

import java.util.HashMap;

public class RomanToInteger {
    HashMap<Character, Integer> map = new HashMap(){{
        put('I',  1);put('V',  5);put('X',  10);
        put('L',  50);put('C',  100);
        put('D',  500);put('M', 1000);
    }};
    public int romanToInt(String s) {
        int length = s.length();
        int result = 0;
        boolean isSmaller;
        for (int i = 0; i < length; ++i) {
            if (i == length-1) {
                result += map.get(s.charAt(i));
                break;
            }
            switch (s.charAt(i)) {
                case 'I':
                    isSmaller = (s.charAt(i+1) == 'V'
                            || s.charAt(i+1) == 'X');
                    break;
                case 'X':
                    isSmaller = (s.charAt(i+1) == 'L'
                            || s.charAt(i+1) == 'C');
                    break;
                case 'C':
                    isSmaller = (s.charAt(i+1) == 'D'
                            || s.charAt(i+1) == 'M');
                    break;
                default:
                    isSmaller = false;
                    break;
            }
            if (isSmaller) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        return result;
    }
}
