/**
 * Name: UserBill.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.pojo;

/**
 * @author Varun Ramani
 *
 */
public class UserBill {
	private double tariff = 0;
	private int units;
	
	public UserBill(int units) {
		this.units = units;
	}

	public double getTariff() {
		return tariff;
	}

	public void setTariff(double tariff) {
		this.tariff = tariff;
	}
	
	public void addToTariff(double tariff) {
		this.tariff += tariff;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
}
