package hw6;

import hw5.Employee;

import java.util.ArrayList;
import java.util.Map;

public class App {

    public static void main(String[] args) {
//        task1();
        task2();
    }

    private static void task1() {
        PracticalTask1 pt1 = new PracticalTask1(10);
        System.out.println("My collection " + pt1.getMyCollection());
        System.out.println("New collection " + pt1.getNewCollection());

//        pt1.remove20();
//        System.out.println("Remove 20 and more. My collection " + pt1.getMyCollection());

        pt1.cheat();
        System.out.println("Cheat. My collection " + pt1.getMyCollection());

        ArrayList<Integer> a = pt1.sort();
        System.out.println("Sorted. " + pt1.sort());
    }

    private static void task2() {

        ArrayList<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Employee("Mulder", 2, 1000));
        allEmployees.add(new Employee("Scully", 2, 2000));
        allEmployees.add(new Employee("Sciner", 1, 1500));
        allEmployees.add(new Employee("Crichek", 100, 800));
        allEmployees.add(new Employee("Smoker", 100, 100000));

        Map employeeMap = Employee.toMap(allEmployees);
        System.out.println("employeeMap " + employeeMap);

        int findKey = 10;
        if (employeeMap.containsKey(findKey)) {
            System.out.println(employeeMap.get(findKey));
        } else {
            System.out.println("No employee under " + findKey);
        }
        String findName = "Smoker";
        if (employeeMap.containsValue(findName)) {
            for (Map.Entry<Integer, String> rec : employeeMap.entrySet()) {
                if (rec.getValue().equals(findName)) {
                    System.out.println(rec.getKey());
                }
            }
        } else {
            System.out.println("No employee under " + findKey);
        }
    }
}
