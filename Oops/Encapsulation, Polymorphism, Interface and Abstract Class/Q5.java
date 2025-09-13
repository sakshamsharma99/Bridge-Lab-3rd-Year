import java.util.*;

interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}

abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public int getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public void getItemDetails() { System.out.println(title + " by " + author); }
    public abstract int getLoanDuration();
}

class Book extends LibraryItem implements Reservable {
    private boolean available = true;
    public Book(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 14; }
    public void reserveItem(String borrower) { available = false; }
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean available = true;
    public Magazine(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 7; }
    public void reserveItem(String borrower) { available = false; }
    public boolean checkAvailability() { return available; }
}

class DVD extends LibraryItem implements Reservable {
    private boolean available = true;
    public DVD(int id, String title, String author) { super(id, title, author); }
    public int getLoanDuration() { return 3; }
    public void reserveItem(String borrower) { available = false; }
    public boolean checkAvailability() { return available; }
}

public class Q5 {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        items.add(new Book(101, "Java Basics", "Alice"));
        items.add(new Magazine(102, "Tech Today", "Bob"));
        items.add(new DVD(103, "Movie Night", "Charlie"));
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
        }
    }
}
