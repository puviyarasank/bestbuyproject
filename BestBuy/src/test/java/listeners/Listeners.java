package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import base.Baseclass;
import utilities.Extendreports;
import utilities.Extendreports;
import utilities.Utility;

public class Listeners extends Baseclass implements ITestListener {
	WebDriver driver = null;
	ExtentReports report = Extendreports.extendreport();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail(result.getThrowable());
		String testname = result.getName();
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Utility.screenshot(testname, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
