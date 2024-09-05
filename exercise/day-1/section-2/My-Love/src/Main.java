public class Main {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount account1 = new BankAccount("5544", "Kevin");

        // Menampilkan informasi akun
        account1.printAccountDetails();

        // Melakukan deposit
        account1.deposit(5000.0);

        // Menampilkan saldo setelah deposit
        System.out.println("Saldo setelah deposit: " + account1.getBalance());

        // Melakukan penarikan
        account1.withdraw(2000.0);

        // Menampilkan saldo setelah penarikan
        System.out.println("Saldo setelah penarikan: " + account1.getBalance());

        // Mengganti nama pemilik akun
        account1.setAccountHolder("Zulkarta");

        // Menampilkan informasi akun setelah perubahan nama
        account1.printAccountDetails();
    }
}