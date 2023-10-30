import java.util.Scanner;

public class User {
    private int id = 0;
    private String email;
    private String password;
    private String accent;
    private Progress progress;
    private String tokens;

    User() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter email: ");
        this.email = sc.nextLine();
        System.out.print("\nEnter password: ");
        this.password = sc.nextLine();
        this.id++;
        progress = new Progress("", 0);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAccent() {
        return accent;
    }

    public void setAccent(String accent) {
        this.accent = accent;
    }

    public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    public String getTokens() {
        return tokens;
    }

    public void setTokens(String tokens) {
        this.tokens = tokens;
    }

    void continueModule() {
    }

    void startNewModule() {
    }

    void selectAccent() {
    }
}
