class Q6 {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 1000;

    public Q6(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays +
                " days. Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        Q6 rent = new Q6("Saksham", "Swift", 5);
        rent.display();
    }
}
