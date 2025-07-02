
public class Client extends BankAccount {

    private String name;
    private int age;

    // constructor using BankAccount root
    public Client(float balance, String name, int age) {
        super(balance);
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
        // verifying if the client account is using overdraft money
        if (getBalance() < 0) {
            bool = true;
        } else {
            bool = false;
        }
        setIsOverdrafting(bool);
        return String.format("Client " +
                getName() + " [overdraft] is: " + " U$" +
                getOverdraft() + ". \n" + "Is utilizing [overdraft] funds: " + "{{" + bool + "}}" + ".");
    }

    // pay boleto method
    public String payBoleto() {


        float Interest = 0f;
        String string = "";

        if (this.getBalance() >= this.getBoletoValue()) {
            float balance = getBalance();
            float boletoValue = getBoletoValue();
            float currentBalance = balance - boletoValue;
            this.setBoletoValue(0f);
            this.setBalance(currentBalance);
            return String.format("Boleto settled..     -U$%s \n" +
                    "current account balance: U$%s", boletoValue, currentBalance);
        } else if (this.getBalance() <= 0) {
            if (this.getBoletoValue() > this.getOverdraft() + 10) {
                string = String.format("Not enough funds to complete this transaction. \n" +
                        "Your balance: %s \n" +
                        "Your overdraft funds left: %s", getBalance(), getOverdraft());
            } else if (this.getBoletoValue() < this.getOverdraft() + 10) {
                float overdraft = this.getOverdraft(); // 50
                float boletoPrice = getBoletoValue(); // 43 sobrou 7 de overdraft
                setIsOverdrafting(true);
                float newDraft = (overdraft - boletoPrice);
                setOverdraft(newDraft);
                float boletoInterest = boletoInterest(isOverdrafting()); // 8.6
                //boleto price already paid
                float finalOverdraft = newDraft - boletoInterest;
                if (finalOverdraft < overdraft) {
                    setOverdraft(finalOverdraft);
                    string = String.format("Boleto settled..     \n -U$%s \n Boleto Interest: -U$%s \n" +
                            "current account overdraft: U$%s", boletoPrice, boletoInterest, getOverdraft());
                } else if (finalOverdraft > overdraft + 10) {
                    string = String.format("Not enough funds to complete this transaction. \n" +
                            "Your balance: %s \n" +
                            "Your overdraft funds left: %s", getBalance(), getOverdraft());
                }

                //boleto price, boletoprice, boletointerest, getoverdraft
            }
        } else {
            string = "Insufficient balance to complete the transaction. ";
        }
        return string;
    }


    @Override
    public String toString() {
        return String.format("------Client------ {\n" +
                "name: " + getName() + "\n" +
                "age: " + getAge() + "\n" +
                "balance: " + getBalance() + "\n" +
                "overdraft: " + getOverdraft() + "\n" +
                "Overdrafting: " + isOverdrafting() + "\n" +
                "min start:" + isMinStart() +
                "-----------------}");
    }
}
