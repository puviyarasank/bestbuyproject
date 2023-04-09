package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Signup;

public class Signuptest extends Baseclass {
	@Test
	public void newacnyt() {
		Signup sign = new Signup(driver);
		sign.account();
	sign.createacnt();


	}

}
