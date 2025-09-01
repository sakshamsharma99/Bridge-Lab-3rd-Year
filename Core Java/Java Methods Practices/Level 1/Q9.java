import java.util.*;

class Q9 {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int q = chocolates / children;
        int r = chocolates % children;
        return new int[] { q, r };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + res[0] + " Remaining: " + res[1]);
    }
}
