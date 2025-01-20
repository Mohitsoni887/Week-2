// Course Class
class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class variable (shared among all Course objects)
    private static String instituteName = "Default Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName); // Accessing class variable
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        if (newInstituteName != null && !newInstituteName.trim().isEmpty()) {
            instituteName = newInstituteName;
        } else {
            System.out.println("Invalid institute name.");
        }
    }
}

// Main Class to Demonstrate Functionality
public class OnlineCourseManagement {
    public static void main(String[] args) {
        // Setting the institute name
        Course.updateInstituteName("TechLearn Academy");

        // Creating Course objects
        Course course1 = new Course("Java Programming", 8, 300.0);
        Course course2 = new Course("Web Development", 12, 500.0);

        // Displaying course details
        System.out.println("--- Course Details ---");
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();

        // Updating the institute name
        Course.updateInstituteName("Global Tech Institute");
        System.out.println("\n--- Updated Institute Name ---");

        // Displaying updated course details
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
    }
}
