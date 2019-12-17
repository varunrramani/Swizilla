/**
 * Name: ElectricityDutyRule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.duty;

import billing.rule.Rule;
import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class ElectricityDutyRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		userBill.addToTariff(userBill.getTariff() * 0.16);
	}

}
