import java.util.Scanner;

class Circle {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for Radius
    public double getCircleRadius() {
        return radius;
    }

    public void setCircleRadius(double radius) {
        this.radius = radius;
    }

    // Method to display the area and circumference of the circle
    public void displayCircleProperties() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}

public class CircleInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for radius
        System.out.println("Enter the radius of the circle:");
        double radius = input.nextDouble();

        // Create a Circle object and set its radius
        Circle circle = new Circle(radius);

        // Display the circle's properties
        circle.displayCircleProperties();

        input.close();
    }
}
