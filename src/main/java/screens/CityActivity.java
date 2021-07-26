package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.commonbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class CityActivity extends commonbase {

	public CityActivity(AppiumDriver<MobileElement> ad) {
		super(ad);

	}

	public AppiumDriver<MobileElement> wd = null;

	@FindBy(how = How.ID, using = "tv_city")
	AndroidElement CityLogo;

	@FindBy(how = How.ID, using = "rb_delhi")
	AndroidElement CityDelhi;

	@FindBy(how = How.ID, using = "act_auto_complete")
	AndroidElement NearestLocation;

	@FindBy(how = How.ID, using = "btn_done")
	AndroidElement Submit;

	public void CheckCityPage() {
		String logoo = CityLogo.getText();
		Assert.assertEquals(logoo, "Hi Siddhant !! Choose Your City");
	}

	public void tapCityDelhi() {
		CityDelhi.click();
	}

	public void nearestLocation(String loc) {
		NearestLocation.sendKeys(loc);
	}

	public void submitLocation() {
		tap(Submit);
	}
}
