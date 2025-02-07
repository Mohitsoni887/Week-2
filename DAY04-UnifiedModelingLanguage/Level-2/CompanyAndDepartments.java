import java.util.ArrayList;

// Employee class
class Employee {
    private String name;
    private String role;

    // Constructor
    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', role='" + role + "'}";
    }
}

// Department class
class Department {
    private String name;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display all employees in the department
    public void displayEmployees() {
        System.out.println("Department: " + name);
        for (Employee employee : employees) {
            System.out.println("  " + employee);
        }
    }

    @Override
    public String toString() {
        return "Department{name='" + name + "', employees=" + employees + '}';
    }
}

// Company class
class Company {
    private String name;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display all departments and their employees
    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }
}

// Main class
public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Create departments
        Department dept1 = new Department("IT");
        Department dept2 = new Department("HR");

        // Create employees
        Employee emp1 = new Employee("Alice", "Software Engineer");
        Employee emp2 = new Employee("Bob", "System Analyst");
        Employee emp3 = new Employee("Charlie", "HR Manager");
        Employee emp4 = new Employee("Diana", "Recruiter");

        // Add employees to departments
        dept1.addEmployee(emp1);
        dept1.addEmployee(emp2);
        dept2.addEmployee(emp3);
        dept2.addEmployee(emp4);

        // Add departments to the company
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Display company structure
        company.displayDepartments();

        // Composition in action: Deleting the company would delete departments and employees.
        System.out.println("\nDeleting company...");
        company = null; 
    }
}
