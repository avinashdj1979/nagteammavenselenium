package edu.nagarro.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic1 {

	public static void main(String[] args) {
		String userDir = System.getProperty("user.dir");
		System.out.println(userDir);
		try {
			WebDriverManager.chromedriver().setup();
		} catch(Exception e) {
			System.setProperty("webdriver.chrome.driver", userDir + "\\src\\test\\resources\\drivers\\chromedriver.exe");
		}
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.close();
		driver.quit();
	}

}
