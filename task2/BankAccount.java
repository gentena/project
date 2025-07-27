package javaoops.task2;

public class BankAccount {

	    private int accountNumber;
	    private double balance;

	    // Constructor
	    public BankAccount(int accountNumber, double initialBalance) {
	        this.accountNumber = accountNumber;
	        this.balance = initialBalance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: $" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: $" + amount);
	        } else {
	            System.out.println("Insufficient funds or invalid withdrawal amount.");
	        }
	    }

	    // Method to get the balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to get the account number
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public static void main(String[] args) {
	        BankAccount account = new BankAccount(12345, 1000.0);
	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Initial Balance: $" + account.getBalance());

	        account.deposit(500.0);
	        System.out.println("Balance after deposit: $" + account.getBalance());

	        account.withdraw(200.0);
	        System.out.println("Balance after withdrawal: $" + account.getBalance());
	    }
	}

	