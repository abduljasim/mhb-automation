package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.TouchAction;

public class MHBmobileGroupText extends MHBmobileLogin {

	public void mhbgrouptext() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Texts']")));
		driver.findElement(By.xpath("//*[@text='Texts']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Compose']")));
		driver.findElement(By.xpath("//*[@text='Compose']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='To:']")));
		driver.findElement(By.xpath("//*[@text='To:']")).sendKeys("TestTwo");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Corp TestTwo, 4 Units in 2 Hospitals, Nurse']]")));
		driver.findElement(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Corp TestTwo, 4 Units in 2 Hospitals, Nurse']]")).click();
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='To:']")));
		driver.findElement(By.xpath("//*[@text='To:']")).sendKeys("TestThree");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='CONTACTS_LIST_TABLE']/*[@text='Corp TestThree, 2 Units in 2 Hospitals, Nurse, Floor Supervisor Corp Hosp 567 Corp Hosp 567'])[1]")));
		driver.findElement(By.xpath("(//*[@text='CONTACTS_LIST_TABLE']/*[@text='Corp TestThree, 2 Units in 2 Hospitals, Nurse, Floor Supervisor Corp Hosp 567 Corp Hosp 567'])[1]")).click();
		
		driver.findElement(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Corp TestTwo, 4 Units in 2 Hospitals, Nurse']]")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continue']")));
		driver.findElement(By.xpath("//*[@text='Continue']")).click();
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation Group Text");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting urgent button']")));
		driver.findElement(By.xpath("//*[@text='texting urgent button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='TEXT_FIELD_INPUT']")));
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation urgent Group Text");
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Quick Pick']")));
		driver.findElement(By.xpath("//*[@text='Quick Pick']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='MESSAGE_TEXT_LABEL']")));
		driver.findElement(By.xpath("//*[@text='MESSAGE_TEXT_LABEL']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']")));
		driver.findElement(By.xpath("//*[@text='Patient Pick']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PATIENTS_BED_LABEL']")));
		driver.findElement(By.xpath("//*[@text='PATIENTS_BED_LABEL']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		driver.findElement(By.xpath("//*[@text='Camera']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']")));
		driver.findElement(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Send']")));
		driver.findElement(By.xpath("//*[@text='Send']")).click();
		
		// Add a contact
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='More Info']")));
		driver.findElement(By.xpath("//*[@text='More Info']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='＋ Add Contact']")));
		driver.findElement(By.xpath("//*[@text='＋ Add Contact']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='To:']")));
		driver.findElement(By.xpath("//*[@text='To:']")).sendKeys("TestFour");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Corp TestFour, 6 Units in 3 Hospitals, iMobile Administrator']")));
		driver.findElement(By.xpath("//*[@text='Corp TestFour, 6 Units in 3 Hospitals, iMobile Administrator']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continue']")));
		driver.findElement(By.xpath("//*[@text='Continue']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Corp TestOne, Corp TestThree, Corp TestTwo']")));
		driver.findElement(By.xpath("//*[@text='Corp TestOne, Corp TestThree, Corp TestTwo']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Message']")));
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation Group Text Add contact");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		
		// Leave Group
		
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='More Info']")));
		driver.findElement(By.xpath("//*[@text='More Info']")).click();
		new TouchAction(driver).press(PointOption.point(102,468)).waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).moveTo(PointOption.point(90,204)).release().perform();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeStaticText' and @accessibilityLabel='TEXT_DETAILS_LEAVE_LABEL' and @label='Leave Conversation']")).click();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeButton' and @label='DIALOGUE_LONG_TITLE_SUBMIT_BUTTON']")).click();
		driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeButton' and @accessibilityLabel='TAB_BAR_DASHBOARD_ITEM' and @label='Dashboard']")).click();
		

	}

}
