package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import screens.RegisterActivity;
import utils.commonutil;

public class RegisterActivityStepdef extends commonutil {

	RegisterActivity register = new RegisterActivity(ad);

	@Given("User on register activity")
	public void user_on_register_activity() {
		register.CheckJobPage();
	}

	@When("User Enter {string}")
	public void user_enter(String string) {
		register.enterusername(string);
	}

	@When("User Enter {string} Number")
	public void user_enter_number(String string) {
		register.entermobilenumber(string);
	}

	@Then("User Click Submit")
	public void user_click_submit() {
		register.clickSubmit();
	}

}
