import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers you want to insert: ");
    int size = sc.nextInt();
     int [] arr = new int[size];
     for(int i=0; i<size; i++) {
         System.out.println("Enter "+ (i+1)+ " element");
         arr[i] = sc.nextInt();
    }
    int B[] = new int[size];
    for(int i=0; i<size; i++) {
        B[i] = arr[i];
    }
    System.out.println(Arrays.toString(B));
 }   
}
