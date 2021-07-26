package stepdefinations;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.RecommendedJobActivity;
import utils.commonutil;

public class RecommendedJobStepdef extends commonutil {

	RecommendedJobActivity recommendedJob = new RecommendedJobActivity(ad);

	@Given("User on the job search page")
	public void user_on_the_job_search_page() {
		recommendedJob.CheckJobPage();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User tap on profile navigation bar")
	public void user_tap_on_profile_navigation_bar() {
		recommendedJob.TapProfilePage();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User tap on recommended jobs")
	public void user_tap_on_recommended_jobs() {
		recommendedJob.TapRecommendedJobs();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("User find recommended jobs")
	public void user_find_recommended_jobs() {
		recommendedJob.CheckRecommendedJobPage();
		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
