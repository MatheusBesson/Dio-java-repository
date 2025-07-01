import java.time.LocalTime;

public class BankAccount {
    // bank class, business rules, methods

    private float balance;     //saldo

    private float overdraft; //cheque especial(linha de crédito automatica após saldo negativo);

    private static float boletoValue;

    private boolean isOverdrafting;

    public LocalTime nowInH = LocalTime.now();


    public BankAccount(float balance) {
        this.balance = balance;
        if (this.balance <= 500) {
            overdraft = 50;
        } else {
            overdraft = this.balance / 2;
        }
    }

    //getters and setters ------------------------------------------------------------

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }


    // boleto getter
    public static float getBoletoValue() {
        return boletoValue;
    }

    // boleto setter
    public void setBoletoValue(float boletoValue) {
        this.boletoValue = boletoValue;
    }


    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public void setIsOverdrafting(boolean isOverdrafting) {
        this.isOverdrafting = isOverdrafting;
    }

    public boolean isOverdrafting() {
        return isOverdrafting;
    }


    // Bank methods ------------------------------------------------------------

    public String deposit(float value) {
        this.balance += value;
        return "Deposit completed..     +U$" + value + "\n" +
                "current account balance: U$" + getBalance();
    }

    public String withdraw(float value) {
        float sub;
        float newDraft;
        String string = "";

        if (this.balance > 0) {
            if (this.balance >= value) {
                sub = this.balance - value;
                setBalance(sub);
                string = "Withdraw completed..   -U$" + sub + "\n" +
                        "current account balance: U$" + getBalance() + "\n" +
                        "leftover overdraft: U$" + getOverdraft();
            } else if (this.balance < value) {
                //use sub to interest --------!!!
                sub = this.balance - value;
                setBalance(0);
                newDraft = this.overdraft - (-sub);
                setOverdraft(newDraft);
                string = "Withdraw completed..   -U$" + value + "\n" +
                        "[[ATENTION]] Not enough [Balance], [Overdraft] used.. \n" +
                        "current account balance: U$" + getBalance() + "\n" +
                        "leftover overdraft: U$" + getOverdraft();
            }
        } else if (this.balance <= 0) {
            if (this.overdraft < value) {
                string = String.format("[[ERROR]] not enough money to complete this transaction. \n" + "Overdraft money left: %s.", getOverdraft());
            } else if (this.overdraft >= value) {
                newDraft = this.overdraft - value;
                setOverdraft(newDraft);
                string = "Withdraw completed..   -U$" + value + "\n" +
                        "[[ATENTION]] Not enough [Balance], [Overdraft] used.. \n" +
                        "current account balance: U$" + getBalance() + "\n" +
                        "leftover overdraft: U$" + getOverdraft();
            }
        }
        return string;
    }

    // Boleto (brazilian payment method), simulating values
    public static String generateBoleto() {
        float boletoPrice = (float) (Math.random() * (200f - 10f) + 10f);
        float boletoPriceRound = Math.round(boletoPrice * 10f) / 10f;
        boletoValue = boletoPriceRound;
        return String.format("Boleto price is U$%s ", boletoPriceRound);
    }

    // generating interest boleto (Overdraft use)
    public String boletoInterest() {
        // use var sub interest
        if () {

        }
    }


}
