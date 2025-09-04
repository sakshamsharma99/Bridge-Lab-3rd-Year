import java.util.Scanner;

public class Q2 {

    public static String substringUsingCharAt(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String sub1 = substringUsingCharAt(str, start, end);
        String sub2 = str.substring(start, end);

        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(compareUsingCharAt(sub1, sub2));
    }
}
