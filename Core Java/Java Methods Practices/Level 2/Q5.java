class Q5 {
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        System.out.println("2 Yards = " + convertYardsToFeet(2) + " feet");
        System.out.println("9 Feet = " + convertFeetToYards(9) + " yards");
        System.out.println("1 Meter = " + convertMetersToInches(1) + " inches");
        System.out.println("20 Inches = " + convertInchesToMeters(20) + " meters");
        System.out.println("15 Inches = " + convertInchesToCm(15) + " cm");
    }
}
