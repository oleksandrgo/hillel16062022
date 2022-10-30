import user.Car;
import user.Car_2;
import user.User;

public class Main {
    public static void main(String[] args) {
        System.out.println("новый пользователь");
        User user = new User("favouriteseason2006@gmail.com", "As123456");
        user.name = "Sergey";
        user.lastName = "Socolov";
        System.out.println(user);

        System.out.println("автомобиль 1");
        Car car = new Car("Audi", "R8", 100, 410);
        System.out.println(car);

        System.out.println("автомобиль 2");
        Car_2 car_2 = new Car_2("Porsche", "Panamera", 200, 200);
        System.out.println(car_2);
        System.out.println("превышение скорости");
        car_2.setMaxSpeed(420);
        System.out.println(car_2);
    }
}