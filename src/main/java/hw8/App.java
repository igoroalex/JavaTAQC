package hw8;

import hw7.PracticalTask71;

public class App {

    public static void main(String[] args) {
        practicalTask1();
    }

    private static void practicalTask1() {
        System.out.println();
        System.out.println("practicalTask 81");
        System.out.println("IT Academy" + " // " + "IT");

        int res = PracticalTask81.squareRectangle(2, 4);
        System.out.println("Contains = " + res);
        res = PracticalTask81.squareRectangle(2, -8);
        System.out.println("Contains = " + res);
    }
}
