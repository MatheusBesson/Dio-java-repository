
public class Client extends BankAccount {

    private String name;

    private int age;

    // constructor using BankAccount root
    public Client(boolean isUsingOverdraft, float balance, String name, int age) {
        super(isUsingOverdraft, balance);
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

    // balance print check
    public String getBalanceConsult() {
        return String.format("Client " + getName() + " current [balance] is: " + " U$" + getBalance());
    }

    // Overdraft print check
    public String getOverdraftConsult() {
        boolean bool;
        if (getBalance() < 0) {
            bool = true;
        } else {
            bool = false;
        }

        return String.format("Client " +
                getName() + " [overdraft] is: " + " U$" +
                getOverdraft() + ". \n" + "Is utilizing [overdraft] founds: " + "{{" + bool + "}}" +  ".");
    }

    // pay boleto method
    public String payBoleto() {
        if (this.getBalance() >= this.getBoletoValue()) {
            float balance = getBalance();
            float boletoValue = getBoletoValue();
            float currentBalance = balance - boletoValue;
            this.setBoletoValue(0f);
            this.setBalance(currentBalance);
            return String.format("Boleto settled..     -U$%s \n " +
                    "current account balance: U$%s", boletoValue, currentBalance);
        } else {
            return "Insufficient balance to complete the transaction. ";
        }
    }

    // verifying if the client account is using overdraft money
    public boolean isOverdrafting() {
        if (getOverdraft() < 0) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public String toString() {
        return String.format("------Client------ {\n" +
                "name: " + getName() + "\n" +
                "age: " + getAge() + "\n" +
                "balance: " + getBalance() + "\n" +
                "overdraft: " + getOverdraft() + "\n" +
                "Overdrafting: " + isUsingOverdraft() + "\n" +
                "-----------------}");
    }
}
