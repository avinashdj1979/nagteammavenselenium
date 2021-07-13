package edu.framework.nagarro.reports;

import com.aventstack.extentreports.ExtentTest;

public class ExtentTestManager {
	
	public static ExtentTest extentTest;
	
	public static ExtentTest startTest(String testName) {
		extentTest = ExtentManager.extentReports.createTest(testName);
		return extentTest;
	}
	
//	public static ExtentTest getTest() {
//		return extentTest;
//	}

}
