/**
 * Name: CurrentAccount.java
 * Created by Varun Ramani
 * Date: 29-Sep-2019
 */
package account;

/**
 * @author Varun Ramani
 *
 */
public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String holdersName, double balance) {
		super(accountNumber, holdersName, balance);
	}

	@Override
	public double withdraw(double amount) throws Exception {
		if (getBalance() - amount < 0) {
			throw new Exception("Insufficient Balance");
		}
		setBalance(getBalance() - amount);
		return getBalance();
	}

}
