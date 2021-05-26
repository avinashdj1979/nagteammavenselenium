package edu.nagarro.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic2 {
	
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
	}
	
	@Test
	public void addressBook() {
		driver.get("http://a.testaddressbook.com");
		driver.findElement(By.id("sign-i")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@AfterClass
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
