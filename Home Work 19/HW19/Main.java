import java.util.Scanner;
import CarLanos.CarLanos;
import UserClass.CarFromLanos;
import UserClass.User;


public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome");
        System.out.println("Set up a new user");
        User userHillel = new User("Obram", "Hillelevich", "israel@obetovanniy.com", "Moisey2022");
        System.out.println(userHillel);

        System.out.println("Create main car class");
        CarLanos carHillel = new CarLanos("Audi", "S8", 160.6, 280);
        System.out.println(carHillel);

        System.out.println("Create second car from SuperCar class");
        CarFromLanos lanosForHillel = new CarFromLanos("Zaz", "Slavuta", 250.5, 200);
        System.out.println(lanosForHillel);
        System.out.println("превышение скорости");
        lanosForHillel.maxSpeedMethod(300);
    }
}
