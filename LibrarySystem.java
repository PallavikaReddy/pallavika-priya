// Base class
class Item {
    String title, author;
    int publicationYear;

    // Constructor
    Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Derived class: Book (inherits from Item)
class Book extends Item {
    String genre;

    // Constructor
    Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear); // Calling parent constructor
        this.genre = genre;
    }

    // Overriding displayDetails method
    void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("Genre: " + genre);
    }
}

// Derived class: Magazine (inherits from Item)
class Magazine extends Item {
    int issueNumber;

    // Constructor
    Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    // Overriding displayDetails method
    void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

// Main class to test inheritance
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating objects of Book and Magazine
        Book book = new Book("Harry Potter", "J.K. Rowling", 1997, "Fantasy");
        Magazine magazine = new Magazine("Time", "Various", 2024, 50);

        // Display details
        System.out.println("Book Details:");
        book.displayDetails();
        
        System.out.println("\nMagazine Details:");
        magazine.displayDetails();
    }
}
