import java.util.Random;
import java.util.Scanner;

public class JavaBase {

    public static void main(String[] args) {


      /*  int a = 125;
        System.out.println(Integer.toBinaryString(a));*/
        // System.out.println("Hello world");

        java.lang.String list = "sdsghfkhjljkrtegfhgkdzfz";
        java.lang.String random = "";
        int length = 5;

        Random rand = new Random();
        char [] text = new char[length];

        for (int i = 0; i < length; i++){
            text[i] = list.charAt(rand.nextInt(list.length()));
        }

        for (int i = 0; i < text.length;i++){
            random += text[i];
        }
        System.out.println(random);

        //System.out.println(Integer.toBinaryString(a));
        //System.out.println("result " + Integer.parseInt("1000001", 2));

       /* int c; // обьявление переменной - обязательно ставить ;
        c = 5;*/ // инициализация переменой


      /*  int b = 7; // а можно и так
        int firstNumber;
        int first_number;
*/
        // а что так будет
       // a = 7;
        /*

        1.Имя переменной должно начинаться с буквы (маленькой) и состоять из букв (Unicode)
        цифр и символа подчеркивания «_».
        Технически возможно начать имя переменной также с «$» или «_»,
        однако это запрещено соглашением по оформлению кода в Java (Java Code Conventions).
        Кроме того, символ доллара «$», по соглашению, никогда не используется вообще.
        В соответствии с соглашением имя переменной должно начинаться именно с маленькой буквы
        (с заглавной буквы начинаются имена классов). Пробелы при именовании переменных
        не допускаются.
        2. Имя переменной не должно быть ключевым или зарезервированным словом языка Java.
        3. Имя переменной чувствительно к регистру.  newVariable и newvariable — разные имена.
        4. При выборе имени переменных, следует использовать полные слова
        вместо загадочных аббревиатур.
         Это сделает ваш код более удобным для чтения и понимания.
          Во многих случаях это также сделает ваш код самодокументируемым.
        5. camelCase
        6. Если переменная сохраняет постоянное значение,
        то каждое слово следует писать заглавными буквами
        и отделять при помощи символа подчеркивания. Пример: static final int NUMBER_OF_HOURS_IN_A_DAY = 24
         */





        //Типы данных в java
        // Примитивные типы данных целые числа
        //byte a = 125;  //8 бит	-128	127

       /* String b = "qwerty";
        String c = "qwerty";
        System.out.println("B " + b.hashCode());
        System.out.println("C " + c.hashCode());*/




         //byte b = 129; // а что сейчас будет ?


         // short a = 223; // 16 бит	-32768	32767
         //int a = 3435; //	32 бит	-2147483648	2147483647
         // long a = 23435435;// 64 бит	-9223372036854775808	9223372036854775807

        // Примитивные типы данных числа с плавоющей точкой
         //double a = 33.33; // 64бита	-1.7E+308	1.7E+308
        // float a = 33.3; // 32бита -3.4E+38	3.4E+38
       // float a = (float) 33.3;
       // float bc = 33.33f;




        // Символьные типы даных
       /* char a = 67;
        System.out.println(a);*/
        /*char a = 'c';
        char c = 'a';
        System.out.println(a + c);*/
        //Логический тип данных
       // boolean a = true || false;


       



        // Ссылочные переменные самое главное что нужно понять это объект
        // И являются эти объекты ссылочными типами, они хранят в себе не значение а
        // ссылка на память


        // После обьяснения масивов привести пример
       // String a = "qwerty";
        //System.out.println(a.charAt(2));


        /*String bc = "+";
        System.out.println(a.concat(bc).concat(a));
        System.out.println(a + bc + a);*/


       /* String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b);*/



        /*Integer a = 22;
        Integer b = 22;
        Float ac = 22.3f;
        Double ar = 22.4;
        double o = 77.0;*/





        // Примеры унарных операторов
       /* int x = +11;
        int y = -11;*/ // унарный минус
        // Бинарные операторы
       /* int t = 11;
        int y = t + 6*/; // бинарный минус
        // Тернарный оператор
     /*   int a = 3;
        int r = 4;
        int c = (a > r)? a+1:r+1;
        System.out.println(c);
*/
        // Арефметические операторы +,-,*,/,%,++,--
       /* int a =5;
        System.out.println(++a);
        System.out.println(a);*/
        //Операторы сравнения >,<, ==, !=, >=, <=;

        // Цыклы в java
        // for/*/
        /*for (int a = 0; a < 9; a++){
            System.out.println("Я знаю java" );
        }*/

        // while
       /* int a = 5;
        while (a > 2){
            a--;
            System.out.println(a);
            System.out.println("Я знаю java");
        }*/
        // do while
       /* int i = 0;
        do{
            i+=2;
            System.out.println("i="+i);
        }
        while(i<5);*/


        //Ветвление в java
      /*  int a = 5;
        int b = 3;
        if (a > b) {
            System.out.println("1");
            //действие(-я), которые выполняются, если условие истинно;
        }
        else if (true) {
            System.out.println("2");
            //действие(-я), которые выполняются, если условие истинно;
        }
        else if (true) {
            System.out.println("3");
            //действие(-я), которые выполняются, если условие истинно;
        }
        else {
            System.out.println("4");
            //действие(-я), которые выполняются, если условие истинно;
        }*/



        /*Необходимо написать программу, где бы пользователь вводил
        число на выбор: 1, 2 или 3, а программа должна сказать, какое число
        ввёл пользователь: 1, 2, или 3. Нужно написать только условия*/

      /*
        int a = 3;
        System.out.println();*/



      /*  int a = 1;
        if(a == 3) System.out.println(a);
        else if (a == 2) System.out.println(a);
        else if(a == 1) System.out.println(a);*/

        // Оператор switch

         /*   switch (4){
            case 1:
                System.out.println ("Вы ввели число 1"); break;
            case 2:
                System.out.println ("Вы ввели число 2"); break;
            case 3:
                System.out.println ("Вы ввели число 3"); break;
            case 4:
                System.out.println ("Вы ввели число 4"); break;
            default:
                System.out.println("Вы ввели неправильное число");
             }*/

        // массива
        // Обьявление массива



         /*int[] cats;
         int cats1[];*/ // другой вариант
        /* String [] cats  = {"Greta","Zorka","Murka"};
         System.out.println(cats[3]);*/


        /*int [] countCats = new int[10];
        countCats[0] = 25;
        System.out.println(countCats[9]);*/


      /*  String [] cats  = {"A","B","C"};
        for (int i = 1; i < cats.length; i++){
            System.out.println("Array = " + cats[i]);
        }*/

        //System.out.println(cats);
        //System.out.println(cats.length);


       /* String[] cats = new String[2];
        cats[0] = "Vasy";
        cats[1] = "Roza";  */





        // Многомерные массивы
        // Для создания многомерных массивов используются дополнительные скобки:
        /*int[][] a = {
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        System.out.println(a[1][1]);*/
        //Двумерный массив - это массив одномерных массивов.
        // Если вам нужен двумерный массив, то используйте пару квадратных скобок:/*
       /* String[][]arr = new String[2][3];

        arr[0][0] = "1";
        arr[0][1] = "Васька";
        arr[0][2] = "121987102";

        arr[1][0] = "2";
        arr[1][1] = "Рыжик";
        arr[1][2] = "2819876107";*/



        //System.out.println("Array" + " " + arr.length);
     /*   for(int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.println(arr[i][j]);
            }
        }*/

        // Пример ссылочных типов
     /*   int myIntVariable = 10;
        int anotherVariable = myIntVariable;
        System.out.println("myIntVariable: " + myIntVariable);
        System.out.println("anotherVariable: " + anotherVariable);

        anotherVariable++;

        System.out.println("myIntVariable: " + myIntVariable);
        System.out.println("anotherVariable: " + anotherVariable);*/
      /*  int a[] = {1,2,3};
        int r [] = {1,2,3};*/


       /* for (int i = 0; i < a.length; i++){
            a[i] = i;
        }*/

       /* System.out.println("Array a");
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }


        System.out.println("Array r");
        for (int i = 0; i < r.length;i++){
            System.out.println(r[i]);
        }*/
        /*System.out.println("After changes Array a");
         r[1] = 90;

        System.out.println("Array a after R changed");
        for (int i = 0; i < a.length;i++){
            System.out.println(a[i]);
        }

        System.out.println("Array r after R changed");
        for (int i = 0; i < r.length;i++){
            System.out.println(r[i]);
        }*/
        //System.out.println(a[4]);


        /*for (int i = 0; i < b.length;i++){
            System.out.println(b[i]);
        }








        //ДЗ
       /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
        1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
        Написать двумя способами. If и switch.
        */
        /*System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        System.out.println(i);*/


        /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
        5 4 3 2 1

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



        // Найти среднее значение суммы чисел от 1 до 100
        // Найти максимальное число в массиве int [] array = {5,2,4,8,88,22,10}
       // System.out.println("Hello world");


    }
}

