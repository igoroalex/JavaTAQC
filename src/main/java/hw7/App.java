package hw7;

public class App {

    public static void main(String[] args) {
        practicalTask();
        homework1();
        homework3();
    }

    private static void practicalTask() {
        System.out.println();
        System.out.println("practicalTask");
        System.out.println("IT Academy" + " // " + "IT");

        boolean res = PracticalTask71.isSubstring("IT Academy", "IT");
        System.out.println("Contains = " + res);
    }

    private static void homework1() {
        System.out.println();
        System.out.println("homework1");
        String value = "I'm     learning  Java    Core test";
        System.out.println(value);

        Homework712 sentence = new Homework712(value);
        System.out.println("longestWord = " + sentence.longestWord());
        System.out.println("countLetters = " + sentence.countLetters());
        System.out.println("getWithoutDuplicateSpaces = " + sentence.getWithoutDuplicateSpaces());
    }

    private static void homework3() {
        System.out.println();
        System.out.println("homework3");
        String value = "$45.14";
        System.out.println(value);

        System.out.println("isUSCurrency = " + Homework73.isUSCurrency(value));
    }
}
