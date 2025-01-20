class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Jack";
        roomType = "Standard";
        nights = 1;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("Parameterized constructor called");
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
        System.out.println("Copy constructor called");
    }

    // Getter and Setter for guestName
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    // Getter and Setter for roomType
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Getter and Setter for nights
    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        // Using the Default Constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingDetails();
        System.out.println();

        // Using the Parameterized Constructor
        HotelBooking booking2 = new HotelBooking("Alice", "Deluxe", 3);
        booking2.displayBookingDetails();
        System.out.println();
        
        // Using the Copy Constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingDetails();
    }
}
