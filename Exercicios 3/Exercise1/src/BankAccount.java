
public class BankAccount {
    // bank class, business rules, methods

    private float balance = 0f;     //saldo

    private float overdraft; //cheque especial(linha de crédito automatica após saldo negativo);

    private static float boletoValue;

    private boolean isUsingOverdraft = false;

    public BankAccount(boolean isUsingOverdraft, float balance) {
        this.isUsingOverdraft = isUsingOverdraft;
        this.balance = balance;
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

    public boolean isUsingOverdraft() {
        return isUsingOverdraft;
    }

    // Bank methods ------------------------------------------------------------

    public String deposit(float value) {
        this.balance += value;
        return "Deposit completed..     +U$" + value + "\n" +
                "current account balance: U$" + getBalance();
    }

    public String withdraw(float value) {
        this.balance -= value;
        return "Withdraw completed..   -U$" + value + "\n" +
                "current account balance: U$" + getBalance();

    }

    // Boleto (brazilian payment method), simulating values
    public static String generateBoleto() {
        float boletoPrice = (float) (Math.random() * (200f - 10f) + 10f);
        float boletoPriceRound = Math.round(boletoPrice * 10f) / 10f;
        boletoValue = boletoPriceRound;
        return String.format("Boleto price is U$%s ", boletoPriceRound);
    }



}
