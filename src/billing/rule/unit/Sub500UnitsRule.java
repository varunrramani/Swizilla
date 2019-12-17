/**
 * Name: Sub500UnitsRule.java
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
public class Sub500UnitsRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units > 300 && units < 500) {
			userBill.addToTariff(((units - 300) * 6.75));
		} else if (units >= 500) {
			userBill.addToTariff(200 * 6.75);
		}
	}
}
