package org.securetech.pageObjects.android;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.securetech.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrepaidSIMChange extends AndroidActions{
	
AndroidDriver driver;

	
	public PrepaidSIMChange(AndroidDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	
	//@AndroidFindBy(id = "com.securetech.jazzbvs:id/topbar")
	@AndroidFindBy(id = "android:id/content")
	private WebElement frameElement;
	
	
	public void switchToFrame() 
	
	{
		
	driver.switchTo().frame(frameElement);
		
	}
	
	
	//@AndroidFindBy(xpath="//android.widget.Button[@text ='SIM CHANGE']")
	@AndroidFindBy(id="com.securetech.jazzbvs:id/btnChangeSIMIcon")
	private WebElement changeSIMIcon;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/txtCnicNo")
	private WebElement CNICField;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/txtMsisdnNo")
	private WebElement MSISDNField;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text ='Enter IMSI']")
	private WebElement IMSIField;
	
	@AndroidFindBy(id="android:id/text1")
//	@AndroidFindBy(xpath="//android.widget.TextView[@text ='Charged']")
	private WebElement SIMCharges;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='NEXT']")
	private WebElement nextButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='CANCEL']")
	private WebElement cancelButton;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/ButtonBar")
	private WebElement OKbutton;
	
	
	public void performSIMChangePrepaid()
	
	{
		changeSIMIcon.click();
	}
	
    public void setCNIC(String CNIC)
	
	{
		CNICField.sendKeys(CNIC);
	}
	
   public void setMSISDN(String MSISDN)
	
	{
		MSISDNField.sendKeys(MSISDN);
	}

   public void setIMSI(String IMSI)
	
	{
		IMSIField.sendKeys(IMSI);
	} 
    
   
	public void setSIMCharges()
	
	{
		SIMCharges.click();
		
	} 
		
	
    public void executeChangeSIMPrepaid()
	
	{
    	nextButton.click();
    	
    	try {
		    Thread.sleep(10000); // Sleep for 10 seconds 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		//return new ProductCatalogue(driver);
	}
    
    
    
   public void tapOKButton()
	
   	{
       	OKbutton.click();
       	 		
   	}
   
   public void tapCancelButton()
	
  	{
      	cancelButton.click();
      	
      	try {
  		    Thread.sleep(10000); // Sleep for 10 seconds 
  		} catch (InterruptedException e) {
  		    e.printStackTrace();
  		}
  		//return new ProductCatalogue(driver);
  	}
     
   /*
     public void tapBackButton()
 	
    	{
        	backButton.click();
        		
    	}
    	
    	*/
}
