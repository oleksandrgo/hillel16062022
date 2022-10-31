package hillelAuto;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String reEnterPassword;

    public User(String name, String lastName, String email, String password, String reEnterPassword) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.reEnterPassword = reEnterPassword;
    }
    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
}
