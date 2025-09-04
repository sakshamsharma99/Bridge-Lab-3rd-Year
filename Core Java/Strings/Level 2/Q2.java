import java.util.Scanner;

public class Q2 {
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

    public static boolean compareArr(String[] a, String[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i]))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] manual = splitManual(text);
        String[] builtin = text.split(" ");
        for (String w : manual)
            System.out.println(w);
        for (String w : builtin)
            System.out.println(w);
        System.out.println(compareArr(manual, builtin));
        sc.close();
    }
}
