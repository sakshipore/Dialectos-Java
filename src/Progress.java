public class Progress {
    String id;
    String user;
    String module;
    String status;
    double score;

    Progress(String module, double score) {
        this.module = module;
        this.score = this.score + score;
    }

    void getProgress() {
        if (this.module.equals("")) {
            System.out.println("\nNo module completed !");
        } else {
            System.out.println("\nCompleted Module -> " + this.module);
        }

    }
}
