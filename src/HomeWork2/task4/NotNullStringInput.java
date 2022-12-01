package HomeWork2.task4;

public class NotNullStringInput {
    public static void main(String[] args) {
        
        System.out.println("Введите строку");
        GetString userString = new GetString();
        try {
            System.out.println("Вы ввели строку " + userString.inputString());
        } catch (NullStringException e) {
            System.out.println(e);
        }
    }
}
