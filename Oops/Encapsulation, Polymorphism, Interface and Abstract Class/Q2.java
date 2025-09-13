import java.util.*;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) { super(productId, name, price); }
    public double calculateDiscount() { return getPrice() * 0.1; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, double price) { super(productId, name, price); }
    public double calculateDiscount() { return getPrice() * 0.2; }
    public double calculateTax() { return getPrice() * 0.12; }
    public String getTaxDetails() { return "GST 12%"; }
}

class Groceries extends Product {
    public Groceries(int productId, String name, double price) { super(productId, name, price); }
    public double calculateDiscount() { return getPrice() * 0.05; }
}

public class Q2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics(101, "Laptop", 50000));
        products.add(new Clothing(102, "Shirt", 1000));
        products.add(new Groceries(103, "Rice", 500));
        for (Product p : products) {
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculateTax() : 0;
            System.out.println("Product: " + p.getName());
            System.out.println("Final Price: " + (p.getPrice() + tax - p.calculateDiscount()));
        }
    }
}
