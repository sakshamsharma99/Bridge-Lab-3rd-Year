import java.util.*;

class Q1 {
    public static int sum(int[] arr) {
        int s = 0;
        for (int x : arr) {
            s += x;
        }
        return s;
    }

    public static double mean(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static int shortest(int[] arr) {
        int min = arr[0];
        for (int x : arr)
            min = Math.min(min, x);
        return min;
    }

    public static int tallest(int[] arr) {
        int max = arr[0];
        for (int x : arr)
            max = Math.max(max, x);
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }

        System.out.println("Heights: " + Arrays.toString(heights));
        System.out.println("Mean Height: " + mean(heights));
        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
    }
}
