package HomeWork2.task4;

import java.util.Scanner;

class GetString {
    String inputString() throws NullStringException {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();
        if (inputString == "") {
            throw new NullStringException("Пустые строки вводить нельзя");
        }        
        
        return inputString;
    }
}
