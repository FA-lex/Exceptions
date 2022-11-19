package HomeWork1.Task2;

public class DifferenceArray {

    public int[][] calculateDifference(int[][] array1, int[][] array2){
        CheckCorrectAndEqualArrays correct = new CheckCorrectAndEqualArrays();
        if (correct.checkCorrect(array1, array2)) {
            int[][] result = new int[array1.length][array1[0].length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[0].length; j++) {
                    result[i][j] = array1[i][j] - array2[i][j];
                }
            }
            return result;
        }
        return null;
    }
}
