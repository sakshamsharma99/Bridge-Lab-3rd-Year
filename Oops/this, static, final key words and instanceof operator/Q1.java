class BankAccount {
    static String bankName = "ABC Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++;
    }

    static void displayTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(101, "John", 5000);
        BankAccount a2 = new BankAccount(102, "Alice", 7000);
        BankAccount.displayTotalAccounts();
        a1.displayAccountDetails();
        a2.displayAccountDetails();
    }
}
