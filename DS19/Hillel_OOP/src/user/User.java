package user;

public class User {
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String reEnterPassword;


   public boolean isEmailCorrect() {
        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) != 64) {
                continue;
            }return true;
        }
        return false;
    }


    public User(String name, String lastName, String email, String password, String reEnterPassword){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.reEnterPassword = reEnterPassword;
        System.out.println("Is email for user correct: " + this.isEmailCorrect());

    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
        System.out.println("Is email for user correct: " + this.isEmailCorrect());
    }







}


