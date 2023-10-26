public class Module {
    String id;
    String name;
    String description;
    String exercise;

    Module(String id, String name, String description, String exercise) {
        this.id=id;
        this.name=name;
        this.description=description;
        this.exercise=exercise;
    }

    void startModule() {} 

    void switchModule() {} 

    void evaluate() {}
}
