class Q1 {
    private String title;
    private String author;
    private double price;

    public Q1() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    public Q1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("Book: " + title + ", Author: " + author + ", Price: " + price);
    }

    public static void main(String[] args) {
        Q1 b1 = new Q1();
        Q1 b2 = new Q1("Java Programming", "James Gosling", 450.0);

        b1.display();
        b2.display();
    }
}
