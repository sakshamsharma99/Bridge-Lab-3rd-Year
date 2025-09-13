class Laptop {
    static int totalLaptops = 0;
    final String serialNo;
    String brand;
    double price;

    Laptop(String serialNo, String brand, double price) {
        this.serialNo = serialNo;
        this.brand = brand;
        this.price = price;
        totalLaptops++;
    }

    static void displayTotalLaptops() {
        System.out.println("Total Laptops: " + totalLaptops);
    }

    void displayLaptop() {
        if (this instanceof Laptop) {
            System.out.println("Serial: " + serialNo + ", Brand: " + brand + ", Price: " + price);
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("S001", "HP", 55000);
        Laptop l2 = new Laptop("S002", "Dell", 60000);
        Laptop.displayTotalLaptops();
        l1.displayLaptop();
        l2.displayLaptop();
    }
}
