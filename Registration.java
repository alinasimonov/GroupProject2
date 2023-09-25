package project2;

public class Registration {
    // 12. Create Registration Class in which you would have variables as email, userName and password that have an access scope only within its own class. After
    // creating an object of the class user should be able to call methods and in each method separately pass values to set users email, username and password.
    //Requirements: A. Valid email consider to be only yahoo B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
    // Also valid password cannot contain userName.
    private String email;
    private String userName;
    private String password;

    public Registration() {
        this.email = "";
        this.userName = "";
        this.password = "";
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Please use Yahoo email.");
        }
    }
    public void setUserName(String userName) {
        if (isValidUserName(userName)) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. Username should be at least 6 characters long and not empty.");
        }
    }
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            System.out.println("Invalid password. Password should be at least 6 characters long, not empty, and not contain the username.");
        }
    }
    private boolean isValidEmail(String email) {
        return email.endsWith("@yahoo.com");
    }


    private boolean isValidUserName(String userName) {
        return userName.length() > 6 && !userName.isEmpty();
    }


    private boolean isValidPassword(String password) {
        return password.length() > 6 && !password.isEmpty() && !password.contains(userName);
    }
    public void displayUserInfo() {
        System.out.println("User Information:");
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Registration user = new Registration();


        user.setEmail("alina@yahoo.com");
        user.setUserName("alina123");
        user.setPassword("alina1234");


        user.displayUserInfo();
    }
}

