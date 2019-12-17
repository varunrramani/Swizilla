/**
 * Name: SaleTaxRule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule.tax;

import billing.rule.Rule;
import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class SaleTaxRule implements Rule {

	@Override
	public void rule(UserBill userBill) {
		userBill.addToTariff(userBill.getUnits() * 0.1604);
	}

}
