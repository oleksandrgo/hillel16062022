import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Put in number 1, 2 or 3:");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        System.out.println(i);

        if (i == 1){
            System.out.println("User put in number 1");
        } else if (i == 2) {
            System.out.println("User put in number 2");
        } else if (i == 3) {
            System.out.println("User put in number 3");
        }else {
            System.out.println("User put wrong number");
        }

        switch (i){
            case 1:
                System.out.println("User put in number 1");
                break;
            case 2:
                System.out.println("User put in number 2");
                break;
            case 3:
                System.out.println("User put in number 3");
                break;
            default:
                System.out.println("User put wrong number");
        }

        int a = 5;
        while (a>=1){
            System.out.println(a);
            a--;
        }

        int b = 3;
        int c = 1;
        while(c<=10){
            System.out.println(b+"*"+c+"="+(b*c));
            c++;
        }

        double d = 1;
        double s = 0;
        while (d<=100){
            s = s+d;
            d++;
        }
        double f = s/(d-1);
        System.out.println("Average: "+f);


    }

}