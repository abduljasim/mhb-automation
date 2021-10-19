package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class MHBmobilePatients extends MHBmobileLogin {

		public void mhbpatients() {
			// Assigned Patient tab - Verify Patient Details
//			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
//			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search']"))).sendKeys("JASIM");
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Details']"))).click();
//			// Verify Patient detail - age
//			driver.findElement(By.xpath("//*[@text='PATIENT_DETAILS_AGE_DYNAMIC_LABEL']")).getText();
//			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient']"))).click();
//			
			// Take a photo + upload + send broadcast to care team
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search']"))).sendKeys("JASIM");
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
			driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));	
			driver.findElement(By.xpath("//*[@text='PATIENT_CAMERA_CELL']")).click();
			driver.findElement(By.xpath("//*[@XCElementType='XCUIElementTypeButton' and @label='Take Photos']")).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_REVIEW_PHOTOS_BUTTON']"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Upload']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PHOTO_VIEWER_SENSITIVITY_STANDARD_UPLOAD_ACTION']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Send Broadcast to Care Team']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='broadcast send button']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='Patients']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
			
			
			
			// Send it to Broadcast to Care Team by clicking on the name
			// click on send button
			
			// Click on patient's tab
			// Search for a patient- type in patient's name then click search
			// Click on patient's name
			// Scroll down and click on Camera
			// Take a photo then review it
			// Delete a photo by clicking on delete button
			// click Yes to submit
			// click cancel to get out of camera
			
			// Click on patient's tab
			// Search for a patient- type in patient's name then click search
			// Click on patient's name
			// Scroll down and click on Camera
			// Click on View photos
			// click on a photo
			// click Close
			
			// Assigned Units tab
			
			
			
			
			
			
		}
}
