import java.util.*;
class CountElementsRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to insert: ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0; i<size; i++) {
            System.out.println("Enter "+ (i+1)+ " element");
            arr[i] = sc.nextInt();
        }
        System.out.println("Target Element: ");
        int target = sc.nextInt();

        int count = 0;

        for(int i=0; i<size; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        System.out.println("Target Number repeated: "+ count + " times");

    }
}