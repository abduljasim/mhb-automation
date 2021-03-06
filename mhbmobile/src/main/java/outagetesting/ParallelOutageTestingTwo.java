package outagetesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelOutageTestingTwo {
	 private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1Mzc3LCJ4cC5wIjoxLCJ4cC5tIjoxNjI1MDYzMjI4MzczLCJleHAiOjE5NDE2NTU3NDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.LQk_SR9MzzqyIL1xBJuk92MgRs4aODn35_HrVp7bmXc";
	    static IOSDriver driver2 = null;
	    DesiredCapabilities dc = new DesiredCapabilities();
	    static  List<String> quiclinks = Arrays.asList("cwd-1974s","cod-2570s","fwd-2619s","gcd-1974s","mad-1974s","mtd-2574s","ntd-1974s","sad-1974s","cpd-862s","trd-862s","efd-351s","nfd-351s","sod-351s","wfd-351s");
	    
	    @Parameters({ "udid", "deviceName", "port"})
	    @BeforeTest
	    public void setUp(String udid, String deviceName,String port) throws MalformedURLException {
	        dc.setCapability("testName","MHB login test");
	        dc.setCapability("accessKey", accessKey);
	        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
	        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.mobileheartbeat.mhcure.enterprise");
	        dc.setCapability(MobileCapabilityType.UDID, udid);
	        dc.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
	        driver2 = new IOSDriver(new URL("https://vpndemous3.experitest.com/wd/hub"), dc);     
	    }
	    
	   
	    @Test
	    public void usertest2() {
	    	
	    	for(int x=0; x < quiclinks.size(); x++) {
		        new WebDriverWait(driver2, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='LOGIN_USER_INPUT']"))).sendKeys(quiclinks.get(x));
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.id("Login"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='LOGIN_USER_INPUT']"))).sendKeys("corpgenmhbtst2");
		        driver2.findElement(By.xpath("//*[@text='LOGIN_PW_INPUT']")).sendKeys("Quality13");
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGIN_SUBMIT_BUTTON']"))).click();
	        
		        
		        // Broadcast testing
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Broadcasts']"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Groups']"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='BROADCASTS_GROUPS_NAME_LABEL']"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='BROADCAST_COMPOSE']/*[@class='UIAView' and @height>0])[2]"))).sendKeys("Automation Broadcasts Outage Testing - Testbot2");
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.id("broadcast send button"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_PAGE_LABEL"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.id("Logout"))).click();
		        new WebDriverWait(driver2, 50).until(ExpectedConditions.elementToBeClickable(By.id("LOGOUT_BUTTON"))).click();
	
	    	} //end of for loop
	    }

	     @AfterTest
	        public void tearDown(){
	              driver2.quit();
	        }
}
