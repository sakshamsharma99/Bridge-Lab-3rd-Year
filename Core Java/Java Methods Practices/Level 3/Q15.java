import java.util.Random;

public class Q15 {

    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10); 
            }
        }
        return matrix;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] trans = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }

    public static int determinant2x2(int[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static int determinant3x3(int[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(int[][] m) {
        int det = determinant2x2(m);
        if (det == 0)
            throw new ArithmeticException("Matrix not invertible");
        double[][] inv = {
                { m[1][1] / (double) det, -m[0][1] / (double) det },
                { -m[1][0] / (double) det, m[0][0] / (double) det }
        };
        return inv;
    }
    public static double[][] inverse3x3(int[][] m) {
        int det = determinant3x3(m);
        if (det == 0)
            throw new ArithmeticException("Matrix not invertible");

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1] * m[2][2] - m[1][2] * m[2][1]) / (double) det;
        inv[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]) / (double) det;
        inv[0][2] = (m[0][1] * m[1][2] - m[0][2] * m[1][1]) / (double) det;

        inv[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]) / (double) det;
        inv[1][1] = (m[0][0] * m[2][2] - m[0][2] * m[2][0]) / (double) det;
        inv[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]) / (double) det;

        inv[2][0] = (m[1][0] * m[2][1] - m[1][1] * m[2][0]) / (double) det;
        inv[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]) / (double) det;
        inv[2][2] = (m[0][0] * m[1][1] - m[0][1] * m[1][0]) / (double) det;

        return inv;
    }

    public static void main(String[] args) {
        int[][] mat2 = generateMatrix(2, 2);
        int[][] mat3 = generateMatrix(3, 3);

        System.out.println("2x2 Matrix:");
        displayMatrix(mat2);
        System.out.println("Determinant: " + determinant2x2(mat2));
        System.out.println("Inverse:");
        displayMatrix(inverse2x2(mat2));

        System.out.println("\n3x3 Matrix:");
        displayMatrix(mat3);
        System.out.println("Determinant: " + determinant3x3(mat3));
        System.out.println("Inverse:");
        displayMatrix(inverse3x3(mat3));

        System.out.println("\nTranspose of 3x3:");
        displayMatrix(transpose(mat3));
    }
}
