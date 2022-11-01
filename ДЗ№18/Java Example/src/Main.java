import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//№1.Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.Написать двумя способами. If и switch.

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
            case 1: System.out.println(i);
            break;
            case 2: System.out.println(i);
            break;
            case 3: System.out.println(i);
            break;
            default: System.out.println("Ошибка! Введенное число вне диапазона 1-3");
        }
// №2.Необходимо вывести на экран числа от 5 до 1. На экране должно быть:5 4 3 2 1.

        System.out.println("Задание 2");
        for (int a = 5; a != 0; a--) {
            System.out.println(a);
        }

// №3.Необходимо вывести на экран таблицу умножения на 3.

        System.out.println("Задание 3");
        final int b = 3;
        for (int c = 1; c <= 10; c++) {
            System.out.println(b + "*" + c + "=" + b * c);
        }


// №4. Найти среднее арефметическое суммы чисел от 1 до 100.

        System.out.println("Задание 4");
        double d = 1;
        double f = 0;
        while (d<=100){
            f = f+d;
            d++;}
        double a = f/(d-1);
        System.out.println("Среднее арифметическое суммы всех чисел от 1 до 100 равно: "+a);
    }
}

