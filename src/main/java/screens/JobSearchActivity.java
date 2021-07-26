package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.commonbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class JobSearchActivity extends commonbase {

	public JobSearchActivity(AppiumDriver<MobileElement> ad) {
		super(ad);
	}

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	AndroidElement WorkIndialabel;

	@FindBy(how = How.XPATH,
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageButton")
	AndroidElement sortbyNewJob;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[1]")
	AndroidElement sortBySalary;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
	AndroidElement highToLow;

	@FindBy(how = How.ID, using = "in.workindia.nileshdungarwal.workindiaandroid:id/et_inputSearch")
	AndroidElement SearchKeyword;

	public void CheckJobPage() {
		String str = WorkIndialabel.getText();
		Assert.assertEquals(str, "WorkIndia");
	}

	public void tapSortbyNewJob() {
		sortbyNewJob.click();

	}

	public void tapSortbySalary() {
		sortBySalary.click();
	}

	public void highToLow() {
		tap(highToLow);
	}

	public void enterusername(String name) {
		SearchKeyword.sendKeys(name);
	}

}
