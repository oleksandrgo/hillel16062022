import Car.Car;
import Car.CarHeir;
import User.User;

public class Main {
    public static void main(String[] args) {

        User user = new User("Olena", "Lirska", "servis0416@gmail.com", "Fasolka", "Fasolka");
        User user2 = new User("servis0416@gmail.com","Fasolka","Fasolka");

        System.out.println(user.name);
        System.out.println(user2.email);

        User.checkEmail("hgkjgg@vdsvsd");

        //User.validEmail("sdffgs@");

        Car car = new Car("BMW","Q5",180);
        car.validMileage(275);
        car.permissibleSpeed(401);

        Car carHeir = new CarHeir("AUDI", "TT",120);
        carHeir.validMileage(789);
        carHeir.permissibleSpeed(650);

    }

}
