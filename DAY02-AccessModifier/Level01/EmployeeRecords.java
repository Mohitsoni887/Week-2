// Base Employee Class
class Employee {
    public int employeeID; // Public: Can be accessed directly
    protected String department; // Protected: Accessible by subclasses and within the package
    private double salary; // Private: Encapsulation ensures restricted access

    // Constructor to initialize Employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void modifySalary(double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
            System.out.println("Salary updated successfully to $" + newSalary);
        } else {
            System.out.println("Invalid salary. Please enter a positive value.");
        }
    }

    // Protected method to access salary (for subclasses)
    protected double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Manager
class Manager extends Employee {

    // Constructor for Manager (inherits from Employee)
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Call the superclass constructor
    }

    // Method to display Manager-specific details
    public void displayManagerDetails() {
        System.out.println("--- Manager Details ---");
        System.out.println("Manager ID: " + employeeID); // Accessing public field
        System.out.println("Department: " + department); // Accessing protected field
        System.out.println("Salary: $" + getSalary()); // Accessing salary using protected method
    }
}

// Main Class to Test Functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee(101, "Human Resources", 50000.0);
        System.out.println("--- Employee Details ---");
        emp.displayEmployeeDetails();

        // Modifying salary using public method
        emp.modifySalary(55000.0);
        System.out.println("\n--- Updated Employee Details ---");
        emp.displayEmployeeDetails();

        // Creating a Manager object
        Manager mgr = new Manager(201, "IT", 80000.0);
        System.out.println("\n--- Manager Details ---");
        mgr.displayManagerDetails();

        // Modifying Manager's salary
        System.out.println("\n--- Modifying Manager's Salary ---");
        mgr.modifySalary(85000.0);
        mgr.displayManagerDetails();
    }
}
