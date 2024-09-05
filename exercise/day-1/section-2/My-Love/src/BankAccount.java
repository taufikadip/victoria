public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolder;
    public int amount;

    public BankAccount(String accountNumber, String accountHolder){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0.0;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public String getAccountHolder(){
        return accountHolder;
    }

    public void deposit(double amount){
        if (balance > 0){
            balance += amount;
        }
    }

    public void int withdraw(double amount){
        if (balance <= amount)
            balance -= amount;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
