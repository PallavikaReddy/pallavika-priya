import java.util.*;
import java.util.stream.*;

class Emp {
    String name;
    int age;
    double salary;

    // Constructor
    Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

public class Employees {
    public static void main(String[] args) {
        List<Emp> employees = Arrays.asList(  // Use Arrays.asList instead of List.of
            new Emp("Alice", 28, 50000),
            new Emp("Bob", 35, 60000),
            new Emp("Charlie", 40, 70000),
            new Emp("David", 45, 80000),
            new Emp("Eve", 32, 75000)
        );

        List<String> names = employees.stream()
            .filter(e -> e.age > 30)
            .map(e -> e.name)
            .collect(Collectors.toList());

        double avgSalary = employees.stream()
            .filter(e -> e.age > 30)
            .mapToDouble(e -> e.salary)
            .average()
            .orElse(0);

        System.out.println("Employees older than 30: " + names);
        System.out.println("Average Salary: " + avgSalary);
    }
}
