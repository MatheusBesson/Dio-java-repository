import Model.Contact;
import Model.Music;
import Model.Phone;
import Model.Video;

public class Main {
    public static void main(String[] args) {

        // player
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

        // Phone Interface
        Phone phone = new Phone("Jeff", "40028922");
        phone.addContact(new Contact("bob", "12345678"));
        System.out.println(phone.addContact(new Contact("Janice", "87654321")));

        System.out.println(phone.contactsList());
       // System.out.println(phone.removeContact("JANIce "));
        System.out.println(phone.contactsList());
        System.out.println(phone.call("40028922"));
        System.out.println(phone.decline());


    }
}
