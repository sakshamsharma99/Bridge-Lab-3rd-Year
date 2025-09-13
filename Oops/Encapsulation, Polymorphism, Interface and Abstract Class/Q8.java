import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    public void getVehicleDetails() { System.out.println(driverName + " (" + vehicleId + ")"); }
    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    private String location = "HQ";
    public Car(String vehicleId, String driverName, double ratePerKm) { super(vehicleId, driverName, ratePerKm); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

class Bike extends Vehicle implements GPS {
    private String location = "HQ";
    public Bike(String vehicleId, String driverName, double ratePerKm) { super(vehicleId, driverName, ratePerKm); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

class Auto extends Vehicle implements GPS {
    private String location = "HQ";
    public Auto(String vehicleId, String driverName, double ratePerKm) { super(vehicleId, driverName, ratePerKm); }
    public double calculateFare(double distance) { return getRatePerKm() * distance; }
    public String getCurrentLocation() { return location; }
    public void updateLocation(String location) { this.location = location; }
}

public class Q8 {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("C101", "Alice", 15));
        rides.add(new Bike("B102", "Bob", 10));
        rides.add(new Auto("A103", "Charlie", 8));
        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for 10 km: " + v.calculateFare(10));
        }
    }
}
