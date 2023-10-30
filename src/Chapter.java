import java.util.Scanner;

public class Chapter {
    String id;
    String name;
    String description;

    Chapter(String id, String name, String description) {
        this.id=id;
        this.name=name;
        this.description=description;
    }

    void startChapter() throws InterruptedException {
        int chapterChoice;
        boolean repeatChapterChoice=true;
        AudioFile audioFile;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n1: Chapter 1 -> Easy Level \n2: Chapter 2 -> Medium Level \n3: Chapter 3 -> Hard Level \n4: Close");
            chapterChoice=sc.nextInt();
            switch(chapterChoice) {
                case 1: 
                    audioFile=new AudioFile(this.name, this.id);
                    audioFile.playAudio();
                break;
                case 2:
                    audioFile=new AudioFile(this.name, this.id);
                    audioFile.playAudio();
                break;
                case 3:
                audioFile=new AudioFile(this.name, this.id);
                    audioFile.playAudio();
                break;
                case 4: 
                    repeatChapterChoice=false;                    
                break;
                default: 
                    System.out.println("\nWrong Choice !!! Enter again");

            }
        }while(repeatChapterChoice);
    }
}
