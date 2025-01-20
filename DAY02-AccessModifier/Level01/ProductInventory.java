class Product {
    private String productName;
    private float price;
    private static int totalProducts = 0; // Static field to track total products

    // Constructor to initialize product details
    public Product(String productName, float price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment totalProducts whenever a new product is created
    }

    // Getter and Setter for productName
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter and Setter for price
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: $" + price);
    }

    // Static method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total products: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        // Create product objects
        Product product1 = new Product("Laptop", 999.99f);
        Product product2 = new Product("Smartphone", 499.99f);

        // Display product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        product2.displayProductDetails();

        System.out.println("\n--- Total Products ---");
        // Display total products
        Product.displayTotalProducts();
    }
}
