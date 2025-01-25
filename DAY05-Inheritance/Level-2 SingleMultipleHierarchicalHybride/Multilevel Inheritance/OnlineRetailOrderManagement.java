/*
 *Online Retail Order Management
Description: Create a multilevel hierarchy to manage orders, where Order is the base class, ShippedOrder is a subclass, and DeliveredOrder extends ShippedOrder.
Tasks:
Define a base class Order with common attributes like orderId and orderDate.
Create a subclass ShippedOrder with additional attributes like trackingNumber.
Create another subclass DeliveredOrder extending ShippedOrder, adding a deliveryDate attribute.
Implement a method getOrderStatus() to return the current order status based on the class level.
Goal: Explore multilevel inheritance, showing how attributes and methods can be added across a chain of classes.
 
 */

// Base Class: Order
class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass: ShippedOrder
class ShippedOrder extends Order {
    protected String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass: DeliveredOrder
class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Date: " + deliveryDate);
    }

    @Override
    public String getOrderStatus() {
        return "Order Delivered";
    }
}

// Main Class to Test the Hierarchy
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an instance of DeliveredOrder
        DeliveredOrder order = new DeliveredOrder(
            "ORD12345", 
            "2025-01-20", 
            "TRK98765", 
            "2025-01-23"
        );

        // Display order details and status
        order.displayOrderDetails();
        System.out.println("Order Status: " + order.getOrderStatus());
    }
}
