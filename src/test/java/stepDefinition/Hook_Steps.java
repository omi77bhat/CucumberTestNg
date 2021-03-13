package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook_Steps {
	
	@Before("@Smoke")
    public void beforeScenario(){
        System.out.println("This will run before the Scenario");
        System.out.println("Specific to run before Smoke TEst");
    } 
 
 @After
    public void afterScenario(){
        System.out.println("This will run after the Scenario");
    }

}
