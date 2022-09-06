package hw6;

import hw1.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class practicalTask1Test {
    PracticalTask1 ptTest = new PracticalTask1(10);

//    @BeforeAll
    public void changeCollection(){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 30; i+=2) {
            res.add(i);
        }
        int[] arrInt = {1, 4, 6, 8, 9};
//        Arrays.copyOf(arrInt);
        ptTest.setMyCollection(res);

    }
    @Test
    public void testGetNewCollection(){
        changeCollection();
        assertEquals(4, ptTest.getNewCollection().size());
    }

    @Test
    public void testRemove20() {
        changeCollection();
        assertEquals(4, ptTest.getNewCollection().size());
    }

    @Test
    public void testCheat() {
        changeCollection();
        ptTest.cheat();
        assertEquals(-1, ptTest.getMyCollection().get(2));
    }
    @Test
    public void testSort() {
        changeCollection();
        ptTest.sort();
        assertEquals(0, ptTest.getMyCollection().get(0));
    }
}