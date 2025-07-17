package src;

public class Main {
    public static void main(String[] args) {

        OnlineLibrary onlineLibrary = new OnlineLibrary();

        onlineLibrary.addBook("link2", "The long hair barber", "Sicund Anothervein", 50);

        onlineLibrary.addBook("link1", "The hairless barber", "Phirlst Onetrovein", 30 );

        onlineLibrary.addBook("link3", "The hairless barber", "Phirlst Onetrovein", 10 );

        onlineLibrary.addBook("link4", "The hairless barber", "Phirlst Onetrovein", 100 );
        onlineLibrary.addBook("link5", "The hairless barber", "Phirlst Onetrovein", 200 );
        onlineLibrary.addBook("link6", "The hairless barber", "Phirlst Onetrovein", 1);
        onlineLibrary.addBook("link7", "The hairless barber", "Phirlst Onetrovein", 150 );


         onlineLibrary.removeBook("The long hair barber");

        System.out.println(onlineLibrary.lessExpensiveBook());
        System.out.println(onlineLibrary.getMoreExpensiveBook());




        System.out.println(onlineLibrary.booksByPrice());
    }
}
