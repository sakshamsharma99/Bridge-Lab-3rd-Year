class Q6 {
    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public static double convertPoundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        System.out.println("98F = " + convertFarhenheitToCelsius(98) + " C");
        System.out.println("37C = " + convertCelsiusToFarhenheit(37) + " F");
        System.out.println("150 Pounds = " + convertPoundsToKg(150) + " kg");
        System.out.println("50 Kg = " + convertKgToPounds(50) + " pounds");
        System.out.println("10 Gallons = " + convertGallonsToLiters(10) + " liters");
        System.out.println("20 Liters = " + convertLitersToGallons(20) + " gallons");
    }
}
