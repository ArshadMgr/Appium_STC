package org.securetech.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;

public class AndroidActions extends AppiumUtils {

AndroidDriver driver;
	
	public AndroidActions(AndroidDriver driver)
	
	{
		this.driver = driver;
	}

	public void longPressAction(WebElement ele) {
		
		
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", 
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
				"duration",2000));
	}
	
	public void scrollToEndAction() {
		
	
	boolean canScrollMore;
    do
    {
    
    canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
      "left", 100, "top", 100, "width", 200, "height", 200,
       "direction", "down",
       "percent", 3.0
       ));
    }while(canScrollMore);	
	
}
	//set screen to home page
	
		@BeforeMethod
	    public void setActivity()
	    
	    {
	    	Activity activity = new Activity("com.securetech.jazzbvs", "com.securetech.mobilinkbiometricmodule.ui.MainActivity");
			driver.startActivity(activity);
	    }
	
	public void scrollToText(String bundle)
	
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+bundle+"\"));"));
	}
	
	
	
	
}
