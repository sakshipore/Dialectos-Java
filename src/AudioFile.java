public class AudioFile {
    String accentName;
    String audioId;

    AudioFile(String accentName, String audioId) {
        this.accentName=accentName; 
        this.audioId=audioId;
    }

    void playAudio() {} 

    void pauseAudio() {} 

    void resumeAudio() {}
}
