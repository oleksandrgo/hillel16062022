//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3. Написать двумя способами. If и switch
      
// метод if
      
    import java.util.Scanner;


class Main {
	public static void main (String [] args) {
 
		System.out.print ("Введите число 1, 2 или 3: "); 
		Scanner inputFigure = new Scanner (System.in); 
		int i = inputFigure.nextInt (); 
		if ( i==1) { 
			System.out.println ("Вы ввели число 1");
		}
		else if (i==2) {
			System.out.println ("Вы ввели число 2");
		}
		else if (i==3) {
			System.out.println ("Вы ввели число 3");
		}
		else {
			System.out.println ("Вы ввели число не равное 1, 2 или 3");
		}
	}
}   


// метод switch


import java.util.Scanner;


class Main {
	public static void main (String [] args) {
	    
	    System.out.println("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        switch (i) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Внимание! Ошибка. Вы ввели число не равное 1, 2 или 3");
        }
 
	}
}



//Необходимо вывести на экран числа от 5 до 1. На экране должно быть: 5 4 3 2 1

class Main {
 
    public static void main(String[] args) {
        for (int i=5; i>=1; i--) {
            System.out.print (i + " ");
        }
    }
}


//Необходимо вывести на экран таблицу умножения на 3:

class Main {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println ("3*" + i + "=" + 3*i);
        }
    }
}


//Найти среднее арефметическое суммы чисел от 1 до 100

class Main {
    public static void main(String[] args) {
    double sum=0;
    for(int i=1; i<=100; i++){
    sum+=i;}
       System.out.println(sum / 100);
    }
    
} 