package utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;

/////////
/////////////////////////////////////
//Setup Appium Server and installing apk and closing server
////////////////////
public class commonutil {
	static AppiumDriverLocalService service;
	
	public static AppiumDriver<MobileElement> ad =null;

	public static void setUp() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
         capabilities.setCapability("deviceName", "Android");
         capabilities.setCapability("platformName", "Android");
         capabilities.setCapability("app", "resources/in.workindia.apk");
         capabilities.setCapability("appPackage", "in.workindia.nileshdungarwal.workindiaandroid");
         capabilities.setCapability("appActivity" ,".RegisterActivity");
         capabilities.setCapability("platformVersion", "8.1.0");

         try {

             ad = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);
             ad.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         }
         catch(Exception e) {
             e.printStackTrace();
         }
    }
	
	
	public static void StartAppium() {
		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		

	}
	
	public static void close() {
	ad.quit();
	}

	public static void stopAppium() {
	service.stop();

	 }
}
