// Q5: MobilePhone
public class Q5 {
    String brand;
    String model;
    double price;

    Q5(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayMobile() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        Q5 mobile1 = new Q5("VIVO", "VIVO V29", 15999);
        Q5 mobile2 = new Q5("ONE PLUS", "ONE PLUS Nord4", 39999);
        Q5 mobile3 = new Q5("APPLE", "iPhone Pro16", 79999);
        mobile1.displayMobile();
        mobile2.displayMobile();
        mobile3.displayMobile();
    }
}
