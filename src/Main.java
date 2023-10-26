public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        User user=new User("abc", "abc","abc","abc","abc","abc","abc");
        System.out.println(user.id);

        Module module=new Module("abc", "abc", "abc", "abc");
        System.out.println(module.id);

        Exercise exercise=new Exercise("abc", "abc", "abc", "abc", "abc");
        System.out.println(exercise.id);

        Leaderboard leaderboard=new Leaderboard("abc", "abc");
        System.out.println(leaderboard.userName);

        Feedback feedback=new Feedback("abc", "abc", "abc");
        System.out.println(feedback.user);

        Progress progress=new Progress("abc", "abc", "abc", "abc", "abc");
        System.out.println(progress.id);

        Chapter chapter=new Chapter("abc", "abc", "abc");
        System.out.println(chapter.id);

        AudioFile audioFile=new AudioFile("abc", "abc");
        System.out.println(audioFile.audioId);
    }
}
