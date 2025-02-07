import java.util.ArrayList;

// Student Class
class Student {
    private String name;
    private ArrayList<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void displaySubjects() {
        System.out.println("Subjects for " + name + ":");
        for (Subject subject : subjects) {
            System.out.println(subject.getSubjectName() + " - Marks: " + subject.getMarks());
        }
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
}

// Subject Class
class Subject {
    private String subjectName;
    private double marks;

    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public double getMarks() {
        return marks;
    }
}

// GradeCalculator Class
class GradeCalculator {
    public String calculateGrade(Student student) {
        double totalMarks = 0;
        int subjectCount = student.getSubjects().size();
        
        for (Subject subject : student.getSubjects()) {
            totalMarks += subject.getMarks();
        }

        double averageMarks = totalMarks / subjectCount;
        if (averageMarks >= 90) {
            return "A";
        } else if (averageMarks >= 80) {
            return "B";
        } else if (averageMarks >= 70) {
            return "C";
        } else {
            return "D";
        }
    }
}

// Main class to test the application
public class SchoolResultsApplication {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student("John");

        // Create Subjects
        Subject subject1 = new Subject("Maths", 90);
        Subject subject2 = new Subject("Science", 85);

        // Add Subjects to Student
        student.addSubject(subject1);
        student.addSubject(subject2);

        // Display Student and Subject details
        student.displaySubjects();

        // Calculate Grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student);

        System.out.println("Grade for " + student.getName() + ": " + grade);
    }
}
