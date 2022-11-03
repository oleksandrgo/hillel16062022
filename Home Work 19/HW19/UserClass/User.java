package UserClass;


public class User {

    private String  Name;

    private String  LastName;

    private String  email;

    private String  password;


    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "User [ Name=" + Name + ", LastName=" + LastName + ", email=" + email
                + ", password=" + password + "]";
    }

    public boolean isEmailAddress(String strEmail) {
        if(strEmail.trim().equals("")) {
            System.out.println("email empty");
            return false;
        }
        char [] emailArray = strEmail.toCharArray();
        for (char dot : emailArray) {
            if (dot == '@') {
                return false;
            }
        }

        return true;
    }

    public User(String name, String lastName, String email, String password) {
        if (isEmailAddress(email)) {
            System.out.println("email error error error");
        }

        this.Name = name;
        this.LastName = lastName;
        this.email = email;
        this.password = password;
    }




}