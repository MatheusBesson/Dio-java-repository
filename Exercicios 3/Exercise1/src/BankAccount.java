import java.time.LocalTime;

public class BankAccount {
    // bank class, business rules, methods

    private float balance;     //saldo

    private float overdraft; //cheque especial(linha de crédito automatica após saldo negativo);

    private static float boletoValue;

    private boolean isOverdrafting;

    public boolean minStart;


    public LocalTime nowInH = LocalTime.now();
    float sub;
    float newDraft;


    public BankAccount(float balance) {
        this.balance = balance;
        if (this.balance <= 500) {
            overdraft = 50;
        } else {
            overdraft = this.balance / 2;
        }
        if (this.balance <= 500) {
            this.setMinStart(true);
        } else {
            this.setMinStart(false);
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

    public boolean isMinStart() {
        return minStart;
    }

    public void setMinStart(boolean minStart) {
        this.minStart = minStart;
    }


    // Bank methods ------------------------------------------------------------

    public String deposit(float value) {
        this.balance += value;
        return "Deposit completed..     +U$" + value + "\n" +
                "current account balance: U$" + getBalance();
    }

    public String withdraw(float value) {

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
    public float boletoInterest(boolean isOverdrafting) {
        // use var sub interest to 20%
        String string = "";
        float boletoInterest = 0f;

        if (minStart) {
            sub = 50 - getOverdraft();
        } else {
            sub = 500 - getOverdraft();
        }

        if (isOverdrafting()) {
            boletoInterest = sub / 5; // 20% of overdraft money spent
        } else {
            string = String.format("Not using overdraft funds. \nOverdraft funds used:");
            System.out.println(string);
        }
        return boletoInterest;
    }


}
