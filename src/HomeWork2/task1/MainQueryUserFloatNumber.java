package HomeWork2.task1;

public class MainQueryUserFloatNumber {
    public static void main(String[] args) {
        QueryUserFloatNumber floatNumber = new QueryUserFloatNumber();
        float num = floatNumber.queryUserFloatNumber();
        System.out.println("The request returned to us: " + num);
    }
}
