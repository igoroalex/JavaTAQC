package hw6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PracticalTask1Test {
    PracticalTask1 ptTest = new PracticalTask1(10);

    @BeforeEach
    public void changeCollection(){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 30; i+=2) {
            res.add(i);
        }
        ptTest.setMyCollection(res);

    }
    @Test
    public void testGetNewCollection(){
        assertEquals(4, ptTest.getNewCollection().size());
    }

    @Test
    public void testRemove20() {
        assertEquals(4, ptTest.getNewCollection().size());
    }

    @Test
    public void testCheat() {
        ptTest.cheat();
        assertEquals(-1, ptTest.getMyCollection().get(2));
    }
    @Test
    public void testSort() {
        ptTest.sort();
        assertEquals(0, ptTest.getMyCollection().get(0));
    }
}