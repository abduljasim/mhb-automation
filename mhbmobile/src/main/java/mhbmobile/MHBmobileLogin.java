package mhbmobile;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;


public class MHBmobileLogin {
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1Mzc3LCJ4cC5wIjoxLCJ4cC5tIjoxNjI1MDYzMjI4MzczLCJleHAiOjE5NDE2NTU3NDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.LQk_SR9MzzqyIL1xBJuk92MgRs4aODn35_HrVp7bmXc";
    static IOSDriver driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();


	@BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName","MHB login test");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.mobileheartbeat.mhcure.enterprise");
        driver = new IOSDriver(new URL("https://hca-new.experitest.com/wd/hub"), dc);
        driver.findElement(By.id("LOGIN_USER_INPUT")).sendKeys("corpsvctst1");
        driver.findElement(By.id("LOGIN_PW_INPUT")).sendKeys("Enabled1");
        driver.findElement(By.id("Login")).click();
   	
    }
	
    // Test annotation is in the main class MHBmobileAutomation.java

    @AfterMethod
    public void tearDown(){
          driver.quit();
    }
}
