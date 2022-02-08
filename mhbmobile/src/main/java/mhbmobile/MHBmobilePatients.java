package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class MHBmobilePatients extends MHBmobileLogin {

		public void mhbpatients() {
			// Assigned Patient tab - Verify Patient Details
			if(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Patients"))).isDisplayed())
			{
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Patients"))).click();
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search']"))).sendKeys("JASIM");
				new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
				new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
				new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Details']"))).click();
				driver.findElement(By.xpath("//*[@text='PATIENT_DETAILS_AGE_DYNAMIC_LABEL']")).click();
				System.out.println("Patient Details Found");
				new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient']"))).click();
			}
			else
			{
				System.out.println("Patient tab not found.");
			}
		
			// Take a photo + Add a comment to the picture + upload + review then send broadcast to care team
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search']"))).sendKeys("JASIM");
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));	
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("PATIENT_CAMERA_CELL"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("Take Photos"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("CAMERA_REVIEW_PHOTOS_BUTTON"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Compose"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PHOTO_COMMENT_VIEW_CONTROLLER_COMMENT_TEXT_VIEW']"))).sendKeys("Adding comment to the picture");
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Done"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Upload"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("PHOTO_VIEWER_SENSITIVITY_STANDARD_UPLOAD_ACTION"))).click();

			
			// Take a photo + Delete it + cancel

			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("PATIENT_CAMERA_CELL"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("Take Photos"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("CAMERA_REVIEW_PHOTOS_BUTTON"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("Delete"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_LONG_NO_TITLE_SUBMIT_BUTTON"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cancel']"))).click();

	
			// Send a Text Message
			
			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "up"));
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Abdulrahman Jasim, 7 Units in 2 Hospitals, MH Admin']"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='MHContactTextContact']"))).click();
			if(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).isDisplayed())
			{
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();
			}
			else
			{
				new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();
			}
			
			// Send a Text Message in Assigned Unit
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Texts"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Patients"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Patients"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cancel' and @class='UIAStaticText']"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Assigned Units"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Search"))).sendKeys("JASIM");
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("search"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
			driver.findElement(By.id("Corp TestFour, 6 Units in 2 Hospitals, Nurse")).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Text"))).click();
			if(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).isDisplayed())
			{
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();
			}
			else
			{
				new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("texting send button"))).click();
			}
					
			System.out.println("Patient Tab Automation Passed");
		}
}
