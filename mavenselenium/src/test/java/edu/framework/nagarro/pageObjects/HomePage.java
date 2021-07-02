package edu.framework.nagarro.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage{
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	@FindBy(how = How.ID, using = "sign-in")
	private WebElement signIn;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Home")
	private WebElement home;
	
	public void clickSignIn() {
		click(signIn);
	}

}
