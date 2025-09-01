class Q6 {
    static int sumOfDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                sum += i;
        return n == 1 ? 0 : sum;
    }

    static boolean isPerfect(int n) {
        return sumOfDivisors(n) == n;
    }

    static boolean isAbundant(int n) {
        return sumOfDivisors(n) > n;
    }

    static boolean isDeficient(int n) {
        return sumOfDivisors(n) < n;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println("Perfect: " + isPerfect(n));
        System.out.println("Abundant: " + isAbundant(n));
        System.out.println("Deficient: " + isDeficient(n));
        System.out.println("Strong: " + isStrong(n));
    }
}
