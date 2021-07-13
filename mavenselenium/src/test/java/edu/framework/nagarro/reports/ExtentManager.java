package edu.framework.nagarro.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	public static ExtentReports extentReports;
	
	public static ExtentReports initializeReports() {
		
		String filePath = System.getProperty("user.dir") + "\\reports\\report.html";
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(filePath);
		sparkReporter.config().setReportName("My Test report");
		
		if(extentReports == null) {
			extentReports = new ExtentReports();
			extentReports.attachReporter(sparkReporter);
		}

		return extentReports;
		
	}
	
	public static void flushReports() {
		extentReports.flush();
	}

}
