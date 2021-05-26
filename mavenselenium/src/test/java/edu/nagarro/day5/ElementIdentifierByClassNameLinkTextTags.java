package edu.nagarro.day5;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementIdentifierByClassNameLinkTextTags {
WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		try {
			WebDriverManager.chromedriver().setup();
		} catch(Exception e) {
			System.setProperty("webdriver.chrome.driver", userDir + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void addressBook() {
		driver.get("http://a.testaddressbook.com");
		// driver.findElement(By.id("sign-in")).click();
		WebElement signIn = driver.findElement(By.id("sign-in"));
		// signIn.click();
		click(signIn);
		WebElement email = driver.findElement(By.name("session[email]"));
		email.sendKeys("avinashact1979@gmail.com");
		WebElement password = driver.findElement(By.id("session_password"));
		password.sendKeys("Sadu2006$");
		WebElement submit = driver.findElement(By.name("commit"));
		submit.click();

		WebElement heading = driver.findElement(By.tagName("h1"));
		String headingText = heading.getText();
		Assert.assertEquals(headingText, "Welcome to Address Book", "Header does not match");

		WebElement addresses = driver.findElement(By.linkText("Addresses"));
		click(addresses);

		WebElement newAddress = driver.findElement(By.partialLinkText("New "));
		newAddress.click();

		WebElement firstName = driver.findElement(By.className("form-control"));
		firstName.sendKeys("Abhishek");

		
		List<WebElement> inputs = driver.findElements(By.className("form-control"));
		System.out.println(inputs.size());
		
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void click(WebElement element) {
		//check for webelement to be clickable
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	
	@AfterClass
	public void tearDown() {
//		driver.close();
//		driver.quit();
	}
}
