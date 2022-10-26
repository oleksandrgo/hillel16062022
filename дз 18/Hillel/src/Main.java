import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 /* Задача 1.
 Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
      1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
      Написать двумя способами. If и switch.
      */
      /*System.out.println("Введите число 1, 2 или 3: ");
      Scanner inputFigure = new Scanner(System.in);
      int i = inputFigure.nextInt();
      System.out.println(i);*/

       /*System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i <= 1) {
            System.out.println("1");
        } else if (i <= 2) {
            System.out.println("2");
        } else if (i <= 3) {
            System.out.println("3");
        } else {
            System.out.println("Incorrect number");
        }*/

       /*System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        switch (i) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("Incorrect number");
        }*/

        /*Задание №2
        Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
      5 4 3 2 1 */

      /*for (int i=5; i>=1; i--){
        System.out.println(i);
        }*/


        /*Задание №3
        Необходимо вывести на экран таблицу умножения на 3:
      3*1=3
      3*2=6
      3*3=9
      3*4=12
      3*5=15
      3*6=18
      3*7=21
      3*8=24
      3*9=27
      3*10=30
         */

       /*final int a=3;
        int i=1;
        for (; i<=10; i++){
        System.out.println(a+"*"+i+"="+a*i);
        }*/

/*Задание №4
        Найти среднее арефметическое суммы чисел от 1 до 100 */

       /*double sum=0;
       for(int i=1; i<=100; i++){
       sum+=i;
}
       System.out.println(sum / 100);*/

        }

    }

