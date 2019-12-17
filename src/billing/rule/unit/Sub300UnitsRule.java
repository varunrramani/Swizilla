/**
 * Name: Sub300UnitsRule.java
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
public class Sub300UnitsRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		int units = userBill.getUnits();
		if (units < 300) {
			userBill.addToTariff(((units - 100) * 4.05));
		} else if (units >= 300) {
			userBill.addToTariff(200 * 4.05);
		}
	}

}
