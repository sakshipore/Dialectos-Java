public class Exercise {
    String id;
    String type;
    String question;
    String optionList;
    String answer;

    Exercise(String id, String type, String question, String optionList, String answer) {
        this.id=id;
        this.type=type;
        this.question=question;
        this.optionList=optionList;
        this.answer=answer;
    }

    void startExercise() {} 

    void quitExercise() {}
}
