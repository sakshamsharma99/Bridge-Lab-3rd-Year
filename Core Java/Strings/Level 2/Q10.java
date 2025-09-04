import java.util.Random;

public class Q10 {

    public static int[][] generateScores(int students) {
        Random r = new Random();
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = r.nextInt(41) + 60;
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percentage = Math.round(avg);

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percentage;
        }
        return results;
    }

    public static String[] calculateGrades(double[][] results) {
        int students = results.length;
        String[] grades = new String[students];

        for (int i = 0; i < students; i++) {
            double percentage = results[i][2];

            if (percentage >= 80)
                grades[i] = "A";
            else if (percentage >= 70)
                grades[i] = "B";
            else if (percentage >= 60)
                grades[i] = "C";
            else if (percentage >= 50)
                grades[i] = "D";
            else if (percentage >= 40)
                grades[i] = "E";
            else
                grades[i] = "R";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + scores[i][0]);
            System.out.println("Chemistry: " + scores[i][1]);
            System.out.println("Maths: " + scores[i][2]);
            System.out.println("Total: " + results[i][0]);
            System.out.println("Average: " + results[i][1]);
            System.out.println("Percentage: " + results[i][2]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        int students = 3;
        int[][] scores = generateScores(students);
        double[][] results = calculateResults(scores);
        String[] grades = calculateGrades(results);

        displayScorecard(scores, results, grades);
    }
}
