package hw5;

import java.util.*;

public class Employee {

    private static int sequence;
    private int id;
    private String name;
    private int departmentNumber;
    private int salary;

    public Employee(String name, int department_number, int salary) {
        super();
        this.name = name;
        this.departmentNumber = department_number;
        this.salary = salary;
        sequence++;
        this.id = sequence;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + getSalary() +
                '}';
    }

    public static List<Employee> employeesOfDepartment(List<Employee> allEmployees, int searchDepartment) {
        List<Employee> res = new ArrayList<>();

        for (Employee ele : allEmployees) {
            if (ele.departmentNumber == searchDepartment) {
                res.add(ele);
            }
        }
        return res;
    }


    public static List<Employee> sortedEmployeesSalary(List<Employee> allEmployees) {
        List<Employee> sortedEmployees = new ArrayList<>(allEmployees);
        sortedEmployees.sort(new SalaryComparator());
        return sortedEmployees;
    }

    private static class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.salary - o2.salary;
        }
    }

    public static Map toMap(ArrayList<Employee> allEmployees) {
        Map res = new HashMap();
        for (Employee x : allEmployees) {
            res.put(x.id, x.name);
        }
        return res;
    }
}
