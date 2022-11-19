package HomeWork1.Task3;

import java.util.Arrays;

public class MainDivisionIsPiecemealTwoArrays {
    public static void main(String[] args) {
        int[][] array1 = {{15, 6, 8}, {25, 10, 4}, {2, 9, 100}};
        int[][] array2 = {{5, 2, 4}, {5, 2, 2}, {1, 3, 10}};
        int[][] array3 = {{5, 0, 4}, {5, 2, 2}, {1, 3, 10}};
        int[][] array4 = null;

        DivisionIsPiecemealTwoArrays division = new DivisionIsPiecemealTwoArrays();
        System.out.println(Arrays.deepToString(division.culculateDivision(array1, array2)));
        System.out.println(Arrays.deepToString(division.culculateDivision(array1, array3)));
//        System.out.println(Arrays.deepToString(division.culculateDivision(array1, array4)));

    }
}
