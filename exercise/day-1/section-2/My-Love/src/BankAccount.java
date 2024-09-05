public class BankAccount {
    // Private fields untuk encapsulation
    private String accountNumber;
    private double balance;
    private String accountHolder;

    // Constructor untuk menginisialisasi accountNumber dan accountHolder, balance diinisialisasi ke 0.0
    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    // Method untuk menambahkan uang ke saldo (balance)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Berhasil deposit sebesar: " + amount);
        } else {
            System.out.println("Jumlah deposit harus positif.");
        }
    }

    // Method untuk menarik uang dari saldo (balance) jika jumlahnya tidak lebih dari saldo saat ini
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Berhasil menarik sebesar: " + amount);
        } else if (amount > balance) {
            System.out.println("Penarikan gagal. Saldo tidak cukup.");
        } else {
            System.out.println("Jumlah penarikan harus positif.");
        }
    }

    // Method untuk mendapatkan saldo saat ini
    public double getBalance() {
        return balance;
    }

    // Method untuk mendapatkan nama pemilik akun
    public String getAccountHolder() {
        return accountHolder;
    }

    // Method untuk mengubah nama pemilik akun
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Optional: Menampilkan informasi akun
    public void printAccountDetails() {
        System.out.println("Nomor Akun: " + accountNumber);
        System.out.println("Pemilik Akun: " + accountHolder);
        System.out.println("Saldo Saat Ini: " + balance);
    }
}