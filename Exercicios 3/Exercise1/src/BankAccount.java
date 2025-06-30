
public class BankAccount {
    // bank class, business rules, methods

    private float balance = 0f;     //saldo

    private float overdraft = 500f; //cheque especial(linha de crédito automatica após saldo negativo);

    private boolean isUsingOverdraft = false;

    public BankAccount(boolean isUsingOverdraft, float overdraft, float balance) {
        this.isUsingOverdraft = isUsingOverdraft;
        this.overdraft = overdraft;
        this.balance = balance;
    }

    //getters and setters ------------------------------------------------------------

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public boolean isUsingOverdraft() {
        return isUsingOverdraft;
    }

    // Bank methods ------------------------------------------------------------

    // deposit method -------------
    public String deposit(float value) {
        this.balance += value;
       return "Deposit completed..     +U$" + value + "\n" +
                "current balance: U$" + getBalance();
    }

    public String withdraw(float value) {
        this.balance -= value;
        return "Withdraw completed..   -U$" + value + "\n" +
                "current balance: U$" + getBalance();

    }

}
