import java.util.Scanner;

public class ArraySortedornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.println("Enter "+ (i+1)+ " element");
            arr[i] = sc.nextInt();
        }
        Boolean flag = true;
        for(int i=0; i<size-1; i++) {
            for(int j=i+1; j<size; j++) {
                if(arr[i] > arr[j]) {
                    flag = false;
                }
            }
            if(flag == false) {
                break;
            }
        }
        if(flag == true) {
            System.out.println("Arrays Sorted");
        }else {
            System.out.println("Arrays not Sorted");
        }
    }
}
