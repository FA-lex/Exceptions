package HomeWork1.Task2;

public class CheckEqualTwoDimensionalIntegerArrays {
    public int checking(int[][] array1, int[][] array2){
        if (array1.length == array2.length && array1[0].length == array2[0].length){
            return CodeErrors.ALL_RIGHT.getCodeErrors();
        }
        System.out.println("Size arrays unequal, code error: "+ CodeErrors.SIZE_ARRAYS_UNEQUAL.getCodeErrors());
        return CodeErrors.SIZE_ARRAYS_UNEQUAL.getCodeErrors();
    }
}
