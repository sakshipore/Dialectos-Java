import java.util.Scanner;

public class Module {
    String id;
    String name;
    String description;
    String exercise;

    Module(String id, String name, String description, String exercise) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.exercise = exercise;
    }

    public void startModule() throws InterruptedException {
        int options;
        boolean repeatOptions = true;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1: Select Chapter \n2: Give Exercise \n3: Close");
            options = sc.nextInt();
            switch (options) {
                case 1:
                    // System.out.println("Implement Chapter Selection");
                    Chapter chapter=new Chapter(this.id, this.name, this.description);
                    chapter.startChapter();
                    break;
                case 2:
                    // System.out.println("Implement Excercise");
                    Exercise exercise=new Exercise(this.id);
                    exercise.startExercise();
                    exercise.quitExercise();
                    break;
                case 3:
                    repeatOptions = false;
                    break;
                default:
                    System.out.println("Wrong Choice!!! Enter again");
            }
        } while (repeatOptions);
    }

    void switchModule() {
    }

    void evaluate() {
    }
}
