class Car {
    static int totalCars = 0;
    final String vin;
    String brand;
    String model;

    Car(String vin, String brand, String model) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        totalCars++;
    }

    static void displayTotalCars() {
        System.out.println("Total Cars: " + totalCars);
    }

    void displayCar() {
        if (this instanceof Car) {
            System.out.println("VIN: " + vin + ", Brand: " + brand + ", Model: " + model);
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Car c1 = new Car("VIN001", "Toyota", "Corolla");
        Car c2 = new Car("VIN002", "Honda", "City");
        Car.displayTotalCars();
        c1.displayCar();
        c2.displayCar();
    }
}
