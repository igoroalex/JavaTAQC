package hw5;

import java.util.ArrayList;
import java.util.List;

import static hw5.Arrays.*;
import static hw5.Employee.*;

public class App {

    public static void main(String[] args) {
        arrays();
        employees();
    }

    private static void arrays() {
        int[] a = {-45, 78, 56, 13, -16, 21, 36, 25, 34, 36};

        System.out.println(max(a));
        System.out.println(sumPositive(a));
        System.out.println(amountNegative(a));
        System.out.println(amountPositive(a));

        String msg = isMorePositive(a) ? "More positive" : "More negative";
        System.out.println(msg);
    }

    public static void employees() {

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new Employee("Mulder", 2, 1000));
        allEmployees.add(new Employee("Scully", 2, 2000));
        allEmployees.add(new Employee("Sciner", 1, 1500));
        allEmployees.add(new Employee("Crichek", 100, 800));
        allEmployees.add(new Employee("Smoker", 100, 100000));

        System.out.println("Employees of department 2");
        List<Employee> employeesOf2 = employeesOfDepartment(allEmployees, 2);
        for (Employee ele : employeesOf2) {
            System.out.println(ele);
        }

        System.out.println("Sorted Employees by salary");
        List<Employee> sortedEmployees = sortedEmployeesSalary(allEmployees);
        for (Employee ele : sortedEmployees) {
            System.out.println(ele);
        }

    }
}
