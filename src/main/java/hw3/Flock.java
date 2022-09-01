package hw3;

public class Flock {

    public static void main(String... args){
        Bird[] flock = {new Eagle(), new Swallow(), new Penguin(), new Chicken()};
        for (Bird ele: flock){
            System.out.println(ele);
            System.out.println(ele.fly());
        }
    }
}
