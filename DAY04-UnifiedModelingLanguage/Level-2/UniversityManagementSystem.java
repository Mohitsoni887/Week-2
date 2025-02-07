import java.util.ArrayList;

// Class representing a Course
class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    // Assign a Professor to the Course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " is now teaching " + this.courseName);
    }

    // Enroll a Student in the Course
    public void enrollStudent(Student student) {
        students.add(student);
        student.addCourse(this);
        System.out.println(student.getName() + " has enrolled in " + this.courseName);
    }

    // Get the name of the Course
    public String getCourseName() {
        return courseName;
    }

    // Get the list of enrolled students
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Get the assigned professor
    public Professor getProfessor() {
        return professor;
    }
}

// Class representing a Student
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll the student in a Course
    public void enrollCourse(Course course) {
        courses.add(course);
    }

    // Add course to the student’s list
    public void addCourse(Course course) {
        courses.add(course);
    }

    // List all the courses a student is enrolled in
    public void listCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Class representing a Professor
class Professor {
    private String name;
    private ArrayList<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Assign a course to the professor
    public void addCourse(Course course) {
        courses.add(course);
    }

    // List all the courses the professor teaches
    public void listCourses() {
        System.out.println(name + " is teaching the following courses:");
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }
}

// Main class to test the University Management System
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create Professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create Courses
        Course course1 = new Course("Computer Science 101");
        Course course2 = new Course("Data Structures");

        // Assign Professors to Courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Create Students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Enroll Students in Courses
        course1.enrollStudent(student1);
        course2.enrollStudent(student2);

        // List courses for Students
        student1.listCourses();
        student2.listCourses();

        // List courses for Professors
        professor1.listCourses();
        professor2.listCourses();
    }
}
