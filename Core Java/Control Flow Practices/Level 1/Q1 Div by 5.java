package Level_1;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int num = sc.nextInt();
        if(num % 5 == 0) {
            System.out.print("The number "+ num + " divisible by 5");
        }else {
            System.out.print("The number "+ num + "is not divisible by 5");   
        }
    }
}