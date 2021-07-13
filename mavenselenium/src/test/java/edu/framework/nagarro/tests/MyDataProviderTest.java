package edu.framework.nagarro.tests;

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
import edu.framework.nagarro.dataprovider.DataUsingDataProvider;
import edu.framework.nagarro.factory.DriverFactory;
import edu.framework.nagarro.factory.PageProvider;
import edu.framework.nagarro.pageObjects.HomePage;
import edu.framework.nagarro.pageObjects.LoginPage;
import edu.framework.nagarro.utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MyDataProviderTest {
	
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

	}
	
	@Test(dataProvider = "myDataProvider", dataProviderClass = DataUsingDataProvider.class)
	public void addressBook(String testCaseName, String firstName, String lastName) {
		System.out.println("test case name" + testCaseName);
		System.out.println("first name" + firstName);
		System.out.println("Last name" + lastName);
	}
	
	@AfterMethod
	public void tearDown() {

	}

}
