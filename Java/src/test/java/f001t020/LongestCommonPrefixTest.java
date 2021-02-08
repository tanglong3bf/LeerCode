package f001t020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = new String[]{"flower","flow","flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs));
        strs = new String[]{"dog","racecar","car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs));
        strs = new String[]{"a","ab"};
        assertEquals("a", longestCommonPrefix.longestCommonPrefix(strs));
    }
}