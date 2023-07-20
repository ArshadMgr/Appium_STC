package org.securetech.TestUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.securetech.pageObjects.android.LoginPage;
import org.securetech.pageObjects.android.NewSIM;
import org.securetech.pageObjects.android.PostpaidChangeSIM;
import org.securetech.pageObjects.android.PrepaidDisown;
import org.securetech.pageObjects.android.PrepaidSIMChange;
import org.securetech.pageObjects.android.StatusCheck;
import org.securetech.utils.AppiumUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidBaseTest extends AppiumUtils {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	public LoginPage loginPage;
	public NewSIM simSale;
	public StatusCheck checkstatus;
	public PrepaidSIMChange prepaidSIMChange;
	public PrepaidDisown prepaidDisown;
	public PostpaidChangeSIM postpaidChangeSIM;
	
	
	
	
	//Appium Code--> Appium Server ---> Mobile
	
	@BeforeClass(alwaysRun = true)
	public void ConfigureAppium() throws IOException  {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//org//securetech//resources//data.properties");
		
		prop.load(fis);
		
		String ipAddress= prop.getProperty("ipAddress");
		String port =prop.getProperty("port");
		
		service = startAppiumServer(ipAddress, Integer.parseInt(port));
				
				
				//create options object
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName(prop.getProperty("AndroidDeviceName"));
				//options.setCapability("newCommandTimeout", 100000);
				//options.setCapability("webdriver.remote.quietExceptions", false);
				//options.setCapability("elementPollingTimeout", 500);
				options.setAutomationName(prop.getProperty("automationName"));
				options.setApp(System.getProperty("user.dir")+"//src//test//java//org//securetech//resources//JazzBvs4.6.1.apk");
				options.setAppPackage(prop.getProperty("appPackage"));
			    options.setAppActivity(prop.getProperty("loginActivity"));
			
				
				//creating objects for accessing page object methods
				 driver = new AndroidDriver(service.getUrl(), options);
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				 loginPage = new LoginPage(driver);
				 simSale = new NewSIM(driver);
				 checkstatus = new StatusCheck(driver);
				 prepaidSIMChange = new PrepaidSIMChange(driver);
				 prepaidDisown = new PrepaidDisown(driver);
				 postpaidChangeSIM = new PostpaidChangeSIM(driver);
				
				
				
	}
	


	@AfterClass(alwaysRun = true)
	public void tearDown() {
		
		driver.quit();
		service.stop(); //stop server
		
	}

}
