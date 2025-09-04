import java.util.*;

public class Q8 {

    public static int[] genAges(int n) {
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 10 + r.nextInt(90);
        }
        return a;
    }

    public static String[][] canVote(int[] a) {
        String[][] res = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            res[i][0] = String.valueOf(a[i]);
            if (a[i] < 0)
                res[i][1] = "false";
            else if (a[i] >= 18)
                res[i][1] = "true";
            else
                res[i][1] = "false";
        }
        return res;
    }

    public static void show(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = genAges(n);
        String[][] res = canVote(ages);
        show(res);
    }
}
