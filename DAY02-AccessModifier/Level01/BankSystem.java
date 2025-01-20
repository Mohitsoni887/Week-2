// Base BankAccount Class
class BankAccount {
    public int accountNumber; // Public: Accessible everywhere
    protected String accountHolder; // Protected: Accessible by subclasses and within the package
    private double balance; // Private: Only accessible within BankAccount

    // Constructor to initialize BankAccount details
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to access the balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify the balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate; // Specific to SavingsAccount

    // Constructor for SavingsAccount
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance); // Call parent constructor
        this.interestRate = interestRate;
    }

    // Method to calculate and apply interest
    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest); // Use deposit method from BankAccount
        System.out.println("Interest of $" + interest + " applied at rate " + interestRate + "%.");
    }

    // Overriding displayAccountDetails to include interest rate
    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails(); // Call parent method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main Class to Demonstrate Functionality
public class BankSystem {
    public static void main(String[] args) {
        // Creating a BankAccount object
        BankAccount account = new BankAccount(12345, "John Doe", 1000.0);
        System.out.println("--- Bank Account Details ---");
        account.displayAccountDetails();

        // Performing deposit and withdrawal
        account.deposit(500.0);
        account.withdraw(200.0);
        System.out.println("\n--- Updated Bank Account Details ---");
        account.displayAccountDetails();

        // Creating a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(67890, "Jane Smith", 2000.0, 3.5);
        System.out.println("\n--- Savings Account Details ---");
        savings.displayAccountDetails();

        // Applying interest
        savings.applyInterest();
        System.out.println("\n--- Updated Savings Account Details ---");
        savings.displayAccountDetails();
    }
}

