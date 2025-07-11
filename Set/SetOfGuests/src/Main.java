public class Main {
    public static void main(String[] args) {
        SetOfGuests setOfGuests = new SetOfGuests();

        setOfGuests.addGuest("Matheus", 1000000);
        setOfGuests.addGuest("Érica", 1100000);
        setOfGuests.addGuest("Janice", 1110000);
        setOfGuests.addGuest("Paul", 1111000);
        setOfGuests.addGuest("Jennet", 1111100);
        setOfGuests.addGuest("Gerald", 1111110);
        setOfGuests.addGuest("Phinneas", 1111111);

        System.out.println(setOfGuests.totalGuests());
        System.out.println(setOfGuests.showAllGuests());

        setOfGuests.removeGuestByCode(121112);
        setOfGuests.removeGuestByCode(1111111);
        System.out.println(setOfGuests.showAllGuests());
    }
}
