import java.util.*;

class Q4 
 {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] getDigitsArray(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i) - '0';
        return arr;
    }

    static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    static boolean isPalindrome(int n) {
        int[] d = getDigitsArray(n);
        return arraysEqual(d, reverseArray(d));
    }

    static boolean isDuckNumber(int n) {
        int[] d = getDigitsArray(n);
        for (int i = 1; i < d.length; i++)
            if (d[i] == 0)
                return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Count Digits: " + countDigits(n));
        System.out.println("Digits Array: " + Arrays.toString(getDigitsArray(n)));
        System.out.println("Reversed: " + Arrays.toString(reverseArray(getDigitsArray(n))));
        System.out.println("Palindrome: " + isPalindrome(n));
        System.out.println("Duck Number: " + isDuckNumber(n));
    }
}
