class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize the book attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // Books are available by default
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

    // Method to check availability
    public boolean isAvailable() {
        return isAvailable;
    }

    // Method to borrow the book
    public boolean borrowBook() {
        if (isAvailable) {
            isAvailable = false; // Mark the book as borrowed
            System.out.println("You have successfully borrowed: " + title);
            return true;
        } else {
            System.out.println("Sorry, " + title + " is currently unavailable.");
            return false;
        }
    }

    // Method to return the book
    public void returnBook() {
        isAvailable = true; // Mark the book as available
        System.out.println("You have successfully returned: " + title);
    }

    // Display method to show book details
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("1984", "George Orwell", 9.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);

        // Display initial book details
        System.out.println("Initial Book Details:");
        book1.display();
        System.out.println();
        book2.display();

        System.out.println("\n--- Borrowing Books ---");
        // Borrow book1
        book1.borrowBook();

        // Try borrowing book1 again
        book1.borrowBook();

        // Borrow book2
        book2.borrowBook();

        System.out.println("\n--- Book Details After Borrowing ---");
        // Display updated book details
        book1.display();
        System.out.println();
        book2.display();

        System.out.println("\n--- Returning Books ---");
        // Return book1
        book1.returnBook();

        // Display updated book details
        System.out.println("\n--- Final Book Details ---");
        book1.display();
        System.out.println();
        book2.display();
    }
}
