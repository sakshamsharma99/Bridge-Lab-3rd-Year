public class Q11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][2];
        double[][] res = new double[10][2];
        double sumOld = 0, sumNew = 0, sumBonus = 0;

        for (int i = 0; i < 10; i++) {
            arr[i][0] = (int) (Math.random() * 90000) + 10000;
            arr[i][1] = (int) (Math.random() * 11) + 1;
            double rate = arr[i][1] > 5 ? 0.05 : 0.02;
            double bonus = arr[i][0] * rate;
            res[i][0] = arr[i][0] + bonus;
            res[i][1] = bonus;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1] + " " + res[i][0] + " " + res[i][1]);
            sumOld += arr[i][0];
            sumNew += res[i][0];
            sumBonus += res[i][1];
        }
        System.out.println(sumOld + " " + sumNew + " " + sumBonus);
    }
}
