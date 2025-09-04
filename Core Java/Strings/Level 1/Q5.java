import java.util.Scanner;

public class Q5 {

    public static void generateException(String text) {
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        handleException(input);
    }
}
