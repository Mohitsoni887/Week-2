import java.util.Scanner;

class ItemDetails {
    private String itemCode;
    private String itemName;
    private float price;

    // Constructor
    public ItemDetails(String itemCode, String itemName, float price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Getter and Setter for itemCode
    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    // Getter and Setter for itemName
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    // Getter and Setter for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Display item details
    public void display() {
        System.out.println("itemCode: " + itemCode);
        System.out.println("itemName: " + itemName);
        System.out.println("price: " + price);
    }

    // Calculate total price
    public float calculateTotal(int quantity) {
        return price * quantity;
    }
}

public class Item {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter itemCode:");
        String itemCode = input.nextLine();
        System.out.println("Enter itemName:");
        String itemName = input.nextLine();
        System.out.println("Enter price: ");
        float price = input.nextFloat();
        System.out.println("Enter quantity: ");
        int quantity = input.nextInt();

        ItemDetails ID = new ItemDetails(itemCode, itemName, price);
        ID.display();

        // Calculate and display total price
        float total = ID.calculateTotal(quantity);
        System.out.println("Total Price for " + quantity + " items: " + total);

        input.close();
    }
}
