import java.util.Scanner;

public class SumofAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int sum = 0;
        for(int i=0; i<size; i++) {
            System.out.println("Enter "+ (i+1)+ " element");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("Sum of all array elements: "+ sum);

    }
}
