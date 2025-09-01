import java.util.*;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter rows for matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter cols for matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows for matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter cols for matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = createMatrix(r1, c1, random);
        int[][] B = createMatrix(r2, c2, random);

        System.out.println("Matrix A:");
        printMatrix(A);
        System.out.println("Matrix B:");
        printMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("A + B:");
            printMatrix(add(A, B));
            System.out.println("A - B:");
            printMatrix(subtract(A, B));
        } else {
            System.out.println("Addition and Subtraction not possible (different sizes).");
        }

        if (c1 == r2) {
            System.out.println("A * B:");
            printMatrix(multiply(A, B));
        } else {
            System.out.println("Multiplication not possible (cols of A != rows of B).");
        }
    }

    static int[][] createMatrix(int rows, int cols, Random rand) {
        int[][] m = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                m[i][j] = rand.nextInt(10); 
        return m;
    }

    static int[][] add(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] + B[i][j];
        return res;
    }

    static int[][] subtract(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] - B[i][j];
        return res;
    }

    static int[][] multiply(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < A[0].length; k++)
                    res[i][j] += A[i][k] * B[k][j];
        return res;
    }

    static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

