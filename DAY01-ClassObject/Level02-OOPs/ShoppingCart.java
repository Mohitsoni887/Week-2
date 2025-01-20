import java.util.ArrayList;
import java.util.Scanner;
class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize a cart item
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters for accessing item attributes
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Set quantity for an existing item
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Calculate the total cost of this item
    public double getTotalCost() {
        return price * quantity;
    }
    public String toString() {
        return itemName + " - $" + price + " x " + quantity + " = $" + getTotalCost();
    }
}


// Class to simulate a shopping cart
    public class ShoppingCart {
        private ArrayList<CartItem> cartItems; // Dynamically sized list of cart items

    // Constructor to initialize the cart
        public ShoppingCart() {
            this.cartItems = new ArrayList<>();
    }

    
    // Add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                // If the item already exists, update its quantity
                item.setQuantity(item.getQuantity() + quantity);
                System.out.println("Updated quantity for " + itemName);
                return;
            }
        }
        // Add new item if it doesn't exist
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println("Added " + itemName + " to the cart.");
    }

    
    // Remove an item from the cart
    public void removeItem(String itemName) {
        for (CartItem item : cartItems) {
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                cartItems.remove(item);
                System.out.println("Removed " + itemName + " from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart: " + itemName);
    }

    
    // Display the total cost of the items in the cart
    public void displayTotalCost() {
        double total = 0;
        for (CartItem item : cartItems) {
            total += item.getTotalCost();
        }
        System.out.println("Total Cost: $" + total);
    }


    // Display all items in the cart
    public void displayCartItems() {
        if (cartItems.isEmpty()) {
            System.out.println("The cart is empty.");
            return;
        }
        System.out.println("Items in the cart:");
        for (CartItem item : cartItems) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart Items");
            System.out.println("4. Display Total Cost");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1: // Add Item
                    System.out.print("Enter item name: ");
                    String itemName = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    cart.addItem(itemName, price, quantity);
                    break;
                case 2: // Remove Item
                    System.out.print("Enter item name to remove: ");
                    String itemToRemove = scanner.nextLine();
                    cart.removeItem(itemToRemove);
                    break;
                case 3: // Display Cart Items
                    cart.displayCartItems();
                    break;
                case 4: // Display Total Cost
                    cart.displayTotalCost();
                    break;
                case 5: // Exit
                    System.out.println("Exiting... Thank you for shopping!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
