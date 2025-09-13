import java.util.*;

interface Discountable {
    void applyDiscount(double percent);
    double getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void getItemDetails() { System.out.println(itemName + " x" + quantity); }
    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0;
    public VegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() - discount; }
    public void applyDiscount(double percent) { discount = getPrice() * getQuantity() * percent/100; }
    public double getDiscountDetails() { return discount; }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0;
    private double extraCharge = 50;
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }
    public double calculateTotalPrice() { return getPrice() * getQuantity() + extraCharge - discount; }
    public void applyDiscount(double percent) { discount = getPrice() * getQuantity() * percent/100; }
    public double getDiscountDetails() { return discount; }
}

public class Q6 {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        VegItem veg = new VegItem("Paneer", 200, 2);
        NonVegItem nonveg = new NonVegItem("Chicken", 300, 1);
        veg.applyDiscount(10);
        nonveg.applyDiscount(5);
        order.add(veg);
        order.add(nonveg);
        for (FoodItem f : order) {
            f.getItemDetails();
            System.out.println("Total Price: " + f.calculateTotalPrice());
        }
    }
}
