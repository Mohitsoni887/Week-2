class Book {
    public String ISBN; // Public: Accessible everywhere
    protected String title; // Protected: Accessible by subclasses and within the package
    private String author; // Private: Accessible only within the Book class

    // Constructor to initialize Book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public method to set the author's name
    public void setAuthor(String author) {
        if (author != null && !author.trim().isEmpty()) {
            this.author = author;
        } else {
            System.out.println("Invalid author name.");
        }
    }

    // Public method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass EBook
class EBook extends Book {
    private double fileSize; // Specific to EBook in MB

    // Constructor for EBook
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author); // Call the parent constructor
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    @Override
    public void displayBookDetails() {
        System.out.println("--- EBook Details ---");
        System.out.println("ISBN: " + ISBN); // Accessing public field
        System.out.println("Title: " + title); // Accessing protected field
        System.out.println("Author: " + getAuthor()); // Accessing private field via getter
        System.out.println("File Size: " + fileSize + " MB");
    }
}

// Main Class to Test Functionality
public class BookSystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book physicalBook = new Book("123-456-789", "Introduction to Java", "John Doe");
        System.out.println("--- Physical Book Details ---");
        physicalBook.displayBookDetails();

        // Modifying author using setter
        physicalBook.setAuthor("Jane Smith");
        System.out.println("\n--- Updated Physical Book Details ---");
        physicalBook.displayBookDetails();

        // Creating an EBook object
        EBook eBook = new EBook("987-654-321", "Advanced Java Programming", "Alice Johnson", 1.5);
        System.out.println("\n--- EBook Details ---");
        eBook.displayBookDetails();
    }
}
