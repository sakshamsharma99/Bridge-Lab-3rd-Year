import java.util.*;
public class q4 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[10];
        double sum=0;
        int idx=0;
        while(true){
            double n=sc.nextDouble();
            if(n<=0||idx==10) break;
            arr[idx++]=n;
        }
        for(int i=0;i<idx;i++) sum+=arr[i];
        System.out.println("Sum = "+sum);
    }
}
