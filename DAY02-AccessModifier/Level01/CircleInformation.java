class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0);  // Default radius value is 1.0
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    // Method to display circle details
    public void display() {
        System.out.println("Radius: " + radius);
    }
}

public class CircleInformation {
    public static void main(String[] args) {
        // Creating a Circle using the default constructor
        Circle circle1 = new Circle();
        System.out.println("Circle 1 (Default Constructor):");
        circle1.display();

        System.out.println();

        // Creating a Circle using the parameterized constructor
        Circle circle2 = new Circle(5.0);
        System.out.println("Circle 2 (Parameterized Constructor):");
        circle2.display();
    }
}
