import java.util.ArrayList;

// Define the Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

// Define the Library class
class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to demonstrate the aggregation relationship
public class LibraryAndBooksDemo {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Create libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("Community Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        // Book2 is shared across libraries
        library2.addBook(book2);
        library2.addBook(book3);

        // Display books in each library
        library1.displayBooks();
        library2.displayBooks();
    }
}
