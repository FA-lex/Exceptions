package HomeWork1.Task2;

public class CheckCorrectAndEqualArrays {
    public boolean checkCorrect(int[][] array1, int[][] array2){
        CheckNotNullArray checkNotNullArray = new CheckNotNullArray();
        CheckEqualTwoDimensionalIntegerArrays checkEqualArrays = new CheckEqualTwoDimensionalIntegerArrays();
        if (checkNotNullArray.checkingForNull(array1) == CodeErrors.ALL_RIGHT.getCodeErrors() &&
                checkNotNullArray.checkingForNull(array2) == CodeErrors.ALL_RIGHT.getCodeErrors() &&
                checkEqualArrays.checking(array1, array2) == CodeErrors.ALL_RIGHT.getCodeErrors()){
            return true;
        }
        return false;
    }
}
