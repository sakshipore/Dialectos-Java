import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        User user = new User();
        user.requestAuthentication();

        String email,password;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter email: ");
        email = sc.nextLine();
        System.out.print("\nEnter password: ");
        password = sc.nextLine();

        Authentication auth = new Authentication();
        auth.authenticateUser(email, password);
    }
}
