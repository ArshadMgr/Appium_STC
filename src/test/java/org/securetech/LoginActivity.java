package org.securetech;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.securetech.TestUtils.AndroidBaseTest;
import org.securetech.pageObjects.android.StatusCheck;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginActivity extends AndroidBaseTest{

	
	@Test (dataProvider="getLoginData") 
	
	
	public void login(HashMap<String,String>input) throws  InterruptedException {
		
		loginPage.setMSISDNField(input.get("MSISDN"));
		loginPage.setpasswordField(input.get("password"));
		loginPage.loginApp();
		loginPage.submitOTP();
		//loginPage.retailerInfo();
		loginPage.retailerBiometricsAcquisition();
		StatusCheck checkstatus = loginPage.goToMainMenu();
		
	}
		
	
     @Test (dataProvider="getStatusCheckData") 
	
	
	public void statusCheck(HashMap<String,String>input) throws  InterruptedException {
			
		checkstatus.performStatusCheck();
		checkstatus.setCNIC(input.get("CNIC"));
		checkstatus.execute668StatusCheck();
		checkstatus.tapOKButton();
		checkstatus.goToMainMenu();
		//PrepaidSIMChange changeSIMPrepaid= checkstatus.goToMainMenu();
		
	}
     
   
     @Test (dataProvider="getNewSimSaleData") 
 	
 	
 	public void performSimSale(HashMap<String,String>input) throws  InterruptedException {
 		
 		simSale.performNewSIMSale();
 		simSale.setCNIC(input.get("CNIC"));
 		simSale.setMSISDN(input.get("MSISDN"));
 		simSale.setIMSI(input.get("IMSI"));
 		simSale.setOtherContact(input.get("contact"));
 		simSale.setType(input.get("type"));
 		simSale.selectBundle(input.get("bundle"));
 		simSale.executeNewSIMSale();
 		simSale.tapOKButton();
 		simSale.tapCancelButton();	
 		
 	}
 

       
     @Test (dataProvider="getChangeSIMPrepaidData") 
  	
  	
  	public void changeSIMPrepaid(HashMap<String,String>input) throws InterruptedException {
    	 
    	 prepaidSIMChange.switchToFrame();
    	 prepaidSIMChange.performSIMChangePrepaid();
    	 prepaidSIMChange.setCNIC(input.get("CNIC"));
    	 prepaidSIMChange.setMSISDN(input.get("MSISDN"));
    	 prepaidSIMChange.setIMSI(input.get("IMSI"));
    	 prepaidSIMChange.setSIMCharges();
    	 prepaidSIMChange.executeChangeSIMPrepaid();
    	 prepaidSIMChange.tapOKButton();
    	 prepaidSIMChange.tapCancelButton();
    	// driver.switchTo().defaultContent();
  		
  	}
  	
   
     @Test (dataProvider="getDisownPrepaidData") 
   	
   	
   	public void disownPrepaid(HashMap<String,String>input) throws  InterruptedException {
   		
    	 prepaidDisown.performPrepaidDisown();
    	 prepaidDisown.setCNIC(input.get("CNIC"));
    	 prepaidDisown.setMSISDN(input.get("MSISDN"));
    	 prepaidDisown.executePrepaidDisown();
    	 prepaidDisown.tapOKButton();
    	 prepaidDisown.tapCancelButton();
   		 		
   	}
	

     @Test (dataProvider="getChangeSIMPostpaidData") 
   	
   	
   	public void changeSIMPostpaid(HashMap<String,String>input) throws InterruptedException {
   		
    	 postpaidChangeSIM.performSIMChangePostpaid();
    	 postpaidChangeSIM.setCNIC(input.get("CNIC"));
    	 postpaidChangeSIM.setMSISDN(input.get("MSISDN"));
    	 postpaidChangeSIM.setIMSI(input.get("IMSI"));
    	 postpaidChangeSIM.setSIMCharges();
    	 postpaidChangeSIM.executeChangeSIMPostpaid();
    	 postpaidChangeSIM.tapOKButton();
    	 postpaidChangeSIM.tapCancelButton();
   		
   		
   	}
     
	@DataProvider
	public Object[][] getLoginData() throws IOException
	
	
	{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//securetech//testdata//logincredentials.json");
		return new Object[][] {{data.get(0)}};
	}
	
			
	@DataProvider	
    public Object[][] getStatusCheckData() throws IOException
	
	
	{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//securetech//testdata//CheckStatus.json");
		return new Object[][] {{data.get(0)}};
	}
	
	
	@DataProvider
	public Object[][] getNewSimSaleData() throws IOException
	
	
	{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//securetech//testdata//NewSIMSale.json");
		return new Object[][] {{data.get(0)}};
	}
	
		
	
	
	@DataProvider
	public Object[][] getChangeSIMPrepaidData() throws IOException
	
	
	{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//securetech//testdata//ChangeSIMPrepaid.json");
		return new Object[][] {{data.get(0)}};
	}
	
	
	@DataProvider
	public Object[][] getDisownPrepaidData() throws IOException
	
	
	{
		List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//securetech//testdata//DisownPrepaid.json");
		return new Object[][] {{data.get(0)}};
	}
		
	
    @DataProvider
    public Object[][] getChangeSIMPostpaidData() throws IOException

    {
    
	    List<HashMap<String, String>> data = getJsonData(System.getProperty("user.dir")+"//src//test//java//org//securetech//testdata//ChangeSIMPostpaid.json");
	    return new Object[][] {{data.get(0)}};
    
    }
}