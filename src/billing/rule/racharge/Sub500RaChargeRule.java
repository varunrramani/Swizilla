/**
 * Name: Sub500RaChargeRule.java
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
public class Sub500RaChargeRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units > 300 && units < 500) {
			userBill.addToTariff(((units - 300) * 0.42));
		} else if (units >= 500) {
			userBill.addToTariff(200 * 0.42);
		}
	}

}
