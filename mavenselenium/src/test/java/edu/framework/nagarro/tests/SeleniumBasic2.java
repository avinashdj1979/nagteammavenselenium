package edu.framework.nagarro.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import edu.framework.nagarro.constants.UIConstants;
import edu.framework.nagarro.factory.DriverFactory;
import edu.framework.nagarro.factory.PageProvider;
import edu.framework.nagarro.listeners.MyTestListener;
import edu.framework.nagarro.pageObjects.HomePage;
import edu.framework.nagarro.pageObjects.LoginPage;
import edu.framework.nagarro.reports.ExtentTestManager;
import edu.framework.nagarro.utils.PropertyReader;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Listeners(MyTestListener.class)
public class SeleniumBasic2 {
	
	
	//Logger logger = LogManager.getLogger(SeleniumBasic2.class);
	
	WebDriver driver;
	PageProvider pages;
	String baseUrl;
	PropertyReader props;
	
	//Pages
	HomePage homePage;
	LoginPage loginPage;
	
	String email;
	String password;
	
	ExtentReports extent;
	
	@BeforeMethod
	public void setUp(ITestContext context) {
		driver = DriverFactory.getDriver();
	    props = new PropertyReader();
		baseUrl = props.getProperty(UIConstants.BASE_URL);
		pages = new PageProvider(driver);
		homePage = pages.getHomePage();
		loginPage = pages.getLoginPage();
		extent = (ExtentReports) context.getAttribute("extentReports");
	}
	
	@Test
	public void addressBook() {
		driver.get(baseUrl);
		ExtentTestManager.extentTest.log(Status.PASS, "Base Page Loaded for address Book");
		log.error("Base Page Loaded for address Book");
		homePage.clickSignIn();
		ExtentTestManager.extentTest.pass("Sign in button is clicked for address Book");
		email = props.getProperty(UIConstants.EMAIL);
		loginPage.typeEmail(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		ExtentTestManager.extentTest.log(Status.PASS, "Base Page Loaded for Google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		throw new SkipException("Test Skipped");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}

//	public static void main(String[] args) {
//		SeleniumBasic2 obj = new SeleniumBasic2();
//		//obj.setUp();
//		obj.addressBook();
//		obj.openGoogle();
//		//obj.tearDown();
//	}
}
