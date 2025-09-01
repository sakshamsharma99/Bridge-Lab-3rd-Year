import java.util.*;

class Q3 {
    static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    static int[] getDigitsArray(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    static int sumOfDigits(int n) {
        int sum = 0;
        for (int x : getDigitsArray(n))
            sum += x;
        return sum;
    }

    static int sumOfSquares(int n) {
        int sum = 0;
        for (int x : getDigitsArray(n))
            sum += x * x;
        return sum;
    }

    static boolean isHarshad(int n) {
        return n % sumOfDigits(n) == 0;
    }

    static void digitFrequency(int n) {
        int[] freq = new int[10];
        for (int x : getDigitsArray(n))
            freq[x]++;
        for (int i = 0; i < 10; i++)
            if (freq[i] > 0)
                System.out.println(i + " " + freq[i]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Digits: " + countDigits(n));
        System.out.println("Sum: " + sumOfDigits(n));
        System.out.println("Squares Sum: " + sumOfSquares(n));
        System.out.println("Harshad: " + isHarshad(n));
        digitFrequency(n);
    }
}
