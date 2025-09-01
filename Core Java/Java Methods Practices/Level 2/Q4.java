class Q4 {
    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("10 Km = " + convertKmToMiles(10) + " miles");
        System.out.println("5 Miles = " + convertMilesToKm(5) + " km");
        System.out.println("3 Meters = " + convertMetersToFeet(3) + " feet");
        System.out.println("12 Feet = " + convertFeetToMeters(12) + " meters");
    }
}
