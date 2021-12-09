package androidmhb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class AndroidMHBFreeText extends AndroidMHBLogin {

	public void androidmhbfreetxt() {
		// 1:1 Text
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Texts']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='messages_fab']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_mode_search_view']"))).sendKeys("TestTwo");
	 
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_selected_checkbox']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_continue']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_edit_text']"))).sendKeys("Android Automation Free 1:1 Text");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
        
		// Urgent 1:1 text
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_urgent_button']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_edit_text']"))).sendKeys("Android Automation urgent 1:1 Text");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();

		// Quick Pick
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Quick Pick']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='ABG DESKTOP']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
        
		// Patient Pick
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='J.700 11']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();

		// Camera - Send Photo
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Camera']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='camera_preview_capture']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND']"))).click();
        
		// Camera - Retake Photo
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_action_button']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Camera']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='camera_preview_capture']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='RETAKE']"))).click();
        System.out.println("Retake a Photo");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='camera_preview_capture']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND']"))).click();
        
        
        // Text - Send patient to Care team
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='More options']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='View Contact']"))).click();
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='I.800 1']]]"))).click();
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND BROADCAST TO PATIENT CARE TEAM']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='SEND']"))).click();
        
        
        
        // Back to Dashboard
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='TAB_BAR_DASHBOARD_ITEM']]"))).click();
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Logout']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGOUT']"))).click();
        System.out.println("Free 1:1 Texting on Android has Finished successfully");
        	

	}
}
