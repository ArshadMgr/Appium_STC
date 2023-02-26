package appiumSTC;




import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Login {

	static AppiumDriver driver;
	
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		openCalculator();
		
		
	} // end of main method 
	

	
	public static <MobileElement> void openCalculator() throws Exception {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "vivo 1907_19");
		cap.setCapability("udid", "NJMNIBGU6X69LNR4");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver(url, cap);
		
		System.out.println("Application started.....");
		
		
	}
	
	
}//End of class
