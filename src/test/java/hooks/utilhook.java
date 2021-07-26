package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.commonutil;

/////////
/////////////////////////////////////
// Hooks File for logger implementation  and extent reports screenshots
////////////////////
public class utilhook extends commonutil{

	public static Logger logger = Logger.getLogger(utilhook.class.getName());
	public static String LOG_FILE = ".\\resources\\log4j.properties";
	
	static FileInputStream logfile = null;
	
	public static Properties prop = new Properties();
	
	static {
		try {
			logfile = new FileInputStream(LOG_FILE);
			PropertyConfigurator.configure(logfile);
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(logfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@After
	public static void closeBrowser(Scenario result) {
		//checking test case status and logging results
		if (result.isFailed()== true) 
		{
			logger.info(result.getName() + " Test Case Failed");
			TakesScreenshot ts = (TakesScreenshot) ad;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            result.attach(src, "image/png", "screenshot");
		} 
		else{
			
			logger.info(result.getName() + " Test Case Passed");
		}
	}

}
