import java.util.Scanner;

public class Q5 {

    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z')
            c = (char) (c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    public static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String res = checkChar(s.charAt(i));
            if (res.equals("Vowel"))
                v++;
            else if (res.equals("Consonant"))
                c++;
        }
        return new int[] { v, c };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] res = countVC(text);
        System.out.println(res[0]);
        System.out.println( res[1]);
    }
}
