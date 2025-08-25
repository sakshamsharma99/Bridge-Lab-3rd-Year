import java.util.Arrays;
import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.println("Enter "+ (i+1)+ " element");
            arr[i] = sc.nextInt();
        }
        int arr2[] = new int[size+1];
        for(int i=0; i<size; i++) {
            int temp = arr[i]%(size+1);
            arr2[temp]++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
