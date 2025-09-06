class Q9 {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Q9(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println(ownerName + " owns a " + vehicleType + ". Registration Fee: " + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Q9 v1 = new Q9("Saksham", "Car");
        Q9 v2 = new Q9("Poonam", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Q9.updateRegistrationFee(6000);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
