package f001t020;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int backup = x;
        int reversed = 0;
        for (; x > 0; x /= 10) {
            reversed *= 10;
            reversed += x % 10;
        }
        return reversed == backup;
    }
}
