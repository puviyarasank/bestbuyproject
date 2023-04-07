package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Select_by_brands;

public class Select_by_brandstest extends Baseclass {

	@Test
	public void bybrands() throws InterruptedException {
		
		
		Select_by_brands br = new Select_by_brands(driver);
		br.all_in_one();

	}

}
