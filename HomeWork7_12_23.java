package PACKAGE_NAME;

public class HomeWork7_12_23 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(sumArray(numbers, 0));
// Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
//Операцией возведения в степень пользоваться нельзя!

//Ввод YES
//Вывод 8
//
//Ввод NO
//Вывод 3
        task(16);
//        Дано натуральное число N. Вычислите сумму его цифр.
//При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        System.out.println(calculateSumsNumbers(12));
//
//Ввод 179
//Вывод 17
//
//Ввод 985
//Вывод 22


        //Level 2
//Напишите рекурсивный метод, который выводит на экран числа Фибоначчи до N-ого элемента.
        System.out.println(displyFibonacci(10));
        //Напишите рекурсивный метод, который проверяет, является ли строка палиндромом.
        String str = "Ankna";
        System.out.println(stringPalindromicity(str));


    }

    public static boolean recurivePalindron(String str1, int start, int end) {
        if (start >= end) {//base case
            return true;
        } else {
            return str1.charAt(start) == str1.charAt(end) && recurivePalindron(str1, start + 1, end - 1);
        }
    }

    public static boolean stringPalindromicity(String str) {
        if (str.length() <= 1) {
            return true;
        } else {
            String str1 = str.replaceAll("\\s", " ").toUpperCase();
            return recurivePalindron(str1, 0, str1.length() - 1);
        }
    }


    public static int calculateSumsNumbers(int numbers) {
        if (numbers == 0) {
            return 0;
        } else {
            int endNumber = numbers % 10;
            int otherNumbers = calculateSumsNumbers(numbers / 10);
            return endNumber + otherNumbers;
        }

    }

    public static int numbersFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return numbersFibonacci(number - 1) + numbersFibonacci(number - 2);
    }

    public static int displyFibonacci(int number) {
        if (number <= 0) {
            return 0;
        }
        System.out.print(numbersFibonacci(number) + " ");
        return displyFibonacci(number - 1);
    }

    public static int task(int n) {
        if (n == 2) {
            System.out.println("Yes");
            return 0;
        } else if (n < 2) {
            System.out.println("No");
            return 0;
        }
        if (n % 2 == 0) {
            return task(n / 2);
        } else {
            System.out.println("No");
            return 0;
        }

    }

    public static int sumArray(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        } else {
            return numbers[index] + sumArray(numbers, index + 1);
        }
    }

}
