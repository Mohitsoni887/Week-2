/**
 * Class representing a Movie Ticket Booking System
 */
public class MovieTicket {
    // Private fields for encapsulation
    private String movieName;
    private int seatNumber;
    private double price;

    // Constructor to initialize the MovieTicket object
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1; // Indicates no seat assigned yet
        this.price = 0.0;     // Default price is 0 until booked
    }

    // Method to book a ticket by assigning seat and updating price
    public void bookTicket(int seatNumber, double price) {
        if (this.seatNumber != -1) {
            System.out.println("Error: Ticket already booked for Seat Number " + this.seatNumber);
            return;
        }
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket successfully booked!");
    }

    // Method to display ticket details
    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        if (seatNumber == -1) {
            System.out.println("Seat Number: Not Assigned");
            System.out.println("Price: Not Assigned");
        } else {
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: $" + price);
        }
    }

    /**
     * Main method to demonstrate ticket booking
     */
    public static void main(String[] args) {
        // Create a MovieTicket object for the movie "Inception"
        MovieTicket ticket = new MovieTicket("Inception");

        // Display details before booking
        System.out.println("Before Booking:");
        ticket.displayDetails();

        // Book the ticket with seat number and price
        ticket.bookTicket(15, 15.99);

        // Display details after booking
        System.out.println("\nAfter Booking:");
        ticket.displayDetails();

        // Attempt to book again (should show an error)
        System.out.println("\nAttempting to book again:");
        ticket.bookTicket(12, 18.99);
    }
}
