package base;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
/////////
/////////////////////////////////////
// common tap & swipe functionality for the screens
////////////////////
public class commonbase {

	public static AppiumDriver<MobileElement> ad = null;

	public commonbase(AppiumDriver<MobileElement> ad) {
		this.ad = ad;
		PageFactory.initElements(new AppiumFieldDecorator(ad), this);
	}

	// tap functionality
	public void tap(MobileElement Element) {
		TouchAction touch = new TouchAction(ad);
		touch.tap(tapOptions().withElement(element(Element))).release().perform();
	}
	
public static void verticalSwipeByElement(MobileElement englishMedium, MobileElement fresherExp) {
		
		int startX = englishMedium.getLocation().getX() + (englishMedium.getSize().getWidth() / 2);
		int startY = englishMedium.getLocation().getY() + (englishMedium.getSize().getHeight() / 2);
		int endX = fresherExp.getLocation().getX() + (fresherExp.getSize().getWidth() / 2);
		int endY = fresherExp.getLocation().getY() + (fresherExp.getSize().getHeight() / 2);
		
		new TouchAction(ad).press(point(startX, startY)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(endX, endY)).release().perform();
	}

	// vertical swipe functionality
	public void vericalSwipeByPercentage(double startPercentage, double endPercentage, double anchorPercentage) {
		Dimension size = ad.manage().window().getSize();
		int anchor = (int) (size.width * anchorPercentage);
		int startPoint = (int) (size.height * startPercentage);
		int endPoint = (int) (size.width * endPercentage);

		new TouchAction(ad).press(point(anchor, startPoint)).waitAction(waitOptions(ofMillis(1000)))
				.moveTo(point(anchor, endPoint)).release().perform();
	}
}
