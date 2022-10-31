package DZ19;

public class User {
    public String name;
    public String lastName;
    public static String Email;
    public String Password;
    public String ReEnterPassword;

    public User(String Email, String Password, String ReEnterPassword){
        this.Email = Email;
        this.Password = Password;
        this.ReEnterPassword = ReEnterPassword;

}
public static void checkEmail(String Email){
        System.out.println(Email.contains("@"));
}
}
