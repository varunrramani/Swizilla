/**
 * Name: RaChargeRule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.racharge;

import billing.rule.Rule;
import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class Sub100RaChargeRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units < 100) {
			userBill.addToTariff(units * 0.07);
		} else if (units >= 100) {
			userBill.addToTariff(100 * 0.07);
		}
	}

}
