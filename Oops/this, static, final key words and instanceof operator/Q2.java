class Book {
    static String libraryName = "City Library";
    final String isbn;
    String title;
    String author;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBook() {
        if (this instanceof Book) {
            System.out.println("ISBN: " + isbn + ", Title: " + title + ", Author: " + author);
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Book.displayLibraryName();
        Book b1 = new Book("123-ABC", "Java Basics", "James");
        Book b2 = new Book("456-DEF", "OOP Concepts", "Robert");
        b1.displayBook();
        b2.displayBook();
    }
}
