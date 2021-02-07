package f001t020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPalindromeTest {

    @Test
    void isPalindrome() {
        IsPalindrome isPalindrome = new IsPalindrome();
        assertTrue(isPalindrome.isPalindrome(121));
        assertFalse(isPalindrome.isPalindrome(-121));
        assertFalse(isPalindrome.isPalindrome(10));
        assertFalse(isPalindrome.isPalindrome(-101));
    }
}