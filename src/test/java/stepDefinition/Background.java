package stepDefinition;

import io.cucumber.java.en.Given;

public class Background {

	@Given("^user loads the application$")
	public void loadApplication() {
		System.out.println("******************START*****************");
		System.out.println("Application is loaded successfully");
	}
	
	
	
}
