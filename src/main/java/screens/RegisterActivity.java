package screens;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RegisterActivity {

	public AppiumDriver<MobileElement> ad = null;

	public RegisterActivity(AppiumDriver<MobileElement> ad) {
		this.ad = ad;
		PageFactory.initElements(new AppiumFieldDecorator(ad), this);
	}

	@FindBy(how = How.XPATH, 
			using = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[1]")
	AndroidElement logo;

	@FindBy(how = How.ID, using = "et_name")
	AndroidElement Username;

	@FindBy(how = How.ID, using = "et_number")
	AndroidElement mobilenumber;

	@FindBy(how = How.ID, using = "btn_submit")
	AndroidElement SubmitButton;

	public void CheckJobPage() {
		String logoJob = logo.getText();
		Assert.assertEquals(logoJob, "Job Search");
	}

	public void enterusername(String name) {
		Username.sendKeys(name);
	}

	public void entermobilenumber(String number) {
		mobilenumber.sendKeys(number);
	}

	public void clickSubmit() {
		SubmitButton.click();
	}

}
