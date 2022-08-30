import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testPlus(){
        assertEquals(11, calc.plus(5, 6));
    }

    @Test
    public void testMinus(){
        assertEquals(4, calc.minus(10, 6));
    }

    @Test
    public void testMultiplication(){
        assertEquals(30, calc.multiplication(5, 6));
    }

    @Test
    public void testDivision(){
        assertEquals(2, calc.division(10, 5));
    }

}
