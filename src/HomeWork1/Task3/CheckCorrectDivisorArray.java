package HomeWork1.Task3;

import HomeWork1.Task2.CodeErrors;

public class CheckCorrectDivisorArray {
    public boolean checkCorrect(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 0){
                    throw new RuntimeException("Division by zero, code error" + CodeErrors.DIVISION_BY_ZERO.getCodeErrors());
                }
            }
        }
        return true;
    }
}
