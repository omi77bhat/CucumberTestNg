package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test {

	

	@Given("^user adds valid id$")
	public void user_adds_Validid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User enters his Valid ID");
	}

	@Given("^user adds password$")
	public void user_adds_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("User enters the password");
	}

	@When("^user click submit button$")
	public void user_click_submit_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks on the Submit button");
	}

	@Then("^user should login successfully$")
	public void user_should_login_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User is able to login successfully");
	}
	
	@Given("^user adds invalid id$")
	public void user_adds_Invalidid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User enters his Invalid ID");
	}
	
	@Then("^user login should fail$")
	public void user_login_Failure() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User login Failed. Check credentials");
	}
	
}
