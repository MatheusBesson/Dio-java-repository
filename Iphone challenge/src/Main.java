import Model.Music;

public class Main {
    public static void main(String[] args) {

        Music song1 = new Music();
        System.out.println(song1.select("Free bird"));
        System.out.println(song1.select("      FRee bird"));

        System.out.println(song1.play());
        System.out.println(song1.play());
        System.out.println(song1.pause());
        System.out.println(song1.pause());



    }
}
