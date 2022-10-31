package User;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String reEnterPassword;

    public User(String email, String password, String reEnterPassword) {

        this.email = email;
        this.password = password;
        this.reEnterPassword = reEnterPassword;
    }
    public static void checkEmail(String email){
        System.out.println(email.contains("@"));
    }
}



    /*public static boolean checkEmail() {
            return true;
        }
        else {
            return false;
        }*/

