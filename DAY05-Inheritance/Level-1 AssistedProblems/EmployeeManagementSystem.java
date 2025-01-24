/*
 * Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
 */

// Base Class: Employee
abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }

    // Abstract method for role-specific behavior
    public abstract void displayRole();
}

// Subclass: Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Manager responsible for a team of " + teamSize + " members.");
    }
}

// Subclass: Developer
class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Developer proficient in " + programmingLanguage + ".");
    }
}

// Subclass: Intern
class Intern extends Employee {
    private String university;

    // Constructor
    public Intern(String name, int id, double salary, String university) {
        super(name, id, salary);
        this.university = university;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("University: " + university);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is an Intern currently studying at " + university + ".");
    }
}

// Main class to test the hierarchy
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects for each subclass
        Employee manager = new Manager("Alice", 101, 75000, 10);
        Employee developer = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000, "XYZ University");

        // Display details and roles
        manager.displayDetails();
        manager.displayRole();
        System.out.println();

        developer.displayDetails();
        developer.displayRole();
        System.out.println();

        intern.displayDetails();
        intern.displayRole();
    }
}
