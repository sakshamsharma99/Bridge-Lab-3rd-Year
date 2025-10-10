import java.util.*;
public class q8 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] factors=new int[10];
        int idx=0,max=10;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                if(idx==max){
                    max*=2;
                    factors=Arrays.copyOf(factors,max);
                }
                factors[idx++]=i;
            }
        }
        for(int i=0;i<idx;i++) System.out.print(factors[i]+" ");
    }
}
