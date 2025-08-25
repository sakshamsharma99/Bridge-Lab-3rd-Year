import java.util.Arrays;
import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert in 1st Array: ");
        int sizeA = sc.nextInt();
        int [] A = new int[sizeA];
        for(int i=0; i<sizeA; i++) {
            System.out.println("Enter "+ (i+1)+ " element");
            A[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println();

        System.out.println("How many numbers you want to insert in 2nd Array: ");
        int sizeB = sc.nextInt();
        int [] B = new int[sizeB];
        for(int i=0; i<sizeB; i++) {
            System.out.println("Enter "+ (i+1)+ " element");
            B[i] = sc.nextInt();
        }

        int C[] = new int[sizeA + sizeB];
        int count = 0;
        for(int i=0; i<sizeA; i++) {
            C[count] = A[count];
            count++;
        }
        for(int i=0; i<sizeB; i++) {
            C[count] = B[i];
            count++;
        }
        System.out.println(Arrays.toString(C));
    }
}
