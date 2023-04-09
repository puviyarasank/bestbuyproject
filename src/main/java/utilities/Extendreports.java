package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extendreports {
	public static ExtentReports extendreport() {

		File reportpath = new File("C:\\Users\\PUVI\\eclipse-workspace\\BestBuy\\reports\\extendreports.html");
		ExtentSparkReporter extend = new ExtentSparkReporter(reportpath);
		extend.config().setReportName("bestbuy automation report");
		extend.config().setDocumentTitle("BESTBUY AUTOMATION TESTING");
		ExtentReports report = new ExtentReports();
		report.attachReporter(extend);
		return report;

	}

}
