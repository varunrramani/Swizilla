/**
 * Name: FixedChargeRule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.fixed;

import billing.rule.Rule;
import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class FixedChargeRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		userBill.addToTariff(100);
	}

}
