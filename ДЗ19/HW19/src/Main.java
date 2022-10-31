import Car.Car;
import Car.CarHeir;
import User.User;

public class Main {
    public static void main(String[] args) {

        User user = new User ("servis0416@gmail.com", "Fasolka", "Fasolka");
        user.name = "Olena";
        user.lastName = "Lirska";

        User.checkEmail("hgkjgg@");

        Car car = new Car("BMW","Q5",180);
        car.validMileage(275);
        car.permissibleSpeed(401);

        Car carHeir = new CarHeir("AUDI", "TT",120);
        carHeir.validMileage(789);
        carHeir.permissibleSpeed(650);


    }

}
