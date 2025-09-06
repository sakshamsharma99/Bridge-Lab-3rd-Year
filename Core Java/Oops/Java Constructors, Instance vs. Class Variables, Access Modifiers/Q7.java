class Q7 {
    private String productName;
    private double price;
    private static int totalProducts = 0;

    public Q7(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Q7 p1 = new Q7("Laptop", 50000);
        Q7 p2 = new Q7("Mouse", 500);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Q7.displayTotalProducts();
    }
}
