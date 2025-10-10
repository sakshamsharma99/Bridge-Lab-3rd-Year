package Arrays.Level_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid input! Enter positive weight: ");
                personData[i][0] = sc.nextDouble();
            }
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid input! Enter positive height: ");
                personData[i][1] = sc.nextDouble();
            }
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }
        System.out.println("\nHeight\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", personData[i][1], personData[i][0], personData[i][2],
                    weightStatus[i]);
        }
        sc.close();
    }
}
