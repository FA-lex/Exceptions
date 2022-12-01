package HomeWork2.task2;

public class test {
    public static void main(String[] args) {
        int d = 2;
        int n = 8;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        if (intArray.length - 1 < n) {
            System.out.println("Размер массива меньше индекса запрашиваемого элемента");
        } else if(d == 0){
            System.out.println("Операция деления на ноль");
        }else{
            double res = intArray[n] / d;
            System.out.println(res);
        }
    }
}
