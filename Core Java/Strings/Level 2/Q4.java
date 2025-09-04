import java.util.Scanner;

public class Q4 {

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

    public static int[] findMinMax(String[][] table) {
        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
                minIdx = i;
            }
            if (len > max) {
                max = len;
                maxIdx = i;
            }
        }
        return new int[] { minIdx, maxIdx };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = splitManual(text);
        String[][] table = wordWithLength(words);
        int[] idx = findMinMax(table);
        System.out.println("Shortest: " + table[idx[0]][0] + " (" + table[idx[0]][1] + ")");
        System.out.println("Longest: " + table[idx[1]][0] + " (" + table[idx[1]][1] + ")");
    }
}
