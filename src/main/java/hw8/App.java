package hw8;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
//        practicalTask1();
        practicalTask2();
    }

    private static void practicalTask1() throws ArithmeticException {
        System.out.println();
        System.out.println("practicalTask 81");

        try {
            int res = PracticalTask81.squareRectangle(2, 4);
            System.out.println("result = " + res);
            res = PracticalTask81.squareRectangle(2, -8);
            System.out.println("result = " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void practicalTask2() {
        System.out.println();
        System.out.println("practicalTask 82");

        ArrayList<Plant> myPlants = new ArrayList<>();

        try {
            myPlants.add(new Plant(100, "blue", "tree"));
            myPlants.add(new Plant(100, "green", "water"));
            myPlants.add(new Plant(100, "pink", "bush"));
        } catch (ColorException | TypeException e) {
            System.err.println(e);
        } catch (IllegalArgumentException e) {
            System.err.println(e + e.getMessage());
        }

        System.out.println("myPlants: " + myPlants);

    }
}
