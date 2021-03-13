package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginSteps {

public static WebDriver driver;
	
@Given("open the chrome and launch the application")
public void open_the_firefox_and_launch_the_application() throws Throwable {
	if(driver == null){
		System.setProperty("webdriver.chrome.driver","R:\\DOCUMENTS\\chromedriver_v88\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	driver.get("https://www.makemytrip.com/");
}

@When("user clicks Login button")
public void user_clicks_Login_button() throws Throwable {
	driver.findElement(By.id("ch_login_icon")).click();
}

@When("user enters {string} and {string}")
public void user_enters_and(String userName, String password) throws Throwable {
	driver.findElement(By.id("ch_login_email")).sendKeys(userName);					
     driver.findElement(By.id("ch_login_password")).sendKeys(password);	
}

@Then("user clicks LOGIN button")
public void user_clicks_LOGIN_button() throws Throwable {
	driver.findElement(By.id("ch_login_btn")).click();	
}

@Then("to validate if login is successful")
public void to_validate_if_login_is_successful() throws Throwable {
	WebElement user =  driver.findElement(By.xpath("//span[.='Hey Omesh']"));
	Assert.assertTrue("LOGIN FAILED ", (user.isDisplayed()));

}
	

}
