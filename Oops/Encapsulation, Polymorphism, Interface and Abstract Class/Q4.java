import java.util.*;

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility(double amount);
}

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;
    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public int getAccountNumber() { return accountNumber; }
    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }
    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }
    public abstract double calculateInterest();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int accNo, String name, double balance) { super(accNo, name, balance); }
    public double calculateInterest() { return getBalance() * 0.04; }
    public void applyForLoan(double amount) { System.out.println("Loan applied: " + amount); }
    public boolean calculateLoanEligibility(double amount) { return getBalance() > amount/2; }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(int accNo, String name, double balance) { super(accNo, name, balance); }
    public double calculateInterest() { return getBalance() * 0.02; }
    public void applyForLoan(double amount) { System.out.println("Loan applied: " + amount); }
    public boolean calculateLoanEligibility(double amount) { return getBalance() > amount/3; }
}

public class Q4 {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(101, "Alice", 50000));
        accounts.add(new CurrentAccount(102, "Bob", 30000));
        for (BankAccount acc : accounts) {
            System.out.println("===============================");
            System.out.println("Account Holder: " + acc.getHolderName());
            System.out.println("Interest: " + acc.calculateInterest());
            if (acc instanceof Loanable) {
                Loanable loan = (Loanable)acc;
                System.out.println("Loan Eligibility for 40000: " + loan.calculateLoanEligibility(40000));
            }
        }
    }
}
