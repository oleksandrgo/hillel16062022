import user.Car;
import user.Car2;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("migalingmail.com", "Mdv300883");
        user.name = "Dima";
        user.lastName = "Migalin";
        System.out.println(user);

        System.out.println("------------------------------------------");
        Car car = new Car("Audi", "TT", 1000000, 450);
        System.out.println(car);

        System.out.println("-2-----------------------------------------");
        Car2 car2 = new Car2("Ford", "Focus", 200, 200);
        System.out.println(car2);
        car2.setMaxSpeed(450);
        System.out.println(car2);
    }
}