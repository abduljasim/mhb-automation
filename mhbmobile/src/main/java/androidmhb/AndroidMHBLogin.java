package androidmhb;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidMHBLogin {

	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1Mzc3LCJ4cC5wIjoxLCJ4cC5tIjoxNjI1MDYzMjI4MzczLCJleHAiOjE5NDE2NTU3NDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.LQk_SR9MzzqyIL1xBJuk92MgRs4aODn35_HrVp7bmXc";
    static AndroidDriver driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();


	@BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName","MHB login test");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.mobileheartbeat.mhcure.enterprise");
        driver = new AndroidDriver(new URL("https://vpndemous3.experitest.com/wd/hub"), dc);
        driver.findElement(By.id("login_screen_username_text")).sendKeys("corpsvctst1");
        driver.findElement(By.id("login_screen_password_text")).sendKeys("Enabled1");
        driver.findElement(By.id("login_screen_login_button")).click();
    }
    
    // Test annotation is in the main class MHBmobileAutomation.java

	
    @AfterMethod
    public void tearDown(){
          driver.quit();
    }

}
