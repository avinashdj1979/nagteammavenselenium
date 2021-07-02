package edu.framework.nagarro.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(how=How.XPATH, using="//input[@id='session_email']")
	private WebElement email;
	
	@FindBy(xpath= "//input[@id='session_password']")
	private WebElement password;
	
//	@FindBy(how=How.NAME, using="commit")
//	private WebElement signIn;
	
	@FindBy(name="commit")
	private WebElement signIn;
	
	public void typeEmail(final String value) {
		type(email, value);
	}

	public void typePassword(final String value) {
		type(password, value);
	}
	
	public void clickSignIn() {
		click(signIn);
	}
}
