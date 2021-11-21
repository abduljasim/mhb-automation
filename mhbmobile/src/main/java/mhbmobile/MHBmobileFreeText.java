package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MHBmobileFreeText extends MHBmobileLogin {
	
	public void mhbfreetxt() {
		// 1:1 Text
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Texts']")));
		driver.findElement(By.xpath("//*[@text='Texts']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Compose']")));
		driver.findElement(By.xpath("//*[@text='Compose']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='To:']")));
		driver.findElement(By.xpath("//*[@text='To:']")).sendKeys("TestTwo");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Corp TestTwo, 4 Units in 2 Hospitals, Nurse']]")));
		driver.findElement(By.xpath("//*[@class='UIAButton' and ./parent::*[@text='Corp TestTwo, 4 Units in 2 Hospitals, Nurse']]")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Continue']")));
		driver.findElement(By.xpath("//*[@text='Continue']")).click();
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation Free 1:1 Text");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		// Urgent 1:1 text
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting urgent button']")));
		driver.findElement(By.xpath("//*[@text='texting urgent button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='TEXT_FIELD_INPUT']")));
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation urgent 1:1 Text");
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		// Quick Pick
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Quick Pick']")));
		driver.findElement(By.xpath("//*[@text='Quick Pick']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='MESSAGE_TEXT_LABEL']")));
		driver.findElement(By.xpath("//*[@text='MESSAGE_TEXT_LABEL']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		// Patient Pick
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']")));
		driver.findElement(By.xpath("//*[@text='Patient Pick']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PATIENTS_BED_LABEL']")));
		driver.findElement(By.xpath("//*[@text='PATIENTS_BED_LABEL']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		// Camera
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		driver.findElement(By.xpath("//*[@text='Camera']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']")));
		driver.findElement(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Send']")));
		driver.findElement(By.xpath("//*[@text='Send']")).click();
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='More Info']")));
		driver.findElement(By.xpath("//*[@text='More Info']")).click();
		driver.findElement(By.xpath("//*[@text='Texts']")).click();
	}

}
