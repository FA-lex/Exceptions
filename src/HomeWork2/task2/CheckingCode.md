# Task2

Если необходимо, исправьте данный код (задание 2 <https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit>)

    try {
        int d = 0;
        double catchedRes1 = intArray[8] / d;
        System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
    }

---

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
