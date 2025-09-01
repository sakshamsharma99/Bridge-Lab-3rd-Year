import java.util.*;

class Q2{
    public static int sumLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number");
        } else {
            int loopSum = sumLoop(n);
            int formulaSum = sumFormula(n);
            System.out.println("Loop Sum: " + loopSum);
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println("Match: " + (loopSum == formulaSum));
        }
    }
}
