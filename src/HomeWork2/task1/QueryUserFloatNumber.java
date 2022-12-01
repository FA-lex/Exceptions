package HomeWork2.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class QueryUserFloatNumber {
    private float reply;

    QueryUserFloatNumber(){
        this.reply = 0;
    }
        
    public float queryUserFloatNumber(){
        do {
            System.out.println("Введите число c плавающей запятой : ");
        } while (!queryUser());
        return reply;
    }

    public boolean queryUser(){
        Scanner scanner = new Scanner(System.in);
        try {
            this.reply = scanner.nextFloat();
            scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Введённая строка не является числом с плавающей запятой. ");
            return false;
        }
        return true;
    }
}
