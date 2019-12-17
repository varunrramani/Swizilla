/**
 * 
 */
package corrected;

import java.time.LocalDate;

import account.Account;
import account.CurrentAccount;
import account.SavingsAccount;
import billing.rule.RuleEngine;
import billing.rule.duty.ElectricityDutyRule;
import billing.rule.fixed.FixedChargeRule;
import billing.rule.pojo.UserBill;
import billing.rule.racharge.GenericRaChargeRule;
import billing.rule.racharge.Sub100RaChargeRule;
import billing.rule.racharge.Sub300RaChargeRule;
import billing.rule.racharge.Sub500RaChargeRule;
import billing.rule.tax.SaleTaxRule;
import billing.rule.unit.GenericRule;
import billing.rule.unit.Sub100UnitsRule;
import billing.rule.unit.Sub300UnitsRule;
import billing.rule.unit.Sub500UnitsRule;
import billing.rule.wheeling.WheelingChargeRule;

/**
 * @author Varun Ramani
 *
 */
public class Swizilla {
	public static void main(String[] args) throws Exception {

		// value replace switch (fixed)
//		System.out.println(DOW.DayOfWeek(1));
//
//		// value replace switch (dynamic over time)
//		System.out.println(KeyCode.GetKeyMap(38));
//
//		// value action switch
//		System.out.println(ChangeCase.convert(ChangeCase.Case.Pascal, new String[] { "Numeric", "Value" }));
		
		// value action if-else ladder
//		System.out.println(Math.round(Billing.calculateTariff(374) * 100.00) / 100.00);
//		RuleEngine ruleEngine = new RuleEngine();
//		ruleEngine.addRule(new Sub100UnitsRule());
//		ruleEngine.addRule(new Sub300UnitsRule());
//		ruleEngine.addRule(new Sub500UnitsRule());
//		ruleEngine.addRule(new GenericRule());
//		ruleEngine.addRule(new FixedChargeRule());
//		ruleEngine.addRule(new Sub100RaChargeRule());
//		ruleEngine.addRule(new Sub300RaChargeRule());
//		ruleEngine.addRule(new Sub500RaChargeRule());
//		ruleEngine.addRule(new GenericRaChargeRule());
//		ruleEngine.addRule(new WheelingChargeRule());
//		ruleEngine.addRule(new ElectricityDutyRule());
//		ruleEngine.addRule(new SaleTaxRule());
//		UserBill userBill = new UserBill(305);
//		ruleEngine.calculateTariff(userBill);
//		System.out.println(Math.round(userBill.getTariff() * 100.00) / 100.00);
//	
//		// varied condition if-else ladder
//        Customer anders = new Customer("James Gosling", LocalDate.of(2017,  07,  07), LocalDate.of(2017, 10, 5), LocalDate.of(1955, 5, 19));
//        System.out.println(anders);
//        System.out.println (CustomerDiscount.calculateDiscount(anders)*100+"%");

//        // Multiple switch-case statements
//        Account dmr = new Account(Account.Type.SavingsAccount, 1, "Dennis M. Ritchie", 1000);
//        System.out.println(dmr);
//        dmr.withdraw(500);
//        System.out.println(dmr);
//        dmr.deposit(10000);
//        System.out.println(dmr);
		Account savingAccount = new SavingsAccount(0, "Test", 2000);
		System.out.println(savingAccount.deposit(500));
//		System.out.println(savingAccount.withdraw(2300));
		Account currentAccount = new CurrentAccount(1, "Test Current", 5000);
		System.out.println(currentAccount.deposit(3000));
		System.out.println(currentAccount.withdraw(10000));

//        // Dynamically creating object of a type
//        Circle circle = (Circle)ShapeCreator.newShape("circle");
//        circle.centerPoint = new Point(10, 10);
//        circle.radius = 10;
//        System.out.println(circle.calculateArea());

//        Rectangle rectangle = (Rectangle)ShapeCreator.newShape("rectangle");
//        rectangle.startPoint = new Point(10, 10);
//        rectangle.endPoint = new Point(20, 20);
//        System.out.println(rectangle.calculateArea());

	}
}
