package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.commonbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class SkillActivity extends commonbase {

	public SkillActivity(AppiumDriver<MobileElement> ad) {
		super(ad);
	}

	@FindBy(how = How.ID, using = "in.workindia.nileshdungarwal.workindiaandroid:id/tv_profile_heading")
	AndroidElement SkillLogo;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	AndroidElement GraphicSkill;

	@FindBy(how = How.XPATH,
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	AndroidElement GraphicSkillSelect;

	@FindBy(how = How.ID, using = "android:id/button1")
	AndroidElement SubmitGraphic;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")
	AndroidElement SalesSkill;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	AndroidElement SalesSkillSelectBike;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")
	AndroidElement SalesSkillSelectLicense;

	@FindBy(how = How.XPATH,
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
	AndroidElement SubmitSale;

	@FindBy(how = How.ID, using = "tv_course")
	AndroidElement EducationDegree;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
	AndroidElement DegreeSelect;

	@FindBy(how = How.ID, using = "in.workindia.nileshdungarwal.workindiaandroid:id/btn_done")
	AndroidElement SubmitSkill;

	public void CheckSkillPage() {
		String logoo = SkillLogo.getText();
		Assert.assertEquals(logoo, " Siddhant Aapke Bare Me Bataye");
	}

	public void tapGraphicSkill() {
		tap(GraphicSkill);
	}

	public void selectGraphicSkill() {
		tap(GraphicSkillSelect);
	}

	public void submitGraphicSKill() {
		tap(SubmitGraphic);

	}

	public void tapSalesSkill() {
		tap(SalesSkill);
	}

	public void selectSalesSkill1() {
		tap(SalesSkillSelectBike);
	}

	public void selectSalesSkill2() {
		tap(SalesSkillSelectLicense);
	}

	public void submitSaleSkill() {
		tap(SubmitSale);
	}

	public void tapDegree() {
		EducationDegree.click();
	}

	public void selectDegree() {
		tap(DegreeSelect);
	}

	public void submitSkill() {
		tap(SubmitSkill);
	}

	public void swipeUp() {
		//verticalSwipeByElement();
	}

}
