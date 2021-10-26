package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;




public class MHBmobileGroupText extends MHBmobileLogin {

	public void mhbgrouptext() {
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Texts']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Compose']"))).click();
		// Adding testtwo
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='To:']"))).sendKeys("TestTwo");
		driver.findElement(By.xpath("//*[@accessibilityLabel='CONTACT_CARD_NAME_LABEL']")).click();

		// Adding testthree
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='To:']"))).sendKeys("TestThree");
		driver.findElement(By.xpath("(//*[@text='CONTACTS_LIST_TABLE']/*/*[@text='Corp TestThree'])[1]")).click();
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
		
		// Add testfour
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='More Info']")));
		driver.findElement(By.xpath("//*[@text='More Info']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='＋ Add Contact']")));
		driver.findElement(By.xpath("//*[@text='＋ Add Contact']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTACT_LIST_SEACH_INPUT']")));
		driver.findElement(By.xpath("//*[@text='CONTACT_LIST_SEACH_INPUT']")).sendKeys("TestFour");
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
		// scroll screen down
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));		
		driver.findElement(By.xpath("//*[@accessibilityLabel='TEXT_DETAILS_LEAVE_CELL']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='DIALOGUE_LONG_TITLE_SUBMIT_BUTTON']")));
		driver.findElement(By.xpath("//*[@text='DIALOGUE_LONG_TITLE_SUBMIT_BUTTON']")).click();

	

	}

}
