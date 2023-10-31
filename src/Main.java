import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        Transition transition = Transition.getInstance();

        System.out.println("\nCurrent state is: " + transition.getState());

        User user = new User();

        AuthorizeUser authorizeUser = new AuthorizeUser(user.getEmail(), user.getPassword());
        authorizeUser.login();
        transition.loginTransition();

        int choice;
        int feedbackChoice;
        int leaderboardChoice;
        int moduleChoice;
        boolean repeatModuleChoice = true;
        boolean repeatFeedbackChoice = true;
        boolean repeatLeaderboardChoice = true;

        do {
            System.out.println("\n1: Select Module \n2: Feedback \n3: Leaderboard \n4: Log Out");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("\n1: American Module \n2: German Module \n3: Russian Module\n4: Close");
                        moduleChoice = sc.nextInt();
                        Module selectedModule;
                        switch (moduleChoice) {
                            case 1:
                                selectedModule = new Module(
                                        "AME",
                                        "Americal",
                                        "American learning accent",
                                        "",
                                        user);
                                transition.moduleTransition();
                                selectedModule.startModule();
                                transition.exitModuleSelection();
                                break;
                            case 2:
                                selectedModule = new Module(
                                        "GER",
                                        "German",
                                        "German learning accent",
                                        "",
                                        user);
                                transition.moduleTransition();
                                selectedModule.startModule();
                                transition.exitModuleSelection();
                                break;
                            case 3:
                                selectedModule = new Module(
                                        "RUS",
                                        "Russian",
                                        "Russian learning accent",
                                        "",
                                        user);
                                transition.moduleTransition();
                                selectedModule.startModule();
                                transition.exitModuleSelection();
                                break;
                            case 4:
                                repeatModuleChoice = false;
                                transition.exitModuleSelection();
                                break;
                            default:
                                System.out.println("\nWrong Choice!!! Enter again");
                        }
                    } while (repeatModuleChoice);
                    break;
                case 2:
                    do {
                        System.out.println("\n1: Give Feedback \n2: Close");
                        feedbackChoice = sc.nextInt();
                        switch (feedbackChoice) {
                            case 1:
                                Feedback feedback = new Feedback(user.getId(), user.getEmail());
                                feedback.giveFeedback();
                                feedback.submitFeedback();
                                transition.feedbackTransition();
                                break;
                            case 2:
                                repeatFeedbackChoice = false;
                                break;
                            default:
                                System.out.println("\nWrong Choice!!! Enter again");
                        }
                    } while (repeatFeedbackChoice);

                    break;
                case 3:
                    do {
                        System.out.println("\n1: View Leaderboard \n2: Close");
                        leaderboardChoice = sc.nextInt();
                        switch (leaderboardChoice) {
                            case 1:
                                Leaderboard leaderboard = new Leaderboard(user.getEmail(), user.getProgress().score);
                                transition.leaderboardTransition();
                                leaderboard.viewLeaderboard();
                                break;
                            case 2:
                                repeatLeaderboardChoice = false;
                                break;
                            default:
                                System.out.println("\nWrong Choice!!! Enter again");
                        }
                    } while (repeatLeaderboardChoice);

                    break;
                case 4:
                    authorizeUser.logout();
                    transition.logoutTransition();
                    return;
            }
        } while (choice < 5);
        sc.close();
    }
}
