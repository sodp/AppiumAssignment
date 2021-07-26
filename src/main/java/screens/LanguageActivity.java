package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import base.commonbase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;

public class LanguageActivity extends commonbase {
	public LanguageActivity(AppiumDriver<MobileElement> ad) {
		super(ad);
	}

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
	AndroidElement LanguageLogo;

	@FindBy(how = How.ID, using = "btn_english")
	AndroidElement English;

	public void tapCityDelhi() {
		tap(English);
	}

	public void CheckLanguagePage() {
		String logoo = LanguageLogo.getText();
		Assert.assertEquals(logoo, "आपकी भाषा चुनिए");
	}

}
