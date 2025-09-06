class Q12 {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public Q12(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, "Saksham", 10000);
        sa.displayDetails();
        sa.deposit(5000);
        sa.withdraw(3000);
        sa.displayDetails();
    }
}

class SavingsAccount extends Q12 {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
    }
}
