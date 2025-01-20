class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter and Setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter and Setter for author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter and Setter for price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

public class BookInformation {
    public static void main(String[] args) {
        // Creating a book using default constructor
        Book book1 = new Book();
        System.out.println("Book 1 (Default Constructor):");
        book1.display();
        
        System.out.println();

        // Creating a book using parameterized constructor
        Book book2 = new Book("1984", "George Orwell", 9.99);
        System.out.println("Book 2 (Parameterized Constructor):");
        book2.display();
    }
}
