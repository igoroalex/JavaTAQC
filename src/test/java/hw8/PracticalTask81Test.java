package hw8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PracticalTask81Test {

    private static Stream<Arguments> sizesRectangle() {
        return Stream.of(
                Arguments.of(2, 3, 6), // null strings should be considered blank
                Arguments.of(2, 5, 10),
                Arguments.of(2, 4, 8),
                Arguments.of(3, 3, 9)
        );
    }

    @Test
    void squareRectangleCorrect() {
        int res = PracticalTask81.squareRectangle(4, 2);
        assertEquals(8, res, "4*2=8!!");
    }

    @ParameterizedTest(name = "hey-hello")
    @MethodSource("sizesRectangle")
    void squareRectangleCorrectVariableSource(int a, int b, int expected) {
        int res = PracticalTask81.squareRectangle(a, b);
        assertEquals(expected, res);
    }

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