package HomeWork1.Task1;

public class CreateExceptions {
    public int divideZero(){
        return 1/0;
    }

    public int outOfRange(){
        final int[] array = new int[1];
        return array[1];
    }

    public double nullPointer(){
        return Double.parseDouble(null);
    }
}
