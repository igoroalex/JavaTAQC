package hw7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework73Test {
    @Test
    void correctUSCurrency() {
        boolean res = Homework73.isUSCurrency("$45.12");
        assertTrue(res);
    }
    @Test
    void withoutUSCurrency() {
        boolean res = Homework73.isUSCurrency("45.12");
        assertFalse(res);
    }
    @Test
    void withoutInteger() {
        boolean res = Homework73.isUSCurrency("$.12");
        assertFalse(res);
    }
    @Test
    void withoutFractional() {
        boolean res = Homework73.isUSCurrency("$45.");
        assertFalse(res);
    }
    @Test
    void with5Integer() {
        boolean res = Homework73.isUSCurrency("$45784.12");
        assertTrue(res);
    }
    @Test
    void with3Fractional() {
        boolean res = Homework73.isUSCurrency("$45784.124");
        assertFalse(res);
    }
    @Test
    void withMoreLetters() {
        boolean res = Homework73.isUSCurrency("$45784.12d");
        assertFalse(res);
    }


}