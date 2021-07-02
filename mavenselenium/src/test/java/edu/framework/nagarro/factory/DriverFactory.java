package edu.framework.nagarro.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import edu.framework.nagarro.constants.UIConstants;
import edu.framework.nagarro.utils.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;

	public static  WebDriver getDriver() {
		
		PropertyReader props = new PropertyReader();
		String browser = props.getProperty(UIConstants.BROWSER);
		
		switch (browser) {
		case "chrome":
			String userDir = System.getProperty(UIConstants.BASE_PATH);
			System.out.println(userDir);
			try {
				WebDriverManager.chromedriver().setup();
			} catch(Exception e) {
				System.setProperty("webdriver.chrome.driver", userDir + UIConstants.RESOURCE_PATH +"/drivers/chromedriver.exe");
			}
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	}

}
