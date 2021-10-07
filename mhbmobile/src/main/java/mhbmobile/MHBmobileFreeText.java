package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MHBmobileFreeText extends MHBmobileLogin {
	
	public void mhbfreetxt() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Texts']")));
		driver.findElement(By.xpath("//*[@text='Texts']")).click();
		driver.findElement(By.xpath("//*[@text='Compose']")).click();
		driver.findElement(By.xpath("//*[@text='To:']")).sendKeys("TestTwo");
		driver.findElement(By.xpath("//*[@text='Corp TestTwo, 4 Units in 2 Hospitals, Nurse']")).click();
		driver.findElement(By.xpath("//*[@text='Continue']")).click();
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation Free Text");
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		driver.findElement(By.xpath("//*[@text='texting urgent button']")).click();
		driver.findElement(By.xpath("//*[@text='TEXT_FIELD_INPUT']")).sendKeys("Automation urgent Text");
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		driver.findElement(By.xpath("//*[@text='Quick Pick']")).click();
		driver.findElement(By.xpath("//*[@text='MESSAGE_TEXT_LABEL']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting send button']")));
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		driver.findElement(By.xpath("//*[@text='Patient Pick']")).click();
		driver.findElement(By.xpath("//*[@text='PATIENTS_BED_LABEL']")).click();
		driver.findElement(By.xpath("//*[@text='texting send button']")).click();
		new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='texting more button']")));
		driver.findElement(By.xpath("//*[@text='texting more button']")).click();
		driver.findElement(By.xpath("//*[@text='Camera']")).click();
		driver.findElement(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']")).click();
		driver.findElement(By.xpath("//*[@text='Send']")).click();
		driver.findElement(By.xpath("//*[@text='More Info']")).click();
		driver.findElement(By.xpath("//*[@text='Texts']")).click();
	}

}
