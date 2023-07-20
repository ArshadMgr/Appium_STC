package org.securetech.pageObjects.android;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.securetech.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrepaidDisown extends AndroidActions{
	
AndroidDriver driver;

	
	public PrepaidDisown(AndroidDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	//@AndroidFindBy(id="com.securetech.jazzbvs:id/btnPrepaidDisown")
		@AndroidFindBy(xpath="//android.widget.Button[@text ='DISOWN' and @enabled='true']")
		private WebElement prepaidDisownIcon;
		
		@AndroidFindBy(id="com.securetech.jazzbvs:id/txtCnicNo")
		private WebElement CNICField;
		
		@AndroidFindBy(id="com.securetech.jazzbvs:id/txtMsisdnNo")
		private WebElement MSISDNField;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text ='NEXT']")
		private WebElement nextButton;
		
		@AndroidFindBy(id="om.securetech.jazzbvs:id/btnOk")
		private WebElement OKbutton;
		
		@AndroidFindBy(xpath="//android.widget.Button[@text ='CANCEL']")
		private WebElement cancelButton;
		
		
	public void performPrepaidDisown()
		
		{   
	    	try {
	 		   Thread.sleep(2000); // Sleep for 2 seconds 
	 		} catch (InterruptedException e) {
	 		   e.printStackTrace();
	 		}
	 		

	    	prepaidDisownIcon.click();
		}
		
	    public void setCNIC(String CNIC)
		
		{
			CNICField.sendKeys(CNIC);
		}
		
	   public void setMSISDN(String MSISDN)
		
		{
			MSISDNField.sendKeys(MSISDN);
		}
	   
	   public void executePrepaidDisown()
		
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
}
