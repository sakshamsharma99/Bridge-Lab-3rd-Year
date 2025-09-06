// Q3: Book
public class Q3 {
    String bookTitle;
    String bookAuthor;
    double price;

    Q3(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + bookAuthor);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Q3 book1 = new Q3("2States", "Chetan Bhagat", 500);
        Q3 book2 = new Q3("Wings Of Fire", "Abdul Kalam A.P.J", 500);
        book1.displayBookDetails();
        book2.displayBookDetails();
    }
}
