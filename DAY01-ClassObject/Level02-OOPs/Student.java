import java.util.Scanner;

class Student {
    // Private attributes
    private String name;
    private String rollNumber;
    private int marks;

    // Constructor to initialize the Student object
    public Student(String name, String rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for rollNumber
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    // Getter and Setter for marks
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        String grade = calculateGrade();
        System.out.println("Student Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("Marks: " + getMarks());
        System.out.println("Grade: " + grade);
    }

    // Main method to take input and test the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Roll Number: ");
        String rollNumber = scanner.nextLine();
        
        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();

        // Creating a student object with the user input
        Student student = new Student(name, rollNumber, marks);

        // Displaying student details
        student.displayDetails();

        // Closing the scanner
        scanner.close();
    }
}
