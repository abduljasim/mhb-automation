package mhbmobile;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import io.appium.java_client.TouchAction;
import java.net.MalformedURLException;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
//import io.appium.java_client.touch.offset.ElementOption;
//import io.appium.java_client.touch.offset.PointOption;
//import io.appium.java_client.touch.WaitOptions;
import java.time.Duration;
import org.testng.annotations.*;

public class Testmhb {
	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo1Mzc3LCJ4cC5wIjoxLCJ4cC5tIjoxNjI1MDYzMjI4MzczLCJleHAiOjE5NDE2NTU3NDEsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.LQk_SR9MzzqyIL1xBJuk92MgRs4aODn35_HrVp7bmXc";
	private String url = "https://vpndemous3.experitest.com";

	protected IOSDriver<IOSElement> driver = null;


	@BeforeMethod
	public void setUp() throws MalformedURLException {
		final DesiredCapabilities dc = new org.openqa.selenium.remote.DesiredCapabilities();
		dc.setCapability("accessKey", accessKey);
		dc.setCapability("deviceQuery", "@serialnumber='47e116086c4c1ffce80e3bc03fa0c0d46896765d'");
		dc.setCapability("testName", "Untitled");
		driver = new IOSDriver<>(new java.net.URL(url + "/wd/hub"), dc);
	}

	@Test(groups = {"seetest"})
	public void testUntitled() {
		driver.findElement(By.xpath("//*[@text='Broadcasts']")).click();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeButton' and @label='Groups']")).click();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeStaticText' and @accessibilityLabel='BROADCASTS_GROUPS_NAME_LABEL' and @label='Corp Test Users - Anywhere']")).click();
		driver.getKeyboard().sendKeys("Test");
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeTextView' and @label='Test']")).click();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeButton' and @label='broadcast send button']")).click();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeButton' and @label='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
