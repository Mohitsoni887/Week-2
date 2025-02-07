import java.util.ArrayList;

// Course class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }

    // Enroll a student
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    // Display enrolled students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private ArrayList<Course> courses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.enrollStudent(this); // Maintain consistency
        }
    }

    // Display enrolled courses
    public void displayCourses() {
        System.out.println("Student: " + name);
        for (Course course : courses) {
            System.out.println("- " + course.getCourseName());
        }
    }
}

// School class
class School {
    private String name;
    private ArrayList<Student> students;

    // Constructor
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Add a student to the school
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    // Display all students in the school
    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Main class to demonstrate the relationships
public class SchoolStudentsCourses {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenfield Academy");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Physics");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);

        student2.enrollInCourse(course2);

        // Display students and their courses
        school.displayStudents();
        student1.displayCourses();
        student2.displayCourses();

        // Display courses and their enrolled students
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
    }
}
