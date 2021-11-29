package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MHBmobileFreeText extends MHBmobileLogin {
	
	public void mhbfreetxt() {
		// 1:1 Text
        if(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("Texts"))).isDisplayed())
        {
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Texts"))).click();
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Compose"))).click();
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("To:"))).sendKeys("TestTwo");
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Corp TestTwo, 4 Units in 2 Hospitals, Nurse"))).click();
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Continue"))).click();
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Message"))).sendKeys("Automation Free 1:1 Text");
	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();
        } else
        {
        	System.out.println("Device Connected is not available!");
        }
        
		// Urgent 1:1 text
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting urgent button"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("TEXT_FIELD_INPUT"))).sendKeys("Automation urgent 1:1 Text");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();

		// Quick Pick
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting more button"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Quick Pick"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("MESSAGE_TEXT_LABEL"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();
        
		// Patient Pick
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting more button"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Patient Pick"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("PATIENTS_BED_LABEL"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();

		// Camera
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting more button"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Camera"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CAMERA_CAPTURE_BUTTON"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Send"))).click();
        

		

	}

}
