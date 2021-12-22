package androidmhb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class AndroidMHBContacts extends AndroidMHBLogin {
	public void androidmhbcontacts()
	{
		// favorite/unfavorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='TAB_BAR_CONTACTS_ITEM']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_filters_fragment_favorites_filter']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@contentDescription='CONTACT_CARD_ITEM_CELL' and ./*[@text='Abdulrahman Jasim']] and ./*[@class='android.widget.LinearLayout']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_details_add_to_favorites_switch']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
				
		// Favorite/unfavorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_filters_fragment_hospital_filter']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='HCA Corp Hosp 567']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@contentDescription='CONTACT_CARD_ITEM_CELL' and ./*[@text='Abdulrahman Jasim']] and ./*[@class='android.widget.LinearLayout']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_details_add_to_favorites_switch']"))).click();
		
		// Send text to a favorite contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("contact_details_text_button"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OK']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_edit_text']"))).sendKeys("Android Automation - Send message via Contacts tab");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='message_entry_send_button']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='TAB_BAR_CONTACTS_ITEM']]"))).click();

		
		// Search Directory
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Search All Contacts']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search_src_text']"))).sendKeys("Jasim");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='CONTACT_CARD_ITEM_CELL']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_details_add_to_favorites_switch']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='TAB_BAR_CONTACTS_ITEM']]"))).click();
		
		// My Units - Karolyn
		// Search for a specific unit - 
		//if it displays in the search list click on it - Open it and unfavor it
		//else print out the unit does not exists under My Units
		
		// Any Units - Karolyn
		// Search for a specific unit - 
		//if it displays in the search list click on it - Open it and unfavor it
		//else print out the unit does not exists under My Units
		
		// Specialty - Karolyn
		// Click on Specialties and open 567 hospital
		// Search for any user and send a text message to that contact
		// then add that contact to the favorite
		
	
				
		// Dynamic Roles By Hospital
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_filters_fragment_dr_hospital_filter']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='HCA Corp Hosp 567']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Abdul Dynamic Role Test 1']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='dynamic_role_details_add_to_favorites_switch']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='TAB_BAR_CONTACTS_ITEM']]"))).click();

		// Dynamic Roles By unFavorite a role	
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='contact_filters_fragment_dr_favorites_filter']"))).click();
	    new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Abdul Dynamic Role Test 1']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='dynamic_role_details_add_to_favorites_switch']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='icon' and ./parent::*[@contentDescription='TAB_BAR_CONTACTS_ITEM']]"))).click();

		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Dashboard']"))).click();
		driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Logout']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGOUT']"))).click();
        
		System.out.println("Android Contacts testing has finished successfully");
			
	}

}
