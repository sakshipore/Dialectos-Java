import java.util.Scanner;

public class Feedback {
    int id;
    String user;
    String message;

    Feedback(int id, String user) {
        this.id=id;
        this.user=user;
    }

    void giveFeedback() {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nPlease enter your feedback: ");
        this.message=sc.nextLine();
    }

    void submitFeedback() {
        System.out.println("\nFeedback submitted by user: "+this.user);
    }
}
