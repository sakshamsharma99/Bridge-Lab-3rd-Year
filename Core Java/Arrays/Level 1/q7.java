import java.util.*;
public class q7 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){System.out.println("Invalid");return;}
        int[] even=new int[n/2+1],odd=new int[n/2+1];
        int ei=0,oi=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) even[ei++]=i;
            else odd[oi++]=i;
        }
        System.out.print("Odd: ");
        for(int i=0;i<oi;i++) System.out.print(odd[i]+" ");
        System.out.print("\nEven: ");
        for(int i=0;i<ei;i++) System.out.print(even[i]+" ");
    }
}
