import java.util.*;

public class Q9 {

    public static String compChoice() {
        int c = (int) (Math.random() * 3);
        if (c == 0)
            return "Rock";
        else if (c == 1)
            return "Paper";
        else
            return "Scissors";
    }

    public static String winner(String u, String c) {
        if (u.equals(c))
            return "Draw";
        if (u.equals("Rock") && c.equals("Scissors"))
            return "User";
        if (u.equals("Rock") && c.equals("Paper"))
            return "Computer";
        if (u.equals("Paper") && c.equals("Rock"))
            return "User";
        if (u.equals("Paper") && c.equals("Scissors"))
            return "Computer";
        if (u.equals("Scissors") && c.equals("Paper"))
            return "User";
        if (u.equals("Scissors") && c.equals("Rock"))
            return "Computer";
        return "Draw";
    }

    public static String[][] stats(int uw, int cw, int g) {
        String[][] s = new String[2][3];
        s[0][0] = "User";
        s[0][1] = uw + "";
        s[0][2] = String.format("%.2f", (uw * 100.0) / g) + "%";
        s[1][0] = "Computer";
        s[1][1] = cw + "";
        s[1][2] = String.format("%.2f", (cw * 100.0) / g) + "%";
        return s;
    }

    public static void showStats(String[][] s) {
        System.out.println("Player\tWins\tWin%");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int g = sc.nextInt();
        int uw = 0, cw = 0;
        System.out.println("Enter choice as Rock, Paper or Scissors");
        for (int i = 1; i <= g; i++) {
            System.out.print("Game " + i + " - Your choice: ");
            String u = sc.next();
            String c = compChoice();
            String w = winner(u, c);
            System.out.println("Computer choice: " + c + " | Winner: " + w);
            if (w.equals("User"))
                uw++;
            else if (w.equals("Computer"))
                cw++;
        }
        String[][] s = stats(uw, cw, g);
        showStats(s);
        sc.close();
    }
}
