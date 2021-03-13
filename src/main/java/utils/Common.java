package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Common {
	
static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName, String baseUrl) {
		//http://www.demo.guru99.com/V4/
		if(browserName.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "R:\\SeleniumSoftwares\\WebDrivers\\geckodriver.exe");
		//System.setProperty("webdriver.firefox.marionette","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "R:\\SeleniumSoftwares\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
