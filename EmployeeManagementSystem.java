// Abstract class
abstract class Employee {
    String name;
    int age;

    // Constructor
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract double calculateSalary();
    abstract void displayDetails();
}

// Full-time employee class
class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " (Full-Time) - Age: " + age + ", Salary: " + salary);
    }
}

// Part-time employee class
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println(name + " (Part-Time) - Age: " + age + ", Hourly Rate: " + hourlyRate + ", Hours Worked: " + hoursWorked);
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("Alice", 30, 5000);
        Employee emp2 = new PartTimeEmployee("Bob", 22, 20, 80);

        emp1.displayDetails();
        System.out.println("Salary: " + emp1.calculateSalary());
        System.out.println();

        emp2.displayDetails();
        System.out.println("Salary: " + emp2.calculateSalary());
    }
}
