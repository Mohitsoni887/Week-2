import java.util.Scanner;

class Book {
    private String title;
    private String author;

    // Constructor to initialize the fields
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
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

    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class BookInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for book details
        System.out.println("Enter the title of the book:");
        String title = input.nextLine();

        System.out.println("Enter the author of the book:");
        String author = input.nextLine();

        // Creating a Book object
        Book book = new Book(title, author);

        // book.setAuthor("jhon");

        // Displaying book details
        book.display();

        input.close();
    }
}
