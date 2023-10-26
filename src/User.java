public class User {
    String id;
    String email;
    String password;
    String accent;
    String progress;
    String tokens;

    User(String id, String email, String password, String accent, String progress, String tokens, String string) { 
        this.id=id;
        this.email=email;
        this.password=password;
        this.accent=accent;
        this.progress=progress;
        this.tokens=tokens;
    }

    void continueModule() {} 

    void startNewModule() {} 

    void selectAccent() {}
}
