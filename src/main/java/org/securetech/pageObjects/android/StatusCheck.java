package org.securetech.pageObjects.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.securetech.utils.AndroidActions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class StatusCheck extends AndroidActions{
	
AndroidDriver driver;

	
	public StatusCheck(AndroidDriver driver)
	
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	

    @AndroidFindBy(id="com.securetech.jazzbvs:id/btnPMD")
	//@AndroidFindBy(xpath="//android.widget.Button[@text ='668 Status Check']")
	private WebElement statusCheckIcon;
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/edtCnicNo")
	private WebElement CNICField;
	
	@AndroidFindBy(xpath="//android.widget.Button[@text ='Search']")
	private WebElement searchButton;
		
	@AndroidFindBy(id="com.securetech.jazzbvs:id/ButtonBar")
	private WebElement OKbutton;
	//com.securetech.jazzbvs:id/ButtonBar
	
	@AndroidFindBy(id="com.securetech.jazzbvs:id/backBtn")
	private WebElement backButton;
	//com.securetech.jazzbvs:id/backBtn
	
	
    public void performStatusCheck()
	
	{   
    	
    	statusCheckIcon.click();
	}
    
    public void setCNIC(String CNIC)
	
   	{
   		CNICField.sendKeys(CNIC);
   	}
    
    public void execute668StatusCheck()
	
   	{
       	searchButton.click();
       	
       	try {
   		    Thread.sleep(5000); // Sleep for 5 seconds 
   		} catch (InterruptedException e) {
   		    e.printStackTrace();
   		}
   		
   	}

     public void tapOKButton()
	
   	{
       	OKbutton.click();
       	 		
   	}
     
     public void goToMainMenu()
 	
    	{
        	backButton.click();
        	
        	try {
       		    Thread.sleep(20000); // Sleep for 20 seconds 
       		} catch (InterruptedException e) {
       		    e.printStackTrace();
       		}
        	
        //	return new PrepaidSIMChange(driver);
    	}
        
     
    
	}
    

