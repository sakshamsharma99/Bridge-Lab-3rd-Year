class Q11 {
    public String ISBN;
    protected String title;
    private String author;

    public Q11(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("12345", "Java Basics", "James Gosling");
        ebook.displayDetails();
        ebook.setAuthor("Sahil Sir");
        ebook.displayDetails();
    }
}

class EBook extends Q11 {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
    }
}
