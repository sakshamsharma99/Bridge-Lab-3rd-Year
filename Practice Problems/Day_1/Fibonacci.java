package Day_1;

class Main {
    public static void main(String[] args) {
        Fibonacci(10);
    }
    public static void Fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for(int i=0; i<n; i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }

    }
}