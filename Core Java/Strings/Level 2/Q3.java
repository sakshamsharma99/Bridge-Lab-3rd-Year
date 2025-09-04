import java.util.Scanner;

public class Q3 {

    public static int strLen(String s) {
        int c = 0;
        for (char ch : s.toCharArray())
            c++;
        return c;
    }

    public static String[] splitManual(String s) {
        int n = strLen(s);
        int spaces = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == ' ')
                spaces++;
        String[] words = new String[spaces + 1];
        int start = 0, w = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                words[w++] = s.substring(start, i);
                start = i + 1;
            }
        }
        words[w] = s.substring(start, n);
        return words;
    }

    public static String[][] wordWithLength(String[] words) {
        String[][] res = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            res[i][0] = words[i];
            res[i][1] = String.valueOf(strLen(words[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] table = wordWithLength(words);
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}
