package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class MHBmobileContacts extends MHBmobileLogin{
	public void mhbcontatcs() {
		// unfavorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Favorites' and ./parent::*[@text='CONTACTS_FAVORITES_BUTTON']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACT_CARD_ITEM_CELL"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTACT_DETAILS_FAVORITE_SWITCH']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		
		// Favorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Hospital' and ./parent::*[@text='CONTACTS_HOSPITAL_BUTTON']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='HOSPITAL_SELECTION_TABLE']/*[@text='UNIT_STATUS_CELL'])[2]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search Contacts in this Hospital']"))).sendKeys("Abdulrahman");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACT_CARD_ITEM_CELL"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTACT_DETAILS_FAVORITE_SWITCH']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='TAB_BAR_CONTACTS_ITEM']"))).click();

		
		// Send text
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACTS_FAVORITES_BUTTON"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACT_CARD_ITEM_CELL"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACT_DETAILS_TEXT_BUTTON"))).click();
		
		if(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).isDisplayed())
		{
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("TEXT_FIELD_INPUT"))).sendKeys("Automation - Send message via Contacts tab");
		}
		else
		{
			new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("TEXT_FIELD_INPUT"))).sendKeys("Automation - Send message via Contacts tab");
		}
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("TEXT_SUBMIT_BUTTON"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Texts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Dashboard']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		
		// Contacts Details
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click(); 
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("My Units"))).click();		
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACTS_LIST_TABLE"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Assigned Units"))).isDisplayed();
		System.out.println("Assigned Unit Details Found");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		
		// Contacts Status
		 new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		 new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Any Unit"))).click();
		 new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='HOSPITAL_SELECTION_TABLE']/*/*[@accessibilityLabel='HOSPITAL_SELECTION_LABEL'])[2]"))).click();
		 new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='HOSPITAL_SELECTION_TABLE']/*[@text='UNIT_STATUS_CELL'])[1]"))).click();
		 new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACTS_LIST_TABLE"))).click();

		 if( new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("AVAILABLE"))).isDisplayed()) 
	       {
	    	   System.out.println("Contact Status is Available");
	       } 
	     else {
	    	 System.out.println("Contact Status either Busy or Offline");
	     }
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		
		// Dynamic Roles By Hospital and Favorite
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DYNAMIC_ROLES_HOSPITAL_BUTTON"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("HOSPITAL_SELECTION_TABLE"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Abdul Dynamic Role Test 1"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='DYNAMIC_ROLE_TOGGLE_FAVORITE_BUTTON']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Dy. Roles"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DYNAMIC_ROLES_FAVORITE_BUTTON"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Abdul Dynamic Role Test 1, HCA Corp Hosp 567, Abdulrahman Jasim"))).click();
		
		if(new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Abdulrahman Jasim"))).isDisplayed())
		{
			System.out.println("This Dynamic Role is assigned to Abdul");
		}
		else if (new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Charge Nurse COCQA1A - J.7W, HCA Corp Hosp 567, Hennig Kim"))).isDisplayed())
		{
			System.out.println("This Dynamic Role is assigned to Hennig Kim");
		}else
		{
			System.out.println("The Dynamic Roles is assigned to someone else.");
		}
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Dy. Roles"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Contacts"))).click();
		
	}

}
