import Auto.Auto;
import user.User;
import Auto.Porshe;

public class Main {
    public static void main(String[] args) {

        User user = new User("khgl", "qwerty");
        User user1 = new User("John", "Dou", "Qwerty@gmail.com", "qwerty", "qwerty");

        System.out.println("Is email for user correct: " + user.isEmailCorrect());
        System.out.println("Is email for user1 correct: " + user1.isEmailCorrect());

        Auto auto = new Auto();
        auto.mileage = 9999;

        System.out.println("Is mileage correct: " + auto.isMileageCorrect());

        Porshe porshe = new Porshe();
        porshe.maxSpeed = 500;

        porshe.stop();




    }
}