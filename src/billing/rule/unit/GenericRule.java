/**
 * Name: GenericRule.java
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
public class GenericRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units > 500) {
			userBill.addToTariff(((units - 500) * 8.0));
		}
	}
}