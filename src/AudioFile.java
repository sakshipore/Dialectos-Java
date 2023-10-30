import java.util.concurrent.TimeUnit;

public class AudioFile {
    String accentName;
    String audioId;

    AudioFile(String accentName, String audioId) {
        this.accentName=accentName; 
        this.audioId=audioId;
    }

    void playAudio() throws InterruptedException {
        System.out.println("\nPlaying audio...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("\nAudio completed !");
    } 

    void pauseAudio() {
        System.out.println("\nAudio Paused");
    } 

    void resumeAudio() {
        System.out.println("\nReplay Audio");
    }
}
