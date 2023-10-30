import java.util.Scanner;

public class Module {
    String id;
    String name;
    String description;
    String exercise;
    User user;

    Module(String id, String name, String description, String exercise, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.exercise = exercise;
        this.user = user;
    }

    public void startModule() throws InterruptedException {
        int options;
        boolean repeatOptions = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n1: Select Chapter \n2: Give Exercise \n3: Close");
            options = sc.nextInt();
            switch (options) {
                case 1:
                    Chapter chapter = new Chapter(this.id, this.name, this.description);
                    chapter.startChapter();
                    // Add 5 points to user score
                    double score = user.getProgress().score;
                    user.setProgress(new Progress(name,score + 5));
                    break;
                case 2:
                    Exercise exercise = new Exercise(this.id);
                    exercise.startExercise();
                    // Add 10 points to user score
                    score = user.getProgress().score;
                    user.setProgress(new Progress(name,score + 10));
                    exercise.quitExercise();
                    break;
                case 3:
                    repeatOptions = false;
                    break;
                default:
                    System.out.println("\nWrong Choice!!! Enter again");
            }
        } while (repeatOptions);
    }

    void switchModule() {
    }

    void evaluate() {
    }
}
