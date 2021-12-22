package androidmhb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class AndroidMHBGroupText extends AndroidMHBLogin {
	public void androidmhbgrouptext()
	{
		
		// Adding testtwo & three
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Texts']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='messages_fab']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_filter']"))).click(); // Search the whole directory
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Search Directory']"))).click();

	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_mode_search_view']"))).sendKeys("TestTwo");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_selected_checkbox']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_mode_search_view']"))).sendKeys("TestThree");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_selected_checkbox']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_continue']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_edit_text']"))).sendKeys("Android Automation GroupText Text");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
		
		// Adding TestFour
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='More options']"))).click();
		driver.findElement(By.xpath("//*[@text='Group Details']")).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Add Contact']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_mode_search_view']"))).sendKeys("TestFour");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_selected_checkbox']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_continue']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_edit_text']"))).sendKeys("Android Automation Add Contact to GroupText");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
	    
		// Rename GroupText Name
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='More options']"))).click();
		driver.findElement(By.xpath("//*[@text='Group Details']")).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='group_details_group_name_edit_text']"))).sendKeys("Android Automation");
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_edit_text']"))).sendKeys("Android Automation Add Contact to GroupText");
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
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='TESTER, APRFR']"))).click();
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
               
		// Leave Group
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='More options']"))).click();
		driver.findElement(By.xpath("//*[@text='Group Details']")).click();
		// scroll screen down
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));		
		driver.findElement(By.xpath("//*[@text='LEAVE CONVERSATION']")).click();
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='YES']"))).click();
		System.out.println("TestOne Left the Group Text!");
		
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='TAB_BAR_DASHBOARD_ITEM']]"))).click();
        driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Logout']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGOUT']"))).click();
		System.out.println("Group Texting Finished Successfully!!!");

		
		
	}

}
