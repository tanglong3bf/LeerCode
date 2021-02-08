package f001t020;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses = new ValidParentheses();
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
        assertTrue(validParentheses.isValid("{[]}"));
    }
}