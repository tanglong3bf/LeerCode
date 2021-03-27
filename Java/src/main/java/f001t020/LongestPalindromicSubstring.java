package f001t020;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) return s;
        StringBuilder res = new StringBuilder();
        int l = 0;
        int r = 0;
        for (int n = 0; n < s.length(); ++n) {
            l = r = n;
            for (int i = 1; i <= Math.min(n, s.length()-n-1); ++i) {
                l = n-i;
                r = n+i;
                if (s.charAt(l) != s.charAt(r)) {
                    ++l;
                    --r;
                    break;
                }
            }
            if (r - l + 1 > res.length()) {
                res.replace(0, res.length(), s.substring(l, r+1));
            }
        }
        for (int n = 1; n < s.length(); ++n) {
            if (s.charAt(n-1) != s.charAt(n)) {
                continue;
            }
            l = n - 1;
            r = n;
            for (int i = 1; i <= Math.min(n-1, s.length()-n-1); ++i) {
                l = n-i-1;
                r = n+i;
                if (s.charAt(l) != s.charAt(r)) {
                    ++l;
                    --r;
                    break;
                }
            }
            if (r - l + 1 > res.length()) {
                res.replace(0, res.length(), s.substring(l, r+1));
            }
        }
        return res.toString();
    }
}
