import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    public abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Car", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 5000; }
    public String getInsuranceDetails() { return "Car Insurance"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Bike", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 2000; }
    public String getInsuranceDetails() { return "Bike Insurance"; }
}

class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Truck", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 10000; }
    public String getInsuranceDetails() { return "Truck Insurance"; }
}

public class Q3 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", 2000));
        vehicles.add(new Bike("B102", 500));
        vehicles.add(new Truck("T103", 5000));
        for (Vehicle v : vehicles) {
            System.out.println("===============================");
            System.out.println("Vehicle: " + v.getVehicleNumber() + " Type: " + v.getType());
            System.out.println("Rental Cost for 5 days: " + v.calculateRentalCost(5));
            if (v instanceof Insurable) {
                Insurable ins = (Insurable)v;
                System.out.println("Insurance Cost: " + ins.calculateInsurance());
            }
        }
    }
}
