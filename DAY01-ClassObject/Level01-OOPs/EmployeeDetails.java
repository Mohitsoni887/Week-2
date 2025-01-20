import java.util.*;
class Employee{
    private String name;
    private String id;
    private double salary;
    
    // Creates Constructor
    Employee(String name, String id, double salary){   
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

   // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
        
    // Create Display method to display employee information
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("id: " + id);
        System.out.println("salary: " + salary);
    }
}
public class EmployeeDetails{
public static void main(String[] args){
  
    //Take input from user
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Employee Name: ");
    String name = input.nextLine();
    System.out.println("Enter Employee id: ");
    String id = input.nextLine();
    System.out.println("Enter Employee Salary: ");
    double salary = input.nextDouble();

    Employee emp = new Employee(name,id,salary);     //create object
    emp.display();         // display employee
    // FOR GETTER AND SETTER METHOD
    //Employee emp = new Employee();

    //  // Take user input and set values using setter methods
    //  System.out.print("Enter Employee Name: ");
    //  emp.setName(input.nextLine());

    //  System.out.print("Enter Employee ID: ");
    //  emp.setId(input.nextLine());

    //  System.out.print("Enter Employee Salary: ");
    //  emp.setSalary(input.nextDouble());

    //  // Display the details using getter methods
    //  emp.display();   
 
    
    input.close();
}
} 
