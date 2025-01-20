class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // Cost per day

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown Model";
        this.rentalDays = 0;
    }

    // Parameterized constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Getter and Setter for customerName
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter and Setter for carModel
    public String getCarModel() {
        return carModel;
    }
    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    // Getter and Setter for rentalDays
    public int getRentalDays() {
        return rentalDays;
    }
    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total cost of rental
    public double calculateTotalCost() {
        return DAILY_RATE * rentalDays;
    }

    // Display method to show rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: $" + DAILY_RATE);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class CarRentalSystem {
    public static void main(String[] args) {
        // Creating a car rental using the default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 (Default Constructor):");
        rental1.displayRentalDetails();

        System.out.println();

        // Creating a car rental using the parameterized constructor
        CarRental rental2 = new CarRental("John Doe", "Toyota Corolla", 5);
        System.out.println("Rental 2 (Parameterized Constructor):");
        rental2.displayRentalDetails();

        System.out.println();

        // Modifying rental details using setters
        rental1.setCustomerName("Jane Smith");
        rental1.setCarModel("Honda Civic");
        rental1.setRentalDays(3);
        System.out.println("Rental 1 (After Modification):");
        rental1.displayRentalDetails();
    }
}
