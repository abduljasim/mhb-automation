package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class MHBmobileContacts extends MHBmobileLogin{
	public void mhbcontatcs() {
		// unfavorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Contacts']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Favorites' and ./parent::*[@text='CONTACTS_FAVORITES_BUTTON']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OFFLINE' and ./parent::*[@text='Abdulrahman Jasim, 7 Units in 3 Hospitals, MH Admin']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTACT_DETAILS_FAVORITE_SWITCH']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Contacts']"))).click();
		
		// Favorite a contact
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Contacts']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Hospital' and ./parent::*[@text='CONTACTS_HOSPITAL_BUTTON']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='HOSPITAL_SELECTION_TABLE']/*[@text='UNIT_STATUS_CELL'])[2]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search Contacts in this Hospital']"))).sendKeys("Abdulrahman");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='search']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Abdulrahman Jasim']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTACT_DETAILS_FAVORITE_SWITCH']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='TAB_BAR_CONTACTS_ITEM']"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Favorites' and ./parent::*[@text='CONTACTS_FAVORITES_BUTTON']]"))).click();
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@placeholder='Search Contacts in Favorites']"))).sendKeys("Abdulrahman");
		new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Abdulrahman Jasim']"))).click();
		
		
		
	}

}
