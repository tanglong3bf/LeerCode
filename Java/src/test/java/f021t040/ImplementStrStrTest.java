package f021t040;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementStrStrTest {

    @Test
    void strStr() {
        ImplementStrStr strStr = new ImplementStrStr();
        assertEquals(2, strStr.strStr("hello", "ll"));
        assertEquals(-1, strStr.strStr("aaaaa", "bba"));
    }
}