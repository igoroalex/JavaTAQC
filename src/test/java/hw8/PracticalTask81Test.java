package hw8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticalTask81Test {

    @Test
    void squareRectangleCorrect() {
        int res = PracticalTask81.squareRectangle(4, 2);
        assertEquals(8, res, "4*2=8!!");
    }

//    static Stream<Arguments> sizesRectangle = Stream.of(
//            Arguments.of(2, 3, 6), // null strings should be considered blank
//            Arguments.of(2, 5, 10),
//            Arguments.of(2, 4, 8),
//            Arguments.of(3, 3, 9),
//    );
//
//    @ParameterizedTest
//    @VariableSource("sizesRectangle")
//    void squareRectangleCorrectVariableSource(int a, int b, int expected) {
//        int res = PracticalTask81.squareRectangle(a, b);
//        assertEquals(expected, res);
//    }

    @Test
    void squareRectangleNegative() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            int res = PracticalTask81.squareRectangle(4, -2);
        });

        String expectedMessage = "not -";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "must be not -");
    }


}