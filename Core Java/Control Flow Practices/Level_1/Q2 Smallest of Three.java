import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number1: ");
        int num1 = sc.nextInt();
        System.out.println("number2: ");
        int num2 = sc.nextInt();
        System.out.println("number3: ");
        int num3 = sc.nextInt();

        if(num1 < num2 && num1 < num3) {
            System.out.println("the first number" + num1 + "the smallest");
        }else {
            System.out.println("the first number" + num1 + "is not the smallest");
        }
        
    }
}
