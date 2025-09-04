import java.util.Scanner;

public class Q1 {

    public static String[] computeBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; 
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[] {
                String.format("%.2f", bmi),
                status
        };
    }

    public static String[][] prepareResults(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            double weight = hw[i][0];
            double height = hw[i][1];

            String[] bmiData = computeBMI(weight, height);

            result[i][0] = String.valueOf(height);
            result[i][1] = String.valueOf(weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    public static void displayResults(String[][] result) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" +
                    result[i][1] + "\t\t" +
                    result[i][2] + "\t" +
                    result[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = 10; 
        double[][] hw = new double[persons][2];

        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }

        String[][] results = prepareResults(hw);
        displayResults(results);
    }
}
