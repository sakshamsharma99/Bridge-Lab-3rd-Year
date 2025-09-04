import java.util.Scanner;

public class Q3 {

    public static char[] toCharArrayManual(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char[] mArr = toCharArrayManual(str);
        char[] bArr = str.toCharArray();

        System.out.println( new String(mArr));
        System.out.println( new String(bArr));
        System.out.println(compareArrays(mArr, bArr));
    }
}
