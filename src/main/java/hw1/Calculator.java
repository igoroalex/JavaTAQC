package hw1;

import java.util.Scanner;

public class Calculator {

    public static void main(String... args) {

        int a = getNumber();
        int b = getNumber();

        System.out.println("a=" + a);
        System.out.println("b=" + b);

        System.out.println(a + " + " + b + " = " + plus(a, b));
        System.out.println(a + " - " + b + " = "  + minus(a, b));
        System.out.println(a + " * " + b + " = "  + multiplication(a, b));
        System.out.println(a + " / " + b + " = "  + division(a, b));
    }

    private static int getNumber(){
        Scanner sc = new Scanner(System.in);
        String xLine = sc.nextLine();
        int x = 0;
        try{
            x = Integer.parseInt(xLine);
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }
        return x;
    }

    public static int plus(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int multiplication(int a, int b){
        return a * b;
    }

    public static double division(int a, int b){
        double res;
        try{
            res = (double) a / b;
            if (res == Double.POSITIVE_INFINITY || res == Double.NEGATIVE_INFINITY)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticException occured!");
            ex.printStackTrace();
            res = 0;
        }
        return res;
    }
}
