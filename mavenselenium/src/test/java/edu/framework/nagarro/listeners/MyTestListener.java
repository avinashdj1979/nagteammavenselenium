package edu.framework.nagarro.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import edu.framework.nagarro.constants.UIConstants;
import edu.framework.nagarro.reports.ExtentManager;
import edu.framework.nagarro.reports.ExtentTestManager;

public class MyTestListener implements ITestListener {
	
//	ExtentReports extentReports;
//	ExtentSparkReporter extentSparkReporter;
//	ExtentTest extentTest;

	public void onStart(ITestContext context) {
		System.out.println("Test Started - on Start");
//		String reportPath = UIConstants.BASE_PATH + "\\\\reports\\\\report.html";
//		extentSparkReporter = new ExtentSparkReporter(reportPath);
//		extentSparkReporter.config().setReportName("My Spark Report");
//		
		//extentReports = new ExtentReports();
//		extentReports.attachReporter(extentSparkReporter);
		
		 ExtentManager.initializeReports();
		//context.setAttribute("extentReports", extentReports);

	}
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		String testName = result.getMethod().getMethodName();
//		extentTest = extentReports.createTest(testName);
		ExtentTestManager.extentTest = ExtentTestManager.startTest(testName);
		ExtentTestManager.extentTest.log(Status.INFO, testName + " Started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successful");
		String testName = result.getMethod().getMethodName();
		ExtentTestManager.extentTest.log(Status.PASS, testName + " Passed");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
		String testName = result.getMethod().getMethodName();
		ExtentTestManager.extentTest.log(Status.SKIP, testName + " Passed");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Skipped");
		String testName = result.getMethod().getMethodName();
		ExtentTestManager.extentTest.log(Status.FAIL, testName + " Passed");
	}
	
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished - on Finish");
		ExtentManager.flushReports();
	}

}
