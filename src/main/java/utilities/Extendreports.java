package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreports {
	public static ExtentReports extendreport() {

		String reportpath = System.getProperty("user.dir") + "\\reports\\extendreport.html";
		ExtentSparkReporter extend = new ExtentSparkReporter(reportpath);
		extend.config().setReportName("bestbuy automation report");
		extend.config().setDocumentTitle("BESTBUY AUTOMATION TESTING");
		ExtentReports report = new ExtentReports();
		report.attachReporter(extend);
		return report;

	}

}
