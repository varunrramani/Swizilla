/**
 * Name: SavingsAccount.java
 * Created by Varun Ramani
 * Date: 29-Sep-2019
 */
package account;

/**
 * @author Varun Ramani
 *
 */
public class SavingsAccount extends Account {
	
	private int minimumBalance = 500;

	public SavingsAccount(int accountNumber, String holdersName, double balance) {
		super(accountNumber, holdersName, balance);
	}

	/**
	 * @return the minimumBalance
	 */
	public int getMinimumBalance() {
		return minimumBalance;
	}

	/**
	 * @param minimumBalance the minimumBalance to set
	 */
	public void setMinimumBalance(int minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	@Override
	public double withdraw(double amount) throws Exception {
		if (getBalance() - amount < minimumBalance) {
			throw new Exception("Insufficient Balance");
		}
		setBalance(getBalance() - amount);
		return getBalance();
	}
	
}
