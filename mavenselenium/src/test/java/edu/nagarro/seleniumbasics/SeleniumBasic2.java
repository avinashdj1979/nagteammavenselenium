package edu.nagarro.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.framework.nagarro.constants.UIConstants;
import edu.framework.nagarro.factory.DriverFactory;
import edu.framework.nagarro.factory.PageProvider;
import edu.framework.nagarro.pageObjects.HomePage;
import edu.framework.nagarro.pageObjects.LoginPage;
import edu.framework.nagarro.utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic2 {
	
	WebDriver driver;
	PageProvider pages;
	String baseUrl;
	PropertyReader props;
	
	//Pages
	HomePage homePage;
	LoginPage loginPage;
	
	String email;
	String password;
	
	@BeforeMethod
	public void setUp() {
		driver = DriverFactory.getDriver();
	    props = new PropertyReader();
		baseUrl = props.getProperty(UIConstants.BASE_URL);
		pages = new PageProvider(driver);
		homePage = pages.getHomePage();
		loginPage = pages.getLoginPage();
	}
	
	@Test
	public void addressBook() {
		driver.get(baseUrl);
		homePage.clickSignIn();
		email = props.getProperty(UIConstants.EMAIL);
		
		loginPage.typeEmail(email);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
