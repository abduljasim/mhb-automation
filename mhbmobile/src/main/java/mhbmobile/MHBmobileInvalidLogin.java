package mhbmobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;

public class MHBmobileInvalidLogin {
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1Mzc3LCJ4cC5wIjoxLCJ4cC5tIjoxNjI1MDYzMjI4MzczLCJleHAiOjE5NDE2NTU3NDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.LQk_SR9MzzqyIL1xBJuk92MgRs4aODn35_HrVp7bmXc";
    static IOSDriver driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    
	@BeforeMethod
	public void mhbgenerallogin() throws MalformedURLException {
        dc.setCapability("testName","MHB login test");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.mobileheartbeat.mhcure.enterprise");
        driver = new IOSDriver(new URL("https://vpndemous3.experitest.com/wd/hub"), dc);

	}

	@Test
	public void invpass() {
        driver.findElement(By.id("LOGIN_USER_INPUT")).sendKeys("corpsvctst1");
        driver.findElement(By.id("LOGIN_PW_INPUT")).sendKeys("Enabled2");
        driver.findElement(By.id("Login")).click();
        // check if login failed element is displayed
        
       if( driver.findElement(By.id("Login Failed")).isDisplayed()) 
       {
    	   System.out.println("Login Failed - Please Enter a correct password!");
    	   driver.findElement(By.id("DIALOGUE_SHORT_NO_TITLE_SUBMIT_BUTTON")).click();
       } else {
    	   System.out.println("Correct credential are correct");
    	   driver.findElement(By.id("DIALOGUE_SHORT_NO_TITLE_SUBMIT_BUTTON")).click();
       }
	}
	
	@Test
	public void invuser() {
        driver.findElement(By.id("LOGIN_USER_INPUT")).sendKeys("corpsvctst2");
        driver.findElement(By.id("LOGIN_PW_INPUT")).sendKeys("Enabled1");
        driver.findElement(By.id("Login")).click();
        // check if login failed element is displayed
        
       if( driver.findElement(By.id("Login Failed")).isDisplayed()) 
       {
    	   System.out.println("Login Failed - Please Enter a correct username!");
    	   driver.findElement(By.id("DIALOGUE_SHORT_NO_TITLE_SUBMIT_BUTTON")).click();
       } else {
    	   System.out.println("Correct credential are correct");
    	   driver.findElement(By.id("DIALOGUE_SHORT_NO_TITLE_SUBMIT_BUTTON")).click();
       }
	}
	
    @AfterMethod
    public void tearDown(){
          driver.quit();
    }
}
