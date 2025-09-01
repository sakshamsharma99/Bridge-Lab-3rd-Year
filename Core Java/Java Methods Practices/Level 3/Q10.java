import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        if (isCollinearSlope(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Slope Method)");
        else
            System.out.println("Not Collinear (Slope Method)");

        if (isCollinearArea(x1, y1, x2, y2, x3, y3))
            System.out.println("Collinear (Area Method)");
        else
            System.out.println("Not Collinear (Area Method)");

        sc.close();
    }

    static boolean isCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
    }

    static boolean isCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
}
