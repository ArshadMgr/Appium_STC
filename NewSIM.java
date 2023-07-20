package org.securetech.pageObjects.android;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.securetech.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class NewSIM extends AndroidActions{
	
AndroidDriver driver;

	
	public NewSIM(AndroidDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='NEW SIM']")
	private WebElement newSIMIcon;
	//com.securetech.jazzbvs:id/btnNewSIM
	
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/txtCnicNo")
	private WebElement CNICField;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/txtMsisdnNo")
	private WebElement MSISDNField;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text ='Enter 5 digits IMSI']")
	private WebElement IMSIField;
	
	@AndroidFindBy(xpath="//android.widget.EditText[@text ='Enter Other Contact']")
	private WebElement otherContact;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text ='Prepaid']")
	private WebElement prepaidOption;
	
	@AndroidFindBy(xpath="//android.widget.RadioButton[@text ='Dongle']")
	private WebElement dongleOption;
	
	
	@AndroidFindBy(id="android:id/text1")
	//@AndroidFindBy(xpath="//android.widget.TextView[@text ='--Please Select Bundle--']")
    private WebElement bundleOptions;
	
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='NEXT']")
	private WebElement nextButton;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='CANCEL']")
	private WebElement cancelButton;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/ButtonBar")
	private WebElement OKbutton;
	
	
	public void performNewSIMSale()
	
	{
		newSIMIcon.click();
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
   
   public void setOtherContact(String contact)
	
	{
	   otherContact.sendKeys(contact);
	} 
   
   public void setType(String type)
	
   {
		if (type.contains("Dongle"))
		  dongleOption.click();
		
		else 
			prepaidOption.click();
	}
	
  
	public void selectBundle(String bundle) throws InterruptedException
	
	{
		bundleOptions.click();
		scrollToText(bundle);
		Thread.sleep(2000);
	
		List<WebElement> elements = driver.findElements(By.id("android:id/text1"));
		for (WebElement element : elements) {
			if (element.getAttribute("text").equals(bundle)) {
		    	element.click();
		    }
			
		    Thread.sleep(2000);
		    
		}   
		
		
	//	driver.findElement(By.xpath("//android.widget.TextView[@text ='"+bundle+"']")).click();
	
	  
	} 
		
    public void executeNewSIMSale()
	
	{
    	nextButton.click();
    	
    	try {
		    Thread.sleep(5000); // Sleep for 5 seconds 
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
