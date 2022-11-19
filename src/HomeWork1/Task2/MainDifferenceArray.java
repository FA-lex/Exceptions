package HomeWork1.Task2;

import java.util.Arrays;

public class MainDifferenceArray {
    public static void main(String[] args) {
        int[][] a1 = {{1, 2}, {5, 3}};
        int[][] a2 = new int[2][3];
        int[][] a3 = new int[3][2];
        int[][] a4 = {{1, 1}, {4, 3}};
        int[][] a5 = null;

        DifferenceArray diff = new DifferenceArray();
        System.out.println(Arrays.deepToString(diff.calculateDifference(a1, a2)));
        System.out.println(Arrays.deepToString(diff.calculateDifference(a1, a3)));
        System.out.println(Arrays.deepToString(diff.calculateDifference(a1, a4)));
        System.out.println(Arrays.deepToString(diff.calculateDifference(a1, a5)));

    }
}
