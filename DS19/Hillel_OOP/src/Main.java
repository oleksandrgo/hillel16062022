import Auto.Auto;
import user.User;
import Auto.Porshe;

public class Main {
    public static void main(String[] args) {

        User user = new User("rlkm@tb", "qwerty");
        User user1 = new User("John", "Dou", "Qwertygmail.com", "qwerty", "qwerty");

        Auto auto = new Auto();
        auto.mileage = 7777777;

        auto.checkMileage();

        Porshe porshe = new Porshe();
        porshe.maxSpeed = 500;

        porshe.stop();




    }
}