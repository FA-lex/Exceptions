package HomeWork2.task3;

public class test {
    public static void main(String[] args){
        int a = 90;
        int b = 3;
        int index = 3;
        int[] array = { 1, 2 };
        
        if (b == 0) {
            System.out.println("Деление на ноль");
        } else {
            System.out.println(a / b);
        }
        
        printSum(23, 234);
        if (index >= array.length || index < 0) {
            System.out.println("Массив выходит за пределы своего размера!");
        } else {
            array[index] = 9;
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
