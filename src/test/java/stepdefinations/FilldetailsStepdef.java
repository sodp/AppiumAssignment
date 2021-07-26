package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.FillDetailsActivity;
import utils.commonutil;

public class FilldetailsStepdef extends commonutil {

	FillDetailsActivity details = new FillDetailsActivity(ad);

	@Given("User on fill details activity")
	public void user_on_fill_details_activity() {
		details.CheckDetailsPage();
	}

	@When("User tap on Male")
	public void user_tap_on_male() {
		details.selectGender();
	}

	@When("User tap on Graduate")
	public void user_tap_on_graduate() {
		details.qualification();
	}

	@When("User tap on English")
	public void user_tap_on_english() {
		details.schoolMedium();
	}

	@When("User swipes up1")
	public void user_swipes_up1() {
		details.swipeUp1();

	}

	@When("User tap Fluent English")
	public void user_tap_fluent_english() {
		details.englishLevel();
	}
	
	@When("User tap Fresher")
	public void user_tap_fresher() {
		details.fresherSelect();
	}
	
	@When("User swipes up2")
	public void user_swipes_up2() {
		details.swipeUp2();
	}

	
	@When("User tap age and selects age")
	public void user_tap_age_and_selects_age() {
		details.ageOption();

	}
	
	@When("User swipes up3")
	public void user_swipes_up3() {
     details.swipeUp3();
	}

	@When("User swipes up4")
	public void user_swipes_up4() {
     details.swipeUp4();
	}
	
	@When("User select its field as business development")
	public void user_select_its_field_as_business_development() {
		details.fieldSelect1();
	}

	@When("User select its field as sales marketing")
	public void user_select_its_field_as_sales_marketing() {
		details.fieldSelect2();
	}
	@When("User select its field as graphic designer")
	public void user_select_its_field_as_graphic_designer() {
		details.fieldSelect3();
	}

	@Then("User submit its profile")
	public void user_submit_its_profile() {
		details.submit();
	}

}
