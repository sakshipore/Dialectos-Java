public class Module {
    private String id;
    private String name;
    private String description;
    private String exercise;

    public Module(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(String id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setDescriptionn(String description){
        this.description=description;
    }

    public void setExercise(String exercise){
        this.exercise=exercise;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getExercise(){
        return this.exercise;
    }

    void startModule() {} 

    void switchModule() {} 

    void evaluate() {}
}
