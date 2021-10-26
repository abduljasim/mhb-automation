package outagetesting;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.beust.jcommander.Parameters;

import java.net.MalformedURLException;
import java.net.URL;


public class ParallelLogin {
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1Mzc3LCJ4cC5wIjoxLCJ4cC5tIjoxNjI1MDYzMjI4MzczLCJleHAiOjE5NDE2NTU3NDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.LQk_SR9MzzqyIL1xBJuk92MgRs4aODn35_HrVp7bmXc";
    static IOSDriver driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();


	@BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName","MHB login test");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.mobileheartbeat.mhcure.enterprise");
        driver = new IOSDriver(new URL("https://vpndemous3.experitest.com/wd/hub"), dc);
    }
   

    @AfterMethod
    public void tearDown(){
          driver.quit();
    }
}
