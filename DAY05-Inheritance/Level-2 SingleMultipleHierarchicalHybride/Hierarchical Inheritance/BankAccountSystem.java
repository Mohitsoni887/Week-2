/*
 *Bank Account Types
Description: Model a banking system with different account types using hierarchical inheritance. BankAccount is the superclass, with SavingsAccount, CheckingAccount, and FixedDepositAccount as subclasses.
Tasks:
Define a base class BankAccount with attributes like accountNumber and balance.
Define subclasses SavingsAccount, CheckingAccount, and FixedDepositAccount, each with unique attributes like interestRate for SavingsAccount and withdrawalLimit for CheckingAccount.
Implement a method displayAccountType() in each subclass to specify the account type.
Goal: Explore hierarchical inheritance, demonstrating how each subclass can have unique attributes while inheriting from a shared superclass. 
 */
// Base Class: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    // Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    // Method to display account type
    public void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    // Constructor
    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int depositTerm; // in months

    // Constructor
    public FixedDepositAccount(String accountNumber, double balance, int depositTerm) {
        super(accountNumber, balance);
        this.depositTerm = depositTerm;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Deposit Term: " + depositTerm + " months");
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}

// Main Class to Test the Hierarchy
public class BankAccountSystem {
    public static void main(String[] args) {
        // Create instances of different account types
        SavingsAccount savings = new SavingsAccount("SA123", 5000.0, 2.5);
        CheckingAccount checking = new CheckingAccount("CA456", 1000.0, 300.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000.0, 12);

        // Display account details and types
        System.out.println("Savings Account Details:");
        savings.displayAccountDetails();
        savings.displayAccountType();
        System.out.println();

        System.out.println("Checking Account Details:");
        checking.displayAccountDetails();
        checking.displayAccountType();
        System.out.println();

        System.out.println("Fixed Deposit Account Details:");
        fixedDeposit.displayAccountDetails();
        fixedDeposit.displayAccountType();
    }
}
