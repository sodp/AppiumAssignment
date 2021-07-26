package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.commonbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class FillDetailsActivity extends commonbase {

	public FillDetailsActivity(AppiumDriver<MobileElement> ad) {
		super(ad);
	}

	@FindBy(how = How.ID, using = "tv_welcome_name")
	AndroidElement DetailLogo;

	@FindBy(how = How.ID, using = "rg_male")
	AndroidElement male;

	@FindBy(how = How.ID, using = "rb_graduate")
	AndroidElement graduate;

	@FindBy(how = How.ID, using = "cb_english")
	AndroidElement english;

	@FindBy(how = How.ID, using = "rg_eng_level_4")
	AndroidElement englishlevel;

	@FindBy(how = How.ID, using = "cb_fresher")
	AndroidElement fresher;

	@FindBy(how = How.ID, using = "tv_age_message")
	AndroidElement ageselect;

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[7]")
	AndroidElement age;

	@FindBy(how = How.XPATH,
			using = "//android.widget.CheckBox[contains(@resource-id,'in.workindia.nileshdungarwal.workindiaandroid:id/btn_sector_filter_button')and @text='Business Development']")
	AndroidElement fieldBusiness;

	@FindBy(how = How.XPATH, 
			using = "//android.widget.CheckBox[contains(@resource-id,'in.workindia.nileshdungarwal.workindiaandroid:id/btn_sector_filter_button')and @text='Field Sales/ Marketing']")
	AndroidElement fieldSales;
	
	
	@FindBy(how = How.XPATH, 
			using = "//android.widget.CheckBox[contains(@resource-id,'in.workindia.nileshdungarwal.workindiaandroid:id/btn_sector_filter_button')and @text='DTP/Graphic Designer']")
	AndroidElement fieldgraphics;
	
	@FindBy(how = How.ID, using = "ll_bottom_action")
	AndroidElement submitProfile;

	public void CheckDetailsPage() {
		String logodetail = DetailLogo.getText();
		Assert.assertEquals(logodetail, "Hi Siddhant!!");
	}

	public void selectGender() {
		tap(male);
	}

	public void qualification() {
		tap(graduate);
	}

	public void schoolMedium() {
		tap(english);
	}

	public void englishLevel() {
		tap(englishlevel);
	}

	public void swipeUp1() {
	verticalSwipeByElement( english,male);
	}
	 
	public void swipeUp2() {
	verticalSwipeByElement( fresher,english);
	}
	
	public void swipeUp3() {
		 vericalSwipeByPercentage(.80,.40,.30);
		
}
	
	public void swipeUp4() {
		 vericalSwipeByPercentage(.80,.40,.30);
		
}
	

	public void fresherSelect() {
		tap(fresher);
	}

	public void ageOption() {
		tap(ageselect);
		tap(age);
	}

	
	public void fieldSelect1() {
		fieldBusiness.click();
	}

	public void fieldSelect2() {
		fieldSales.click();
	}

	public void fieldSelect3() {
		fieldgraphics.click();
	}

	public void submit() {
		tap(submitProfile);

	}

}
