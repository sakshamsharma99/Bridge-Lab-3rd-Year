import java.util.Scanner;

public class Q9 {

    public static String toUpperM(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
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

        String text = sc.nextLine();

        String mUpper = toUpperM(text);
        String bUpper = text.toUpperCase();

        System.out.println(mUpper);
        System.out.println( bUpper);
        System.out.println(compareUsingCharAt(mUpper, bUpper));

        sc.close();
    }
}
