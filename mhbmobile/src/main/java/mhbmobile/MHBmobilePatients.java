package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class MHBmobilePatients extends MHBGridOne {

		public void mhbpatients() {

			// Assigned Patient tab - Verify Patient Details - Search a patient
			try {
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search']"))).sendKeys("JASIM");
			new WebDriverWait(driver1, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
			new WebDriverWait(driver1, 20).until(ExpectedConditions.elementToBeClickable(By.id("PATIENTS_SEARCH_HOSPITALS_BUTTON"))).click();
			new WebDriverWait(driver1, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENTS_LIST_TABLE']/*[@text='PATIENTS_LIST_CELL'])[1]"))).click();
			new WebDriverWait(driver1, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Details']"))).click();
			driver1.findElement(By.xpath("//*[@text='PATIENT_DETAILS_AGE_DYNAMIC_LABEL']")).click();
			System.out.println("Patient Details Found");
			} catch(Exception e) {
				System.out.println("Patient Tab Wasn't Clicked");
			}
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("Patient"))).click();
			driver1.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));

			// Take a photo + Add a comment to the picture + upload + review then send broadcast to care team
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='cameraFontAwesome']"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("Take Photos"))).click();
			new WebDriverWait(driver1, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']"))).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new WebDriverWait(driver1, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_REVIEW_PHOTOS_BUTTON']"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Compose']"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PHOTO_COMMENT_VIEW_CONTROLLER_COMMENT_TEXT_VIEW']"))).sendKeys("Adding comment to the photo");
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("Done"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("PHOTO_VIEWER_COMMENT_EXPAND_INDICATOR"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("PHOTO_VIEWER_COMMENT_TEXT_VIEW"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Upload']"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PHOTO_VIEWER_SENSITIVITY_STANDARD_UPLOAD_ACTION']"))).click();
			
			System.out.println("Photo Uploaded with comment");

			// Take a photo + Delete it + cancel  // check on this
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='PATIENT_CAMERA_CELL']/*[@class='UIAImage'])[1]"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("Take Photos"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_CAPTURE_BUTTON']"))).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CAMERA_REVIEW_PHOTOS_BUTTON']"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("Delete"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_LONG_NO_TITLE_SUBMIT_BUTTON"))).click();
			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Cancel']"))).click();
			
			System.out.println("Photo Canceled!");
	
			// Assign & unassign patient
			driver1.executeScript("mobile: scroll", ImmutableMap.of("direction", "up"));

			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='PATIENT_ASSIGNED_SWITCH']"))).click();
			System.out.println("Patient Assigned/Unassigned Done");
			
			// Patient Send Broadcast to Care Team
			driver1.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
			try {
				new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='UIAView' and @height>0 and ./*[@class='UIAView'] and ./parent::*[@text='PATIENT_BROADCAST_CELL']]"))).click();
				new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='broadcast send button']"))).click();
				new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']"))).click();
				new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='dashboardTab']"))).click();
		    } catch (Exception e){
		    	System.out.println("No Care Team members assigned");
		    }
		    

			new WebDriverWait(driver1, 50).until(ExpectedConditions.elementToBeClickable(By.id("Dashboard"))).click();
		     
			System.out.println("Patient Tab Completed");
			
	        //log the data and savings
			try {
				TASCReportLogs.LogAutomationRun(9, "MH-CURE", 600);
			}catch (Exception e) {
				System.out.println("The TASC method could not be called");
			}
		    
			
		}
}
