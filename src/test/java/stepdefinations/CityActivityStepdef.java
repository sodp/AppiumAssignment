package stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.CityActivity;
import utils.commonutil;

public class CityActivityStepdef extends commonutil {
	CityActivity city = new CityActivity(ad);

	@When("User Select city as Delhi")
	public void user_select_city_as_delhi() {
		city.tapCityDelhi();

	}

	@When("User Enter {string} Location")
	public void user_enter_location(String string) {
		city.nearestLocation(string);

	}

	@Then("User Click on Submit button")
	public void user_click_on_submit_button() {
		city.submitLocation();
	}

}
