import java.util.*;

class Q2 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] toDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    public static boolean isDuck(int n) {
        int[] d = toDigits(n);
        for (int x : d)
            if (x == 0)
                return true;
        return false;
    }

    public static boolean isArmstrong(int n) {
        int[] d = toDigits(n);
        int k = d.length, sum = 0;
        for (int x : d)
            sum += Math.pow(x, k);
        return sum == n;
    }

    public static int[] largestTwo(int[] d) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max1) {
                max2 = max1;
                max1 = x;
            } else if (x > max2 && x != max1)
                max2 = x;
        }
        return new int[] { max1, max2 };
    }

    public static int[] smallestTwo(int[] d) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min1) {
                min2 = min1;
                min1 = x;
            } else if (x < min2 && x != min1)
                min2 = x;
        }
        return new int[] { min1, min2 };
    }

    public static void main(String[] args) {
        int n = 153;
        int[] digits = toDigits(n);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Duck: " + isDuck(n));
        System.out.println("Armstrong: " + isArmstrong(n));
        System.out.println("Largest two: " + Arrays.toString(largestTwo(digits)));
        System.out.println("Smallest two: " + Arrays.toString(smallestTwo(digits)));
    }
}
