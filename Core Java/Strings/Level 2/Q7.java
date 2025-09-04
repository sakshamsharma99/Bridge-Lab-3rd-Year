import java.util.Scanner;

public class Q7 {

    public static int[] trimIndexes(String s) {
        int st = 0, en = s.length() - 1;
        while (st < s.length() && s.charAt(st) == ' ')
            st++;
        while (en >= 0 && s.charAt(en) == ' ')
            en--;
        return new int[] { st, en };
    }

    public static String subStr(String s, int st, int en) {
        String res = "";
        for (int i = st; i <= en; i++)
            res += s.charAt(i);
        return res;
    }

    public static boolean cmp(String a, String b) {
        if (a.length() != b.length())
            return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int[] idx = trimIndexes(txt);
        String customTrim = subStr(txt, idx[0], idx[1]);
        String builtInTrim = txt.trim();
        System.out.println(customTrim);
        System.out.println( builtInTrim);
        System.out.println(cmp(customTrim, builtInTrim));
    }
}
