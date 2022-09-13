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
        int res = ptTest.getMyCollection().size();
        assertEquals(4, res);
    }

    @Test
    public void testRemove20() {
        int res = ptTest.getMyCollection().size();
        assertEquals(4, res);
    }

    @Test
    public void testCheat() {
        ptTest.cheat();
        int res = ptTest.getMyCollection().get(2);
        assertEquals(-1, res);
    }
    @Test
    public void testSort() {
        ptTest.sort();
        int res = ptTest.getMyCollection().get(0);
        assertEquals(0, res);
    }
}