package edu.nagarro.iframes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class FramesDemo {
	
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
	}
	
	@Test
	public void testIFrames() {
		driver.get("https://demoqa.com/frames");
		
		//WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));
		
		//Using Id or Name
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.printf("No of Frames %d\n", iframes.size());
		
		
		driver.switchTo().frame(iframes.get(1)); //Switching to the frame
		WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));
		System.out.println(sampleHeading.getText());
		driver.switchTo().defaultContent(); // Switch back to main window
		
		List<WebElement> iframesAfterSwitch = driver.findElements(By.tagName("iframe"));
		System.out.printf("No of Frames %d\n", iframesAfterSwitch.size());
		

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//Using Tags
		
		//System.out.println(sampleHeading.getText());
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
