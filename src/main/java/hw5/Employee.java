package hw5;

public class Employee {
    private String name;
    private int department_number;
    private int salary;

    public Employee(String name, int department_number, int salary) {
        this.name = name;
        this.department_number = department_number;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department_number=" + department_number +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        Employee[] allEmployees = {new Employee("Mulder", 2, 1000),
                new Employee("Scully", 2, 2000),
                new Employee("Sciner", 1, 1500),
                new Employee("Crichek", 100, 800),
                new Employee("Smoker", 100, 100000),
        };

        System.out.println("Employees of department 2");
        Employee[] employeesOf2 = employeesOfDepartment(allEmployees, 2);
        for (Employee ele : employeesOf2){
            if (ele == null){
                continue;
            }
            System.out.println(ele);
        }

        System.out.println("Sorted Employees by salary");
        Employee[] sortedEmployees = sortedEmployeesSalary(allEmployees);
        for (Employee ele : sortedEmployees){
            System.out.println(ele);
        }

    }

    public static Employee[] employeesOfDepartment(Employee[] allEmployees, int curDepartment) {
        Employee[] temp = new Employee[allEmployees.length];
        int i = 0;
        for (Employee ele : allEmployees) {
            if (ele.department_number == curDepartment) {
                temp[i] = ele;
                i++;
            }
        }
        return temp;
    }
    public static Employee[] sortedEmployeesSalary(Employee[] allEmployees){
        Employee[] sortedEmployees = allEmployees.clone();
        Employee tmp;
        for (int i = 0; i < sortedEmployees.length - 1; i++) {
            for (int j = i + 1; j < sortedEmployees.length; j++) {
                if (sortedEmployees[i].salary < sortedEmployees[j].salary) {
                    tmp = sortedEmployees[i];
                    sortedEmployees[i] = sortedEmployees[j];
                    sortedEmployees[j] = tmp;
                }
            }
        }
        return sortedEmployees;
    }
}
