package f001t020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse() {
        ReverseInteger reverseInteger = new ReverseInteger();
        assertEquals(321, reverseInteger.reverse(123));
    }
}