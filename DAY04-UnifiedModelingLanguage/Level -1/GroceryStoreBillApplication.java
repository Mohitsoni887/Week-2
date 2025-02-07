import java.util.ArrayList;

// Product class
class Product {
    private String productName;
    private double quantity;
    private double pricePerUnit;

    public Product(String productName, double quantity, double pricePerUnit) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    @Override
    public String toString() {
        return productName + " (" + quantity + " units at $" + pricePerUnit + " per unit)";
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Product> purchasedProducts;

    public Customer(String name) {
        this.name = name;
        this.purchasedProducts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }

    public void displayPurchasedProducts() {
        System.out.println("Customer: " + name);
        for (Product product : purchasedProducts) {
            System.out.println(" - " + product);
        }
    }

    public ArrayList<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
}

// BillGenerator class
class BillGenerator {
    public double generateBill(Customer customer) {
        double total = 0;
        for (Product product : customer.getPurchasedProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }
}

// Main class
public class GroceryStoreBillApplication {
    public static void main(String[] args) {
        // Create products
        Product apples = new Product("Apples", 2, 3);
        Product milk = new Product("Milk", 1, 2);

        // Create customer
        Customer customer = new Customer("Alice");

        // Add products to the customer
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Display purchased products
        customer.displayPurchasedProducts();

        // Generate bill
        BillGenerator billGenerator = new BillGenerator();
        double totalBill = billGenerator.generateBill(customer);

        System.out.println("Total Bill for " + customer.getName() + ": $" + totalBill);
    }
}
