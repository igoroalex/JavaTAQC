package hw5;

public class Arrays {

    public static void main(String[] args) {
        int[] a = {-45, 78, 56, 13, -16, 21, 36, 25, 34, 36};

        System.out.println(maxAge(a));
        System.out.println(sumPositive(a));
        System.out.println(amountNegative(a));
        System.out.println(amountPositive(a));
        String msg = isMorePositive(a) ? "More positive" : "More negative";
        System.out.println(msg);
    }

    public static boolean isMorePositive(int[] a) {
        return amountPositive(a) > amountNegative(a);
    }
    public static int maxAge(int[] a) {
        int temp = a[0];
        for (int ele : a) {
            if (ele > temp) {
                temp = ele;
            }
        }
        return temp;
    }

    public static int sumPositive(int[] a){
        int temp = 0;
        for (int ele : a){
            if (ele > 0){
                temp = temp + ele;
            }
        }
        return temp;
    }

    public static int amountNegative(int[] a){
        int temp = 0;
        for (int ele : a){
            if (ele < 0){
                temp ++;
            }
        }
        return temp;
    }
    public static int amountPositive(int[] a){
        int temp = 0;
        for (int ele : a){
            if (ele > 0){
                temp ++;
            }
        }
        return temp;
    }
}
