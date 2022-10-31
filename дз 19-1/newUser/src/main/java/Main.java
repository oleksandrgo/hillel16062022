import car.CarHead;
import car.CarSmall;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user = new User("Sasha", "Kravchuk", "test@gmail.com", "Qaz1234567");

        /*System.out.println(user.email);*/


        User user1 = new User("text@gmail.com", "Qaz1234567");


        CarHead carHead = new CarHead("Audi", "Q8", 10000);
        /*carHead.checkMileage(10000);
        System.out.println(carHead.mileage);*/

        /*carHead.setMaxspeed(400);
        System.out.println(carHead.maxspeed);*/

        /*carHead.checkMaxSpeed(300);
        System.out.println(carHead.maxspeed);*/

        CarHead carSmall = new CarSmall("Porshe", "Cayenne", 120);
       /* carSmall.setMaxspeed(400);
        System.out.println(carSmall.maxspeed);*/

        carSmall.checkMaxSpeed(600);
        System.out.println(carSmall.maxspeed);

    }

}
