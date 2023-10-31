import java.util.Scanner;

public class Transition {
    Scanner in = new Scanner(System.in);
    private State state = State.UNAUTHORIZED;

    private static Transition instance = null;

    public static Transition getInstance() {
        if (instance == null)
            instance = new Transition();

        return instance;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void loginTransition() {
        if (state.equals(State.UNAUTHORIZED)) {
            setState(State.AUTHORIZED);
            System.out.println("\nCurrent state is: " + state);
        }
    }

    public void logoutTransition() {
        if (state.equals(State.AUTHORIZED)) {
            setState(State.UNAUTHORIZED);
            System.out.println("\nCurrent state is: " + state);
        }
    }

    public void moduleTransition() {
        if (state.equals(State.AUTHORIZED)) {
            setState(State.MODULE_SELECTED);
            System.out.println("\nCurrent state is: " + state);
        }
    }

    public void learningTransition() {
        setState(State.LEARNING);
        System.out.println("\nCurrent state is: " + state);
    }

    public void excerciseTransition() {
        setState(State.GIVE_EXCERCISE);
        System.out.println("\nCurrent state is: " + state);
    }

    public void exitModuleSelection() {
        if (state.equals(State.MODULE_SELECTED) || state.equals(State.LEARNING) || state.equals(State.GIVE_EXCERCISE)) {
            setState(State.AUTHORIZED);
            System.out.println("\nCurrent state is: " + state);
        }
    }

    public void feedbackTransition() {
        if (state.equals(State.AUTHORIZED)) {
            setState(State.GIVE_FEEDBACK);
            System.out.println("\nCurrent state is: " + state);
            setState(State.AUTHORIZED);
        }
    }

    public void leaderboardTransition() {
        if (state.equals(State.AUTHORIZED)) {
            setState(State.VIEW_LEADERBOARD);
            System.out.println("\nCurrent state is: " + state);
            setState(State.AUTHORIZED);
        }
    }
}
