package stepdefinations;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.JobSearchActivity;
import utils.commonutil;

public class JobfeatureStepdef extends commonutil {

	JobSearchActivity job = new JobSearchActivity(ad);

	@Given("User on job search page")
	public void user_on_job_search_page() {
		job.CheckJobPage();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User tap on fab action bar")
	public void user_tap_on_fab_action_bar() {
		job.tapSortbyNewJob();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("User tap on  sortby")
	public void user_tap_on_sortby() {
		job.tapSortbySalary();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("User tap on salary high to low")
	public void user_tap_on_salary_high_to_low() {
		job.highToLow();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("User search for {string}")
	public void user_search_for(String Job) {
		job.enterusername(Job);
		ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
