/**
 * Name: RuleEngine.java
 * Created by Varun Ramani
 * Date: 28-Sep-2019
 */
package billing.rule;

import java.util.ArrayList;
import java.util.List;

import billing.rule.pojo.UserBill;

/**
 * @author Varun Ramani
 *
 */
public class RuleEngine {
	private List<Rule> rules;

	public RuleEngine() {
		this.rules = new ArrayList<>();
	}

	public void calculateTariff(UserBill userBill) {
		for (Rule rule : rules) {
			rule.rule(userBill);
		}
	}

	public void addRule(Rule rule) {
		rules.add(rule);
	}

	public void clearRules() {
		rules.clear();
	}

}
