/*
 * Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls
 */

// Superclass: Vehicle
abstract class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    // Constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType);
    }

    // Abstract method for subclass-specific details
    public abstract void displaySpecificDetails();
}

// Subclass: Car
class Car extends Vehicle {
    private int seatCapacity;

    // Constructor
    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }

    @Override
    public void displaySpecificDetails() {
        System.out.println("This is a car designed for personal or family transport.");
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private int loadCapacity; // in tons

    // Constructor
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }

    @Override
    public void displaySpecificDetails() {
        System.out.println("This is a truck used for transporting goods.");
    }
}

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSidecar) {
        super(maxSpeed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
    }

    @Override
    public void displaySpecificDetails() {
        System.out.println("This is a motorcycle, ideal for single or double riders.");
    }
}

// Main class to test the hierarchy
public class VehicleTransportSystem {
    public static void main(String[] args) {
        // Create an array of Vehicle type to demonstrate polymorphism
        Vehicle[] vehicles = new Vehicle[3];

        // Create specific vehicle objects
        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 20);
        vehicles[2] = new Motorcycle(100, "Petrol", true);

        // Loop through the array and display information
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            vehicle.displaySpecificDetails();
            System.out.println(); // Add a line break for clarity
        }
    }
}
