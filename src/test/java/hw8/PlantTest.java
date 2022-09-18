package hw8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlantTest {

    @Test
    void createPlant() {
        Plant curPlant = new Plant(100, "blue", "tree");
        assertEquals(100, curPlant.getSize());
        assertEquals(Color.BLUE, curPlant.getColor());
        assertEquals(Type.TREE, curPlant.getType());

    }

    @Test
    void noColor() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Plant curPlant = new Plant(100, "pink", "tree");
        });

        String expectedMessage = "No color pink";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "No color pink");
    }

    @Test
    void noType() {
        Exception exception = assertThrows(RuntimeException.class, () -> {
            Plant curPlant = new Plant(100, "green", "water");
        });

        String expectedMessage = "No type water";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "No type water");
    }
}