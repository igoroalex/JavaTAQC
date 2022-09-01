package hw1;

public class FirstHello {
    public static void main(String... args) {

        System.out.println("Hello world");

        ShowArgs(args);
    }

    private static int method1(int a, int b){
        return a+b;
    }
    /**
     *
     * @param args
     */
    public static void ShowArgs(String[ ] args) {
        for (int i=0; i<args.length; i++) {
            System.out.println("Arg " + i + " is " + args[i]);
        }
    }
}
