package account;

public abstract class Account {

	private int accountNumber;
	private String holdersName;
	private double balance;

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHoldersName() {
		return holdersName;
	}

	public void setHoldersName(String holdersName) {
		this.holdersName = holdersName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int accountNumber, String holdersName, double balance) {
		this.accountNumber = accountNumber;
		this.holdersName = holdersName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "{" + "Account Number: " + accountNumber + ", "
				+ "Holder's Name: " + holdersName + ", " + "Balance: " + balance + "}";

	}

	public abstract double withdraw(double amount) throws Exception;

	public double deposit(double amount) {
		// Add the amount to balance
		balance += amount;
		return balance;
	}
}
