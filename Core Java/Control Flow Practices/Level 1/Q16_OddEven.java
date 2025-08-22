package Level_1;

import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Not a natural number");
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is even");
            else
                System.out.println(i + " is odd");
        }
    }
}
