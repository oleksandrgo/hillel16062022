import HW19Lirska.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //*ДЗ18
        /*System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();*/

        /*if ( i==1)
            System.out.println ("Пользователь ввёл число 1");
        else if (i==2)
            System.out.println ("Пользователь ввёл число 2");
        else if (i==3)
            System.out.println ("Пользователь ввёл число 3");
        else
            System.out.println ("Пользователь ввёл число, что не равно 1, 2 или 3");*/



        /*switch (i) {
            case 1:
                System.out.println("Пользователь ввёл число 1");break;
            case 2:
                System.out.println("Пользователь ввёл число 2");break;
            case 3:
                System.out.println("Пользователь ввёл число 3");break;
            default:
                System.out.println("Пользователь ввёл число, что не равно 1, 2 или 3");
        }*/



        /*for (int i=5; i>0; i--) {
            System.out.println(i);
        }*/



        /*for (int i=1; i<=10; i++) {
            System.out.println ("3*" + i + "=" + 3*i);
        }*/

        /*int sum=0;
        for (int i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("Среднее арифметическое " +(sum/100));*/

//*ДЗ19

        User user = new User ("servis0416@gmail.com", "Fasolka", "Fasolka");
        user.name = "Olena";
        user.lastName = "Lirska";
        user.email = "servis0416@gmail.com";
        user.password = "Fasolka";
        user.reEnterPassword = "Fasolka";



        System.out.println(user.reEnterPassword);


    }
}
