package hw7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticalTask71Test {

    @Test
    void containsSubstring() {
        boolean res = PracticalTask71.isSubstring("IT Academy", "IT");
        assertTrue(res);
    }
    @Test
    void containsSubstringSpace() {
        boolean res = PracticalTask71.isSubstring("IT Academy", " IT");
        assertFalse(res);
    }
}