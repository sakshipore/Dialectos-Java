public class Progress {
    String id;
    String user;
    String module;
    String status;
    String score;

    Progress(String id, String user, String module, String status, String score) {
        this.id=id;
        this.user=user;
        this.module=module;
        this.status=status;
        this.score=score;
    }

    void getProgress() {}
}
