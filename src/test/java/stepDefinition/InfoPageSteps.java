package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class InfoPageSteps {

public static WebDriver driver;
	
	
	@Given("^user selects to and from date$")
	public void selectCity() {
		WebElement fromCity = driver.findElement(By.id("hp-widget__sfrom"));
		fromCity.clear();
		fromCity.sendKeys("Pune");
		driver.findElement(By.xpath("//span[.='Pune, India']")).click();
		
		WebElement toCity = driver.findElement(By.id("hp-widget__sTo"));
		toCity.clear();
		toCity.sendKeys("Jammu");
		driver.findElement(By.xpath("//span[.='Jammu, India']")).click();
	}
	
	@When("^user selects date of travel$")
	public void selectTravelDate(){			
		driver.findElement(By.id("dp1543690721120")).click();
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement ele:allDates)
		{
			String date=ele.getText();
			
			if(date.equalsIgnoreCase("30"))
			{
				ele.click();
				break;
			}
			
		}
	}	
	
	@Then("^user decides the no of passengers$")
	public void selectNumbrOfPassengers(){
		driver.findElement(By.id("hp-widget__paxCounter_pot")).click();	
		driver.findElement(By.xpath(".//*[@id='js-adult_counter']/li[2]")).click();
		driver.findElement(By.linkText("Done")).click();
	}
	
	@Then("^user clicks SEARCH button$")
	public void clickSearchBtn(){
		driver.findElement(By.id("searchBtn")).click();		
	}
	
}
