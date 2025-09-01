import java.util.*;

class Q8 {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int q = number / divisor;
        int r = number % divisor;
        return new int[] { q, r };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();
        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + res[0] + " Remainder: " + res[1]);
    }
}
