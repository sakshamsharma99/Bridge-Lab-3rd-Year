class Q5 {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Q5(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        Q5 book = new Q5("Data Structures", "Sahil Sir", 350.0, true);
        book.borrowBook();
        book.borrowBook();
    }
}
