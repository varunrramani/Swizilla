/**
 * Name: Sub300RaChargeRule.java
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
public class Sub300RaChargeRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units < 300) {
			userBill.addToTariff(((units - 100) * 0.19));
		} else if (units >= 300) {
			userBill.addToTariff(200 * 0.19);
		}
	}

}
