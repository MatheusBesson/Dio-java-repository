

public class Client extends BankAccount {

    private String name;

    private int age;

    // constructor using BankAccount root
    public Client(boolean isUsingOverdraft, float overdraft, float balance, String name, int age) {
        super(isUsingOverdraft, overdraft, balance);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("------Client------ {\n" +
                "name: " + getName()  + "\n"+
                "age: " + getAge() + "\n"+
                "balance: " + getBalance() + "\n"+
                "overdraft: " + getOverdraft() + "\n"+
                "Overdrafting: " + isUsingOverdraft() + "\n" +
                "-----------------}");
    }
}
