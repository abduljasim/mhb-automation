package androidmhb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AndroidMHBBroadcast extends AndroidMHBLogin {

	public void androidmhbbroadcast() {

	        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Broadcasts']"))).click();
	        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='GROUPS']"))).click();

	//GROUP BROADCAST Anywhere

	        // FREE TEXT Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Auttest. Android Broadcasts Testing - Anywhere");
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();


	        // CANCEL Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Auttest. Android Broadcasts Testing - Anywhere");
	        driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();

	        // PATIENTS Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_action_button']")).click();
	        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']"))).click();
	        driver.findElement(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='I.T110 A']]]")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();    

	        // QUICK PICK Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_action_button']")).click();
	        driver.findElement(By.xpath("//*[@text='Quick Pick']")).click();
	        driver.findElement(By.xpath("//*[@text='Admission room remove']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        // URGENT Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts Urgent Testing - Anywhere");
	        driver.findElement(By.xpath("//*[@id='message_entry_urgent_button']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        // OVERRIDE Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts override to all hospital Testing - Anywhere");
	        driver.findElement(By.xpath("//*[@text='Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Hospital Only']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	        
	        // OVERRIDE Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts override to selected unit Testing - Anywhere");
	        driver.findElement(By.xpath("//*[@text='Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_expandable_list_indicator_icon']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        System.out.println("Finished from Anywhere group braodcast");
	//GROUP BROADCAST Hospital/All Units

	        // FREE TEXT Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Hospital/All Units']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts All units Testing");
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        // CANCEL Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Hospital/All Units']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Auttest. Android Broadcasts Testing - All Units");
	        driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();

	        // PATIENTS Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Hospital/All Units']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_action_button']")).click();
	        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']"))).click();
	        driver.findElement(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='I.T110 A']]]")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click(); 

	        // QUICK PICK Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Hospital/All Units']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_action_button']")).click();
	        driver.findElement(By.xpath("//*[@text='Quick Pick']")).click();
	        driver.findElement(By.xpath("//*[@text='Admission room remove']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();


	        // URGENT Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Hospital/All Units']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts Urgent Testing - All Units");
	        driver.findElement(By.xpath("//*[@id='message_entry_urgent_button']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();


	        // OVERRIDE Broadcasts Text to Anywhere
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Hospital/All Units']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts override to all Units Testing");
	        if(driver.findElement(By.xpath("//*[@text='HCA Corp Hosp 567']")).isDisplayed())
	        {
	        	driver.findElement(By.xpath("//*[@text='HCA Corp Hosp 567']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Anywhere']]]")).click();
		        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
		        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	        }
	        else
	        {
	        	driver.findElement(By.xpath("//*[@text='Anywhere']")).click();
	 	        driver.findElement(By.xpath("//*[@id='event_scope_expandable_list_indicator_icon']")).click();
	 	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	 	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	 	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	        }
	        
	        // OVERRIDE Broadcasts Text to selected unit
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Anywhere']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts override to selected unit Testing - All units");
	       if(driver.findElement(By.xpath("//*[@text='Anywhere']")).isDisplayed())
	       {
	    	    driver.findElement(By.xpath("//*[@text='Anywhere']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_expandable_list_indicator_icon']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
		        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
		        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	       }
	       else
	       {
	        	driver.findElement(By.xpath("//*[@text='HCA Corp Hosp 567']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Anywhere']]]")).click();
		        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
		        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	       }

	        System.out.println("Finished from Hospitals / All units group braodcast");

	//GROUP BROADCAST Selected Units

	        // FREE TEXT Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android GROUP BROADCAST Selected Units");
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        // CANCEL Broadcasts Text - Selected Unit
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Auttest. Android Broadcasts Testing Cancel - Selected Unit");
	        driver.findElement(By.xpath("//*[@contentDescription='Navigate up']")).click();

	        // PATIENTS Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_action_button']")).click();
	        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Patient Pick']"))).click();
	        driver.findElement(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='I.T110 A']]]")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click(); 

	        // QUICK PICK Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_action_button']")).click();
	        driver.findElement(By.xpath("//*[@text='Quick Pick']")).click();
	        driver.findElement(By.xpath("//*[@text='Admission room remove']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        // URGENT Broadcasts Text
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts Urgent Testing - Selected Unit");
	        driver.findElement(By.xpath("//*[@id='message_entry_urgent_button']")).click();
	        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();

	        // OVERRIDE Broadcasts Text - To Hospital Only
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts override to selected Unit Testing");
	        if(driver.findElement(By.xpath("//*[@text='HeART']")).isDisplayed())
	        {
	        	driver.findElement(By.xpath("//*[@text='HeART']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_expandable_list_indicator_icon']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Hospital Only']]]")).click();
		        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
		        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	        }
        
	        // OVERRIDE Broadcasts Text to selected unit
	        driver.findElement(By.xpath("//*[@text='Corp Test Users - Selected Unit']")).click();
	        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='HeART']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_entry_edit_text']")).sendKeys("Aut. Android Group Broadcasts override to selected Unit Testing");
	        if(driver.findElement(By.xpath("//*[@text='HeART']")).isDisplayed())
	        {
	        	driver.findElement(By.xpath("//*[@text='HeART']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_expandable_list_indicator_icon']")).click();
		        driver.findElement(By.xpath("//*[@id='event_scope_selection_radio_button' and ./parent::*[(./preceding-sibling::* | ./following-sibling::*)[@text='Anywhere']]]")).click();
		        driver.findElement(By.xpath("//*[@text='CONFIRM']")).click();
		        driver.findElement(By.xpath("//*[@id='message_entry_send_button']")).click();
	        }

	        System.out.println("Finished from selected unit group braodcast");

	// QUICK BROADCASTS
	        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='QUICK']"))).click();
	        //Send location 567
	        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Corp Test Message - Location 567']"))).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_location_dialog_edit_text']")).sendKeys("Room #123");
	        driver.findElement(By.xpath("//*[@text='DONE']")).click();
	        driver.findElement(By.xpath("//*[@text='SEND']")).click();
	        
	        //Cancel location 567
	        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Corp Test Message - Location 567']"))).click();
	        driver.findElement(By.xpath("//*[@id='broadcast_location_dialog_edit_text']")).sendKeys("Room #123");
	        driver.findElement(By.xpath("//*[@text='CANCEL']")).click();

	        //Send Patient 567
	        driver.findElement(By.xpath("//*[@text='Corp Test Message - Patient 567']")).click();
	        driver.findElement(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='I.T110 A']]]")).click();
	        driver.findElement(By.xpath("//*[@text='SEND']")).click();

	        //Cancel Patient 567
	        driver.findElement(By.xpath("//*[@text='Corp Test Message - Patient 567']")).click();
	        driver.findElement(By.xpath("//*[@contentDescription='PATIENTS_LIST_CELL' and ./*[./*[@text='I.T110 A']]]")).click();
	        driver.findElement(By.xpath("//*[@text='CANCEL']")).click();


	        //Send Quick Broadcast 567
	        driver.findElement(By.xpath("//*[@text='Corp Test Quick Broadcast 567']")).click();
	        driver.findElement(By.xpath("//*[@text='SEND']")).click();


	        //Cancel Quick Broadcast 567
	        driver.findElement(By.xpath("//*[@text='Corp Test Quick Broadcast 567']")).click();
	        driver.findElement(By.xpath("//*[@text='CANCEL']")).click();

	        // Exit Broadcasts
	        driver.findElement(By.xpath("//*[@contentDescription='TAB_BAR_DASHBOARD_ITEM']")).click();
	        System.out.println("Finished from Broadcat Groups and Quick!");


	}

}
