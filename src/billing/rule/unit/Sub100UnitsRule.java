/**
 * Name: Sub100UnitsRule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.unit;

import billing.rule.Rule;
import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class Sub100UnitsRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units < 100) {
			userBill.addToTariff(units * 1.35);
		} else if (units >= 100) {
			userBill.addToTariff(100 * 1.35);
		}
	}

}
