// Base Student Class
class Student {
    public int rollNumber; // Public: Accessible everywhere
    protected String name; // Protected: Accessible by subclasses and within the package
    private double CGPA; // Private: Accessible only within the Student class

    // Constructor to initialize Student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to set the CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Public method to get the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass PostgraduateStudent
class PostgraduateStudent extends Student {
    private String researchTopic; // Specific to PostgraduateStudent

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String researchTopic) {
        super(rollNumber, name, CGPA); // Call the parent class constructor
        this.researchTopic = researchTopic;
    }

    // Method to display postgraduate student details
    public void displayPostgraduateDetails() {
        System.out.println("--- Postgraduate Student Details ---");
        System.out.println("Roll Number: " + rollNumber); // Accessing public field
        System.out.println("Name: " + name); // Accessing protected field
        System.out.println("CGPA: " + getCGPA()); // Accessing private field using public method
        System.out.println("Research Topic: " + researchTopic);
    }
}

// Main Class to Demonstrate Functionality
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student = new Student(101, "John Doe", 8.5);
        System.out.println("--- Student Details ---");
        student.displayStudentDetails();

        // Modifying CGPA using public method
        student.setCGPA(9.0);
        System.out.println("\n--- Updated Student Details ---");
        student.displayStudentDetails();

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Jane Smith", 9.2, "Artificial Intelligence");
        System.out.println("\n--- Postgraduate Student Details ---");
        pgStudent.displayPostgraduateDetails();
    }
}
