package hw1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testPlus(){
        assertEquals(11, Calculator.plus(5, 6));
    }

    @Test
    public void testMinus(){
        assertEquals(4, Calculator.minus(10, 6));
    }

    @Test
    public void testMultiplication(){
        assertEquals(30, Calculator.multiplication(5, 6));
    }

    @Test
    public void testDivision(){
        assertEquals(2, Calculator.division(10, 5));
    }

}
