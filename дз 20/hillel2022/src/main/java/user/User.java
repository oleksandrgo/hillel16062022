package user;

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


        public boolean checkEmail(String email){
            char[] emailChars = email.toCharArray();
            for (int i = 0; i < emailChars.length; i++) {
                if (emailChars[i] == '@') {
                    return true;
                }
                return false;
            }


        }

    }
}


 /*public User(String email, String password){
            this.email = email;
            this.password = password;
        }*/


