import java.util.*;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(90) + 10; // random 10–99
            }
        }

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + scores[i][0]);
            System.out.println("Chemistry: " + scores[i][1]);
            System.out.println("Maths: " + scores[i][2]);
            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);
            System.out.println("Percentage: " + percent);
            System.out.println();
        }
    }
}
