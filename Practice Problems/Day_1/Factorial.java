package Day_1;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int i) {
        if(i==0) {
            return 1;
        }
        int n = i*factorial(i-1);
        return n;
    }
}
