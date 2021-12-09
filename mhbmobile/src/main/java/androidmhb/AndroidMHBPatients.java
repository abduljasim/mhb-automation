package androidmhb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class AndroidMHBPatients extends AndroidMHBLogin {
	public void androidmhbpatients() {
		// Assigned Patient tab - Verify Patient Details
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='toolbar_action_search']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search_src_text']"))).sendKeys("TEST");
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='J.700 11']]]"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='patient_details_patient_details_dropdown_icon']"))).click();
		driver.findElement(By.xpath("//*[@id='patient_details_patient_details_dropdown']")).click();
		System.out.println("Patient Details Found");
		
		// Send Broadcast to patient care team
		driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND BROADCAST TO PATIENT CARE TEAM']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Collapse']"))).click();
	
		// Send patient Information to Dynamic Care Team - Quick and Patient Picks and Camera
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='toolbar_action_search']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search_src_text']"))).sendKeys("Jasim");
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='J.700 29']]]"))).click();	
		new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Abdulrahman Jasim']"))).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Text']"))).click();
		
		if(new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OK']"))).isDisplayed())
		{
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OK']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_urgent_button']"))).click(); // urgent
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click(); 
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Quick Pick']"))).click(); // Quick Pick
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ABG DESKTOP']"))).click(); 
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']"))).click(); // Patient Pick
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='I.T110 A']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Camera']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='camera_preview_capture']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
		}
		else
		{
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_urgent_button']"))).click(); // urgent
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click(); 
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Quick Pick']"))).click(); // Quick Pick
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ABG DESKTOP']"))).click(); 
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']"))).click(); // Patient Pick
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='I.T110 A']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Camera']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='camera_preview_capture']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND']"))).click();
			new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
		}

		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Dashboard']"))).click();
		

		
		// Assign or unassign Patient To Me
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patients']"))).click();
		driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ALL IN UNITS']"))).click();
		if(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='J.700 30']"))).isDisplayed())
		{
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='J.700 30']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='patient_details_assignment_switch']"))).click();
		}
		else
		{
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ALL ASSIGNED']"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='J.700 30']"))).click();
			new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='patient_details_assignment_switch']"))).click();
		}
		

		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Dashboard']"))).click();
		driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Logout']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGOUT']"))).click();
        
		System.out.println("Android Patients testing has finished successfully");
			
						
	}

}
