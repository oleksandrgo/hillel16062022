package user;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;


    public User(String email, String password) {
        if (correctMail(email)) {
            System.out.println("email not correct!");
        }
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public User(String name, String lastName, String email, String password) {
        if (correctMail(email)) {
            System.out.println("email not correct!");
        }
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public boolean correctMail(String email) {
        char [] arr = email.toCharArray();
        for (char c : arr) {
            if (c == '@') {
                return false;
            }
        }
        return true;
    }
}








