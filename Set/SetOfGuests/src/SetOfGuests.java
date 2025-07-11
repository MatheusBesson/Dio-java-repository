import java.sql.SQLOutput;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfGuests {

    private Set<Guest> guestSet;

    public SetOfGuests() {
        this.guestSet = new HashSet<>() {
        };
    }

    public void addGuest(String name, int inviteCode) {
        Guest guest = new Guest(name, inviteCode);
        guestSet.add(guest);
        System.out.println("Guest added to Guest Set.\n");
    }

    public void removeGuestByCode(int inviteCode) {
        boolean flag = false;
        if (!guestSet.isEmpty()) {
            for (Guest g : guestSet) {
                if (g.getInviteCode() == inviteCode) {
                    guestSet.remove(g);
                    System.out.println("Guest removed from Guest Set.\n");
                    flag = true;
                    break;
                }
            }
        } else {
            System.out.println("The Guest Set is empty.\n");
        }
        if (!flag) {
            System.out.println("Guest not found. \n");
        }
        flag = true;
    }

    public String totalGuests() {
        int totalGuests = guestSet.size();
        return "Number of total guests is " + totalGuests + ".";
    }

    public String showAllGuests() {
        return guestSet.toString();
    }
}
