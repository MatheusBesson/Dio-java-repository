public class Main {
    public static void main(String[] args) {

        OnlineLibrary onlineLibrary = new OnlineLibrary();

        onlineLibrary.addBook("link2", "The long hair barber", "Sicund Anothervein", 50);

        onlineLibrary.addBook("link1", "The hairless barber", "Phirlst Onetrovein", 30 );



        System.out.println(onlineLibrary.booksByPrice());
    }
}
