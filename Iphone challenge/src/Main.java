import Model.Music;
import Model.Video;

public class Main {
    public static void main(String[] args) {

        Music song1 = new Music();
        System.out.println(song1.select("Free bird"));
        System.out.println(song1.select("      FRee bird"));

        System.out.println(song1.play());
        System.out.println(song1.play());
        System.out.println(song1.pause());
        System.out.println(song1.pause());

        Video video1 = new Video();
        System.out.println(video1.select("Cutting Youtube's play button in half."));
        System.out.println(video1.play());
        System.out.println(video1.play());
        System.out.println(video1.pause());
        System.out.println(video1.pause());




    }
}
