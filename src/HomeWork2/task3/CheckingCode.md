# Task3

Дан следующий код, исправьте его там, где требуется

    public static void main(String[] args) throws  Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }

---

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
