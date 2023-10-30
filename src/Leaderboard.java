public class Leaderboard {
    String userName;
    double score;

    Leaderboard(String userName, double score) {
        this.userName = userName;
        this.score = score;
    }

    void viewLeaderboard() {
        System.out.println("Peter -> 10");
        System.out.println("Alice -> 15");
        System.out.println("Bob -> 5");
        System.out.println(this.userName + " -> " + this.score + "\n");
    }
}
