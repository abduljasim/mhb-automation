package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MHBmobileContacts extends MHBmobileLogin{
	public void mhbcontatcs() {
		// unfavorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Contacts']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Favorites' and ./parent::*[@text='CONTACTS_FAVORITES_BUTTON']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("CONTACT_CARD_ITEM_CELL"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTACT_DETAILS_FAVORITE_SWITCH']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Contacts']"))).click();
		
		// Favorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Contacts']"))).click();
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
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("TEXT_FIELD_INPUT"))).sendKeys("Automation - Send message via Contacts tab");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("TEXT_SUBMIT_BUTTON"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Texts"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Dashboard']"))).click();
		
		
	}

}
