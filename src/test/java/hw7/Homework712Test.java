package hw7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Homework712Test {

    @Test
    void longestWord() {
        Homework712 sen = new Homework712("as asd asdf asdfgh");
        String res = sen.longestWord();
        assertEquals("asdfgh", res);
    }

    @Test
    void countLetters() {
        Homework712 sen = new Homework712("as asd asdf asdfgh");
        int res = sen.countLetters();
        assertEquals(15, res);
    }

    @Test
    void getWithoutDuplicateSpaces() {
        Homework712 sen = new Homework712("as    asd  asdf     asdfgh      ");
        String res = sen.getWithoutDuplicateSpaces();
        assertEquals("as asd asdf asdfgh ", res);
    }
}