package testcases;

import base.Baseclass;
import pageobjects.Login;
import pageobjects.Payments;

public class Paymentstest extends Baseclass{
	
	public static void payment() {
		Payments pay = new Payments(driver);
		pay.payment();
	}

}
