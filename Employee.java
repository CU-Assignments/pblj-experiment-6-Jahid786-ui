// question 1
import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));
        employees.add(new Employee("David", 28, 70000));

        // Sorting by name
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by Name:");
        employees.forEach(System.out::println);

        // Sorting by age
        employees.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        // Sorting by salary
        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
// question 2
import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 25, 60000));
        employees.add(new Employee("Charlie", 35, 55000));
        employees.add(new Employee("David", 28, 70000));

        // Sorting by name using lambda expression
        employees.sort((e1, e2) -> e1.name.compareTo(e2.name));
        System.out.println("Sorted by Name:");
        employees.forEach(System.out::println);

        // Sorting by age using lambda expression
        employees.sort((e1, e2) -> Integer.compare(e1.age, e2.age));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        // Sorting by salary using lambda expression
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
