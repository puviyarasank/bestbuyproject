package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobjects.Select_by_department;

public class Select_by_departmenttest extends Baseclass{
	@Test
	public void dept() throws InterruptedException {
		 Select_by_department dept = new  Select_by_department(driver);
		 dept.singlemethod();
		
		

	}

	
}
