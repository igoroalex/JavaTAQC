package hw8;

public class PracticalTask81 {

    public static int squareRectangle(int a, int b) throws ArithmeticException{
        if (a < 0 || b < 0){
            throw new ArithmeticException("not -");
        }
        return a * b;
    }
}
