import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        User user = new User();

        AuthorizeUser authorizeUser = new AuthorizeUser(user.getEmail(), user.getPassword());
        authorizeUser.login();

        int choice;
        int feedbackChoice;
        int leaderboardChoice;
        int moduleChoice;
        boolean repeatModuleChoice = true;
        boolean repeatFeedbackChoice = true;
        boolean repeatLeaderboardChoice = true;

        do {
            System.out.println("1: Select Module \n2: Feedback \n3: Leaderboard \n4: Log Out");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("1: American Module \n2: German Module \n3: Russian Module\n4: Close");
                        moduleChoice = sc.nextInt();
                        Module selectedModule;
                        switch (moduleChoice) {
                            case 1:
                                selectedModule = new Module(
                                        "AME", "Americal", "American learning accent", "");
                                selectedModule.startModule();
                                break;
                            case 2:
                                selectedModule = new Module(
                                        "GER", "German", "German learning accent", "");
                                selectedModule.startModule();
                                break;
                            case 3:
                                selectedModule = new Module(
                                        "RUS", "Russian", "Russian learning accent", "");
                                selectedModule.startModule();
                                break;
                            case 4:
                                repeatModuleChoice = false;
                                break;
                            default:
                                System.out.println("Wrong Choice!!! Enter again");
                        }
                    } while (repeatModuleChoice);
                    break;
                case 2:
                    do {
                        System.out.println("1: Give Feedback \n2: Close");
                        feedbackChoice = sc.nextInt();
                        switch (feedbackChoice) {
                            case 1:
                                Feedback feedback = new Feedback(user.getId(), user.getEmail());
                                feedback.giveFeedback();
                                feedback.submitFeedback();
                                break;
                            case 2:
                                repeatFeedbackChoice = false;
                                break;
                            default:
                                System.out.println("Wrong Choice!!! Enter again");
                        }
                    } while (repeatFeedbackChoice);

                    break;
                case 3:
                    do {
                        System.out.println("1: View Leaderboard \n2: Close");
                        leaderboardChoice = sc.nextInt();
                        switch (leaderboardChoice) {
                            case 1:
                                Leaderboard leaderboard = new Leaderboard(user.getEmail(), 0.0);
                                leaderboard.viewLeaderboard();
                                break;
                            case 2:
                                repeatLeaderboardChoice = false;
                                break;
                            default:
                                System.out.println("Wrong Choice!!! Enter again");
                        }
                    } while (repeatLeaderboardChoice);

                    break;
                case 4:
                    authorizeUser.logout();
                    return;
            }
        } while (choice < 3);
    }
}
