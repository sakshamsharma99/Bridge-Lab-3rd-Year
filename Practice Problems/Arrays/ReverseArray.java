import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        int flag = 1;
        for(int i=size-1; i>=0; i--) {
            System.out.print("Enter "+ (flag)+ " element:   ");
            arr[i] = sc.nextInt();
            flag++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
