package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import screens.LanguageActivity;
import utils.commonutil;

public class LanguagePageStepdef extends commonutil {
	LanguageActivity language = new LanguageActivity(ad);

	@Given("User on select language activity")
	public void user_on_select_language_activity() {
		language.CheckLanguagePage();
	}

	@Then("User select English")
	public void user_select_english() {
		language.tapCityDelhi();
	}

}
