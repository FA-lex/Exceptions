package HomeWork1.Task2;

public  class CheckNotNullArray {
    public int checkingForNull(int[][] array) {
        if (array == null) {
            System.out.println("Array mast be not null, code error: " + CodeErrors.NULL_ARRAY.getCodeErrors());
            return CodeErrors.NULL_ARRAY.getCodeErrors();
        }
        return CodeErrors.ALL_RIGHT.getCodeErrors();
    }
}
