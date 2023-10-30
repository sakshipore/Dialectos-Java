import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise {
    String id;
    String type;
    String question;
    List<String> optionList;
    String answer;

    Exercise(String id) {
        this.id = id;
    }

    void startExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nGive exercise...");
        question = "\nWhich of the following is a vowel ?";
        optionList = new ArrayList<>();
        optionList.add("f");
        optionList.add("w");
        optionList.add("a");
        optionList.add("q");

        System.out.println(question);
        for (int i = 0; i < 4; i++) {
            char ch = (char) (65 + i);
            System.out.println(ch + ": " + optionList.get(i));
        }

        System.out.print("\nEnter your answer: ");
        this.answer = sc.nextLine();
        System.out.println(this.answer);
        if (this.answer.equals("a") || this.answer.equals("C")) {
            System.out.println("\nYour answer is right !");
        } else {
            System.out.println("\nYour answer is wrong ");
        }
    }

    void quitExercise() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nExercise Completed !");
        Progress progress = new Progress(this.id, 5.0);
        progress.getProgress();

    }
}
