package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.SkillActivity;
import utils.commonutil;

public class SkillActivityStepDef extends commonutil {

	SkillActivity skill = new SkillActivity(ad);

	@Given("User on required skills activity")
	public void user_on_required_skills_activity() {
		// skill.CheckSkillPage();
	}

	@When("User tap Graphic Designer skill detail")
	public void user_tap_graphic_designer_skill_detail() {
		skill.tapGraphicSkill();

	}

	@When("User selects skill illustrator")
	public void user_selects_skill_illustrator() {
		skill.selectGraphicSkill();
	}

	@When("User click on submit graphic designer skill")
	public void user_click_on_submit_graphic_designer_skill() {
		skill.submitGraphicSKill();
	}

	@When("User swipe up the page")
	public void user_swipe_up_the_page() {
		skill.swipeUp();
	}

	@When("User tap on sales marketing skill detail")
	public void user_tap_on_sales_marketing_skill_detail() {
		skill.tapSalesSkill();
	}

	@When("User selects on skill bike and license")
	public void user_selects_on_skill_bike_and_license() {
		skill.selectSalesSkill1();
		skill.selectSalesSkill2();
	}

	@When("User click on submit sales marketing")
	public void user_click_on_submit_sales_marketing() {
		skill.submitSaleSkill();
	}

	@When("User tap education degree")
	public void user_tap_education_degree() {
		skill.tapDegree();
	}

	@When("User selects degree")
	public void user_selects_degree() {
		skill.selectDegree();
	}

	@Then("User submit its skill profile")
	public void user_submit_its_skill_profile() {
		skill.submitSkill();
	}
}
