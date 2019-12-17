/**
 * Name: Rule.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule;

import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public interface Rule {
	void rule(UserBill userBill);
	
}
