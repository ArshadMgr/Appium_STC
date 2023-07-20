package org.securetech.pageObjects.android;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.securetech.utils.AndroidActions;

import io.appium.java_client.TouchAction;
//import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;


public class LoginPage extends AndroidActions {
	
AndroidDriver driver;
	
	public LoginPage(AndroidDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/txtMsisdn")
	private WebElement MSISDNField;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/txtPassword")
	private WebElement passwordField;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/btnLogin")
	private WebElement loginButton;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/btnInputSubmit")
	private WebElement submitButton;
	
	/*
	@AndroidFindBy(id="com.securetech.jazzbvs:id/btnSend")
	private WebElement nextButton;
	*/
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/imageViewHands")
	private WebElement imageViewHands;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='VERIFY']")
	private WebElement verifyButton;
	
	
	/*
	  public void setActivity()
	    
	    {
	    	Activity activity = new Activity("com.securetech.jazzbvs", "com.securetech.mobilinkbiometricmodule.ui.SplashActivity");
			driver.startActivity(activity);
	    }
	    
	  */  
	    
    public void setMSISDNField(String MSISDN)
	
	{
	    MSISDNField.sendKeys(MSISDN);		
	}

    public void setpasswordField(String password)

    {
    	passwordField.sendKeys(password);
    }

	
    public void loginApp() throws InterruptedException
	
	{
       loginButton.click();
    	 
      // Enter OTP
    	  
    	  try {
  		    Thread.sleep(20000); // Sleep for 30 seconds 
  		} catch (InterruptedException e) {
  		    e.printStackTrace();
  		}
		//return new ProductCatalogue(driver);
	}
      
      public void submitOTP() throws InterruptedException
      
      {
  	      submitButton.click();
      	  
      	  try {
    		    Thread.sleep(7000); // Sleep for 7 seconds 
    		} catch (InterruptedException e) {
    		    e.printStackTrace();
    		}
  		//return new ProductCatalogue(driver);
  	}
      
      /*
     public void retailerInfo() throws InterruptedException
      
      {
    	 nextButton.click();
      	 
      	  
      	  try {
    		    Thread.sleep(10000); // Sleep for 10 seconds 
    		} catch (InterruptedException e) {
    		    e.printStackTrace();
    		}
  		
  	}  
  	
  	*/
      
 public void retailerBiometricsAcquisition() throws InterruptedException
      
      {
	 
	// Get the coordinates of the image view
	 Point imageLocation = imageViewHands.getLocation();
	 int imageX = imageLocation.getX();
	 int imageY = imageLocation.getY();

	 // Calculate the coordinates of the specific finger (e.g., index finger)
	 int fingerX = imageX + 446; // Adjust the X offset based on finger position
	 int fingerY = imageY + 262; // Adjust the Y offset based on finger position

	 // Perform tap action on the specific finger
	 TouchAction touchAction = new TouchAction(driver);
	         touchAction.tap(PointOption.point(fingerX, fingerY))
	         .perform();
	 
	
		    

      	/* 
	 TouchAction touchAction = new TouchAction(driver);
	 
	 int finger2X = 446;
     int finger2Y = 262;
	 imageViewHands.tap(finger2X, finger2Y);
	 */
     
   // touchAction.press(imageViewHands,446,262).perform();
      	  
      //	  try {
    		 //   Thread.sleep(50000); // Sleep for 50 seconds 
    		//} catch (InterruptedException e) {
    		//    e.printStackTrace();
    		//}
  		//return new ProductCatalogue(driver);
  	}
 
     public StatusCheck goToMainMenu() 
	
	 {
	 
	 verifyButton.click();
	 
	 try {
		   Thread.sleep(15000);
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	 
	return new StatusCheck(driver);
	 
	}
 
 
}


