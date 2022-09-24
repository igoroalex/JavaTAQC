package hw9;

import hw8.Plant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {
        practicalTask1();
    }

    private static void practicalTask1() {
        System.out.println();
        System.out.println("practicalTask 91");

        ArrayList<Plant> myPlants = new ArrayList<>();

        myPlants.add(new Plant(100, "blue", "tree"));
        myPlants.add(new Plant(40, "green", "tree"));
        myPlants.add(new Plant(90, "yellow", "root"));
        myPlants.add(new Plant(70, "yellow", "bush"));
        myPlants.add(new Plant(80, "green", "bush"));

        System.out.println("myPlants: " + myPlants);

        myPlants.sort(new Plant.SizeComparator());
//        Arrays.sort(myPlants, Plant::SizeComparator);
        System.out.println("myPlants: " + myPlants);

        List<Plant> m = myPlants.stream().
                filter(i->i.getSize()>70).
                collect(Collectors.toList());
        System.out.println("myPlants: " + m);

        myPlants.forEach(System.out::println);

        List<Integer> d = myPlants.stream().
                map(i-> i.getSize()*i.getSize()).
                distinct().
                collect(Collectors.toList());
        System.out.println("myPlants: " + d);

        String merged = d.stream().
                map(i->i.toString()).
                collect(Collectors.joining("-"));
        System.out.println("myPlants: " + merged);
    }
}
