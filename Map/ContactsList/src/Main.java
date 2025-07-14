public class Main {
    public static void main(String[] args) {
        ContactsList contactsMap = new ContactsList();


        contactsMap.addContact("Matheus Besson", "37 829947518");
        contactsMap.addContact("Jonalson", "37 829747518");
        contactsMap.showContacts();
        contactsMap.serchByName("Matheus Besson");

        contactsMap.removeContact("Jonalson");
        contactsMap.showContacts();
    }
}
