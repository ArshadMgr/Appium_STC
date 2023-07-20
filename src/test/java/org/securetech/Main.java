package org.securetech;

import java.net.MalformedURLException;

import java.time.Duration;
import java.util.HashMap;

import javax.lang.model.element.Element;
import javax.swing.text.html.ImageView;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.securetech.TestUtils.AndroidBaseTest;
import org.securetech.pageObjects.android.LoginPage;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import io.opentelemetry.sdk.metrics.View;



public class Main extends AndroidBaseTest{

	
	@Test 
	
	
	public void Login() throws  InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setMSISDNField("03028565795");
		loginPage.setpasswordField("7721");
		loginPage.loginApp();
		loginPage.submitOTP();
		//loginPage.retailerInfo();
		loginPage.retailerBiometricsAcquisition();
		loginPage.goToMainMenu();
		
	}
}
		
		/*
		WebElement MSISDN = driver.findElement(By.id("com.securetech.jazzbvs:id/txtMsisdn"));
		MSISDN.sendKeys("03028565795");
		
		WebElement password = driver.findElement(By.id("com.securetech.jazzbvs:id/txtPassword"));
        password.sendKeys("7721");
        
        WebElement loginButton = driver.findElement(AppiumBy.accessibilityId("Login"));
		loginButton.click();
		
		// Enter OTP
		
		try {
		    Thread.sleep(50000); // Sleep for 30 seconds 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50)); 
		
		//WebElement PIN = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.securetech.jazzbvs:id/btnInputSubmit")));
		
		WebElement submitButton = driver.findElement(By.id("com.securetech.jazzbvs:id/btnInputSubmit"));
		submitButton.click();
      
		
		try {
		    Thread.sleep(10000); // Sleep for 10 seconds 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
		
		/*
		// Retailer Info Screen
		
     	WebElement nextButton= driver.findElement(By.id("com.securetech.jazzbvs:id/btnSend"));
		nextButton.click();
		*/
		
		/*
	//	WebElement imageViewHands =  driver.findElement(By.id("com.securetech.jazzbvs:id/imageViewHands"));	
		
		//TouchAction touchAction = new TouchAction(driver);
		
		// touchAction.longPress(PointOption.point(363, 262)).release().perform();
		//touchAction.press(PointOption.point(xPos, yPos));
	
		// touchAction.tap(PointOption.point(363, 262)).perform();
		// startAutoCaptureThread();
       //  Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
		//touchAction.perform();
		
	//	touchAction.tap(new TapOptions().withElement(new ElementOption().withElement(imageViewHands))).perform();
	//	touchAction.press(PointOption.point(427, 878)).withElement(new ElementOption().withElement(imageViewHands))).perform();
	//	action.press(PointOption.point(427, 878)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1300)).moveTo(PointOption.point(427, 554)).release().perform();
 /*
		
		mImageViewHands = view.findViewById(R.id.imageViewHands);  
		
       mImageViewHands.setOnTouchListener(new View.OnTouchListener()
		
		{
            @SuppressLint("ClickableViewAccessibility")
            public boolean onTouch(View arg0, MotionEvent arg1) {
                if (SystemClock.elapsedRealtime() - mLastClickTime < 1000) {
                    return false;
                }
                mLastClickTime = SystemClock.elapsedRealtime();

                try {
                    touchX = (arg1.getX());
                    touchY = (arg1.getY());

                    int xPos = (int) touchX;
                    int yPos = (int) touchY;

                    switch (fingerIndex) {
                        case 1:
                           // if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 310 && xPos >= 200) && (yPos >= 50 && yPos <= 100))//RIGHT THUMB
                                {
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                           // }
                            break;
                        case 2:
                         //   if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 220 && xPos >= 190) && (yPos >= 150 && yPos <= 250)) {//RIGHT INDEX
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                           // }
                            break;
                        case 3:
                           // if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 180 && xPos >= 120) && (yPos >= 170 && yPos <= 260)) {//RIGHT MIDDLE
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                           // }
                            break;
                        case 4:
                          //  if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 120 && xPos >= 25) && (yPos >= 190 && yPos <= 260)) {//RIGHT RING
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                          //  }
                            break;
                        case 5:
                        //    if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 100 && xPos >= 0) && (yPos >= 90 && yPos <= 160)) {//RIGHT LITTLE
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                        //    }
                            break;
                        case 6:
                           // if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 400 && xPos >= 300) && (yPos >= 50 && yPos <= 100)) {//LEFT THUMB
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                          //  }
                            break;
                        case 7:
                           // if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 500 && xPos >= 360) && (yPos >= 150 && yPos <= 250)) {//LEFT INDEX
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                            //}
                            break;
                        case 8:
                           // if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 550 && xPos >= 400) && (yPos >= 170 && yPos <= 260)) {//LEFT MIDDLE
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                           // }
                            break;
                        case 9:
                         //   if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 670 && xPos >= 530) && (yPos >= 190 && yPos <= 260)) {//LEFT RING
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                          //  }
                            break;
                        case 10:
                           // if (Constants.DEVICE_DENSITY == 320) {
                                if ((xPos <= 700 && xPos >= 560) && (yPos >= 60 && yPos <= 150)) {//LEFT LITTLE
                                    startAutoCaptureThread();
                                    Log.d("Biometric::=>", "XPos = " + xPos + " YPos = " + yPos);
                                }
                           // }
                            break;

                        default:
                            break;
                    }

                } catch (Throwable e) {
                    e.printStackTrace();
                }

//                if (fingerIndex > 0)
//                    lblSelectedFinger.setError(null);

                //String[] indexes=new String[]{"1","3","6","8"};
                //mImageViewHands.setImageBitmap(enableFingerPrints(indexes));

//                if (!IsCapture && fingerIndex != 0) {
//                    try {
//                        //for(int i=0;i<indexes.length;i++){
//                        //if(indexes[i].equalsIgnoreCase(String.valueOf(fingerIndex)))
//                        //{
////                        enableGUI(false);
////                        startAutoCaptureThread();
//                        //}
//                        //}
//                    } catch (Throwable e) {
//                        displayMessage(e.getMessage());
//                    }
//                }
                return true;
            }
        });
		
       */

		// biometrics screen
		
		//driver.findElement(By.id("com.securetech.jazzbvs:id/imageViewHands")).click();
		//  AppiumBy.accessibilityId("Finger Index")
	//	try {
		//    Thread.sleep(40000); // Sleep for 40 seconds 
	//	} catch (InterruptedException e) {
		  //  e.printStackTrace();
		//}
    
	//	 WebElement verifyButton = driver.findElement(By.xpath("//android.widget.Button[@text ='VERIFY']"));
		// verifyButton.click();
	

		
		
			
	
	
//	}
	
