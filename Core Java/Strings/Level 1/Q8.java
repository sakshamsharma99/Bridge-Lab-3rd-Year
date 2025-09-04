import java.util.Scanner;

public class Q8 {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]); 
    }

    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }
        handleException(names);
    }
}
