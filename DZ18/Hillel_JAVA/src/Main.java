import java.util.Scanner;


// Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
// 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
// Написать двумя способами. If и switch.

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        System.out.println("Метод if");
        if (i == 1) System.out.println(i);
        else if (i == 2) System.out.println(i);
        else if (i == 3) System.out.println(i);

        System.out.println("Метод switch");
        switch (i) {
            case 1 -> System.out.println(i);
            case 2 -> System.out.println(i);
            case 3 -> System.out.println(i);
            default -> System.out.println("Ошибка! Введенное число вне диапазона 1-3");
        }
        System.out.println("Задание 2");

//Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
//5 4 3 2 1

        for (int k = 5; k != 0; k--) {
            System.out.println(k);
        }
        System.out.println("Задание 3");

//      Необходимо вывести на экран таблицу умножения на 3:

        final int x = 3;
        for (int y = 1; y <= 10; y++) {
            System.out.println(x + "*" + y + "=" + x * y);
        }
        System.out.println("Задание 4");

// Найти среднее арефметическое суммы чисел от 1 до 100

        int s = 1;
        int sum = 100;
        while (s <= 100) {
            sum += (s++);
        }
        System.out.println("Среднее арифметическое суммы всех чисел от 1 до 100 равно: " + sum / s);
    }
}
