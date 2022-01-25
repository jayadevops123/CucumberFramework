/*
 * #Author Jaya Sarode.
 * 
 * */
package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunc {

	@Given("User is on login page")
	public void user_is_on_login_page() {
	    System.out.println("User is on home page");
	}

	@When("Enter username and password")
	public void enter_username_and_password() {
	   System.out.println("Enters username and password");
	}

	@When("Click on login button")
	public void click_on_login_button() {
	   System.out.println("Click on login button");
	}

	@Then("you are on home page")
	public void you_are_on_home_page() {
	   System.out.println("Hello World");
	   
	}
}
