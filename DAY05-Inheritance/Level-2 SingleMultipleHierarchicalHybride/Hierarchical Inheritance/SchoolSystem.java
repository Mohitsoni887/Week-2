/*
 *School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.

 */
// Base Class: Person
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display role (to be overridden)
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    // Constructor
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }
}

// Main Class to Test the Hierarchy
public class SchoolSystem {
    public static void main(String[] args) {
        // Create instances for each role
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        Student student = new Student("Bob", 16, "10th Grade");
        Staff staff = new Staff("Charlie", 40, "Administration");

        // Display details and roles
        System.out.println("Teacher Details:");
        teacher.displayDetails();
        teacher.displayRole();
        System.out.println();

        System.out.println("Student Details:");
        student.displayDetails();
        student.displayRole();
        System.out.println();

        System.out.println("Staff Details:");
        staff.displayDetails();
        staff.displayRole();
    }
}

