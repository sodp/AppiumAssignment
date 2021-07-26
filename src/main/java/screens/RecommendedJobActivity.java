package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.commonbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class RecommendedJobActivity extends commonbase {

	public RecommendedJobActivity(AppiumDriver<MobileElement> ad) {
		super(ad);

	}

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	AndroidElement WorkIndialabel;

	@FindBy(how = How.ID, 
			using = "in.workindia.nileshdungarwal.workindiaandroid:id/navigation_ham_menu")
	AndroidElement Profile;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	AndroidElement RecommendedJobs;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	AndroidElement PageVerification;

	public void CheckJobPage() {
		String check = WorkIndialabel.getText();
		Assert.assertEquals(check, "WorkIndia");
	}

	public void TapProfilePage() {
		Profile.click();
	}

	public void TapRecommendedJobs() {
		tap(RecommendedJobs);
	}

	public void CheckRecommendedJobPage() {
		String check = PageVerification.getText();
		Assert.assertEquals(check, "Recommended Jobs");
	}

}
