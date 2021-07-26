package runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.commonutil;

@CucumberOptions(
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 features = "src/test/java/features", 

		 glue = { "hooks","stepdefinations" }, // path of step definition

		monochrome = true,

		 dryRun = false, // check all the steps have the definitions and will not execute

		// strict = false, // check if any step is not defined in step definition file

		tags = ( "@Register or @Job" ))
		 
public class testrunner extends AbstractTestNGCucumberTests {
	
	@BeforeSuite
	public void run() {
		commonutil.StartAppium();
		commonutil.setUp();
	}
	@AfterSuite
	public void stop()
	{
		commonutil.close();
		commonutil.stopAppium();
	}
}
