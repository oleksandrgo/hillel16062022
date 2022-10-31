package user;

import javax.print.DocFlavor;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;


    public User(String name, String lastName, String email, String password) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;

        /*for (int i = 0; i < email.length; i++) {
            if (email [i] == "@") {
                return true;
            } else {
                return false;
            }
        }*/
        /*НЕ СРАБАТЫВАЕТ- МОЖНО ПОДСКАЗКУ*/
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
}







