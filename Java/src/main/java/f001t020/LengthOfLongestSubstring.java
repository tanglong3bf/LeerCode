package f001t020;

import static java.lang.Math.max;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        boolean []hashTable = new boolean[128];
        int i = 0;
        int j = 0;
        int maxLength = 0;
        while (j != s.length()) {
            if (hashTable[(int)(s.charAt(j))]) {
                do {
                    hashTable[(int) (s.charAt(i))] = false;
                } while (s.charAt(i++) != s.charAt(j));
            }
            else {
                hashTable[(int)(s.charAt(j++))] = true;
            }
            maxLength = Math.max(j-i, maxLength);
        }
        return maxLength;
    }
}
