import java.util.ArrayList;

// Account class
class Account {
    private String accountId;
    private double balance;

    // Constructor
    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    // Getters
    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    // Getters
    public String getName() {
        return name;
    }

    // Add an account to the customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // View the balance of a specific account
    public double viewBalance(String accountId) {
        for (Account account : accounts) {
            if (account.getAccountId().equals(accountId)) {
                return account.getBalance();
            }
        }
        System.out.println("Account not found");
        return -1;
    }
}

// Bank class
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Open an account for a customer
    public void openAccount(Customer customer, String accountId, double initialDeposit) {
        Account newAccount = new Account(accountId, initialDeposit);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        System.out.println("Account opened for " + customer.getName());
    }
}

public class  BankandAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Open accounts for customers
        bank.openAccount(customer1, "12345", 5000);
        bank.openAccount(customer2, "67890", 3000);

        // View balances
        double balance1 = customer1.viewBalance("12345");
        double balance2 = customer2.viewBalance("67890");

        System.out.println("Balance for Alice: " + balance1);
        System.out.println("Balance for Bob: " + balance2);
    }
}
