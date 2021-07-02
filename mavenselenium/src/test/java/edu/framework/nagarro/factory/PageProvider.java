package edu.framework.nagarro.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import edu.framework.nagarro.pageObjects.HomePage;
import edu.framework.nagarro.pageObjects.LoginPage;

public class PageProvider {
	
	WebDriver driver;
	
	public PageProvider(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return PageFactory.initElements(driver, HomePage.class);
	}
	
	public LoginPage getLoginPage() {
		return PageFactory.initElements(driver, LoginPage.class);
	}

}
