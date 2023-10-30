import java.util.concurrent.TimeUnit;

public class AuthorizeUser{
    private String email;
    private String password;

    AuthorizeUser(String email, String password) {
        this.email=email;
        this.password=password;
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

    void login() throws InterruptedException {
        System.out.println("Logging in...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("User logged in with email: "+this.email);
    } 

    void logout() throws InterruptedException {
        System.out.println("Logging out...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Logged out successfully !");
    }
}
