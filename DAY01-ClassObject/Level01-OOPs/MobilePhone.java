import java.util.Scanner;
class MobileInformation{
    private String brand;
    private String model;
    private double price;

    public MobileInformation(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getter and Setter for brand
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter and Setter for itemName
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display(){
        System.out.println(" Brand: " + brand + "\n" + " model: " + model + "\n" + " price: " + price);
    }

}

public class MobilePhone {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Mobile Brand Name:");
        String brand = input.nextLine();
        System.out.println("Enter your Mobile model Number: ");
        String model = input.nextLine();
        System.out.println("Enter your Mobile price:");
        double price = input.nextDouble();

        MobileInformation MI = new MobileInformation(brand,model,price);

        MI.display();

        input.close();
    }
    
}
