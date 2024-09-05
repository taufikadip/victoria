public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("5544", "Kevin");
        account.deposit(500);
        account.withdraw(100);
        System.out.println("Account Holder : " + account.setAccountHolder(););
        System.out.println("Current balance : " + account.getBalance());
    }
}