import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsList {
    private Map<String, String> contactsMap;

    public ContactsList() {
        this.contactsMap = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        String trimName = name.trim();
        String trimPhoneNumber = phoneNumber.trim();
        String trimAwnser = "";

        if (contactsMap.containsKey(trimName)) {
            System.out.println(String.format("Contact %s already exists, do you want to Update this contact? (YES, NO)\n", trimName));
            Scanner scanner = new Scanner(System.in);
            trimAwnser = scanner.nextLine().trim();
            if (!trimAwnser.equalsIgnoreCase("YES") && !trimAwnser.equalsIgnoreCase("NO")) {
                System.out.println("You should type only YES or NO. \n Operation canceled..\n");
            }
            if (trimAwnser.equalsIgnoreCase("YES")) {
                contactsMap.put(name, phoneNumber);
                System.out.println("Contact Updated.\n");
            }
            if (trimAwnser.equalsIgnoreCase("NO")) {
                System.out.println("Update canceled.\n");
            }
        } else {
            contactsMap.put(trimName, trimPhoneNumber);
            System.out.println("Contact added to Map.");
        }
    }

    public void removeContact(String name) {
        String trimName = name.trim();
        if (contactsMap.containsKey(trimName)) {
            contactsMap.remove(trimName);
            System.out.println("Contact removed from map.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void showContacts() {
                String result = "";
        contactsMap.forEach((name, phoneNumber) -> {
            System.out.println("Name: " + name + " | Phone Number: " + phoneNumber);
                });
    }

    public void serchByName(String name) {
        String trimName = name.trim();
        if (!contactsMap.containsKey(trimName)) {
            System.out.println("Contact does not exist.");
        } else {
            String phoneNumber = contactsMap.get(trimName);
            System.out.println(String.format("%s's phone number: %s", trimName, phoneNumber));
        }
    }


    @Override
    public String toString() {
        return "========== ContactsList ========== \n" +
                "contactsMap: " + contactsMap + "\n" +
                "==================================\n";
    }
}
