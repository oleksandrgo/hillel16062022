import Car.Car;
import Car.CarHeir;
import User.User;

        public class Main {
            public static void main(String[] args) {

                User user = new User("Yulia", "Koroleva", "koroleva@gmail.com", "Qwerty12", "Qwerty12");
                User user2 = new User("koroleva@gmail.com", "Qwerty12", "Qwerty12");

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