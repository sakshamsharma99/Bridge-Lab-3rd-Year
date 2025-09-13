class Product {
    static double discount = 10.0;
    final int productID;
    String name;
    double price;

    Product(int productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void displayProduct() {
        if (this instanceof Product) {
            double finalPrice = price - (price * discount / 100);
            System.out.println("ID: " + productID + ", Name: " + name + ", Final Price: " + finalPrice);
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000);
        Product p2 = new Product(102, "Phone", 20000);
        p1.displayProduct();
        p2.displayProduct();
        Product.updateDiscount(15);
        p1.displayProduct();
        p2.displayProduct();
    }
}
