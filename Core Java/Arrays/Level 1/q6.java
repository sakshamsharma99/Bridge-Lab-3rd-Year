import java.util.*;
public class q6 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] heights=new double[11];
        double sum=0;
        for(int i=0;i<11;i++) heights[i]=sc.nextDouble();
        for(double h:heights) sum+=h;
        System.out.println("Mean Height = "+(sum/11));
    }

}
