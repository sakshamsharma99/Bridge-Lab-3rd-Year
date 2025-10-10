import java.util.*;
public class q9 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt(),cols=sc.nextInt();
        int[][] mat=new int[rows][cols];
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) mat[i][j]=sc.nextInt();
        int[] arr=new int[rows*cols];
        int idx=0;
        for(int i=0;i<rows;i++) for(int j=0;j<cols;j++) arr[idx++]=mat[i][j];
        for(int val:arr) System.out.print(val+" ");
    }
}
