/**
 * Name: WheelingChargeRule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.wheeling;

import billing.rule.Rule;
import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class WheelingChargeRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		userBill.addToTariff(userBill.getUnits() * 0.77);
	}

}
