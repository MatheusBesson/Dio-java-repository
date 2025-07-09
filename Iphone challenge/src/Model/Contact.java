package Model;

public class Contact {
    // attributes
    private String name;
    private String number;

    // constructors
    public Contact(String name, String number) {
        this.name = name.trim();
        this.number = number.trim();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
