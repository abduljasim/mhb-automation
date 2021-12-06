package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class MHBmobileHome extends MHBmobileLogin {
	public void home() {
		// Change status to Busy
		 if( new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Available"))).isDisplayed()) 
	       {
	    	   System.out.println("User status Available - Change it to Busy");
	    	   driver.findElement(By.id("Available")).click();
	    	   driver.findElement(By.id("PRESENCE_STATUS_CURRENT_STATUS_LABEL")).click();
	    	   driver.findElement(By.id("PRESENCE_STATUS_BUSY_BUTTON")).click();
	    	   driver.findElement(By.id("Done")).click();
	       } 
		 else 
	       {
		  //So on a shared device, that busy works the same way. If you log out while on busy and back in, it resets to available.
	    	   System.out.println("User status is busy");
	       }
		 
		 // Set a Custom Message Keep Message on Logout
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_PRESENCE_CELL"))).click();
		 // Add condition to check if the switch is already on - in to do list
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PRESENCE_CUSTOM_MESSAGE_SWITCH"))).click();
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PRESENCE_QUICK_PICK_BUTTON"))).click();
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("MESSAGE_TEXT_LABEL"))).click();
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PRESENCE_STATUS_LOGOUT_SWITCH"))).click();
		 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Done"))).click();
		  
	     
	     // Assign units
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_UNIT_CELL"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("ASSIGNED_UNIT_EDIT_BUTTON"))).click();
	     if( new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("UNASSIGNED_UNIT_SECTION_HEADER_LABEL"))).isDisplayed()) 
	       {
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("UNIT_SELECTION_BUTTON"))).click();
	       } 
		 else 
	       {
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("UNIT_SELECTION_BUTTON"))).click();
	       }
	     

	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("UNIT_DONE_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_PAGE_LABEL"))).click();
	     
	     // Dynamic Roles
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_DR_CELL"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DR_LIST_CELL"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DR_INSTANCE_SELECTION_SWITCH"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_LONG_TITLE_SUBMIT_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DR_HEADING_LABEL"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_PAGE_LABEL"))).click();
	     
	     // More 
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("More"))).click();
	     
	     // Eye Chart
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Charts"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Eyechart"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("CHART_VIEW"))).click();
	     System.out.println("Eye Chart Found");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("CHARTS_HEADING_LABEL"))).click();
	     // Vein Chart
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Common Peripheral Veins"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("CHART_VIEW"))).click();
	     System.out.println("Vein Chart Found");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("CHARTS_HEADING_LABEL"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("More"))).click();
	     // User Profile
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("User Profile"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("corpsvctst1"))).click();
	     System.out.println("User Profile found");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("More"))).click();
	     // Sounds
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Sounds"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("SOUNDS_RINGTONE_LABEL"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("App Default"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Save"))).click();
	     System.out.println("Ringtone Sounds found");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Normal Text Tone"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("App Default"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Save"))).click();
	     System.out.println("Normal Text Tone Sounds found");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Urgent Text Tone"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Anticipate"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Save"))).click();
	     System.out.println("Uregetn Text Tone Sounds found");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("More"))).click();
	     
	     // Upload All Logs
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Upload All Logs"))).click();
	     new WebDriverWait(driver, 100).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
	     System.out.println("Upload logs is done");
	     
	     
	     // About
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("About"))).click();
	     if( new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("MH-CURE"))).isDisplayed()) 
	       {
	    	   System.out.println("App Name = MH-CURE Found");
	       } 
	     else {
	    	 System.out.println("Are you sure you are testing a correct App?");
	     }
	     
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("More"))).click();
	     
	     // Terms and Conditions
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Terms and Conditions"))).click();
	     if( new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("TERMS"))).isDisplayed()) 
	       {
	    	   System.out.println("Terms & Conditions Found");
	       } 
	     else {
	    	 System.out.println("Are you sure you are testing a correct App?");
	     }
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("More"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DASHBOARD_PAGE_LABEL"))).click();
	     
	     // Lock screen
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("Lock"))).click();

	     // enter passcode
	     new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("1"))).click();
	     new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("2"))).click();
	     new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("3"))).click();
	     new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("4"))).click();
	     
	     // forgot PIN
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Lock"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Forgot PIN?"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_LONG_TITLE_SUBMIT_BUTTON"))).click();
	     driver.findElement(By.id("LOGIN_USER_INPUT")).sendKeys("corpsvctst1");
	     driver.findElement(By.id("LOGIN_PW_INPUT")).sendKeys("Enabled1");
	     driver.findElement(By.id("Login")).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("SET_PIN_CONTINUE_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_1_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_2_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_3_BUTTON"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_4_BUTTON"))).click();
	     
	     if( new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Verify your PIN"))).isDisplayed()) 
	       {
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_1_BUTTON"))).click();
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_2_BUTTON"))).click();
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_3_BUTTON"))).click();
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("PIN_4_BUTTON"))).click();
	       } 
	     else {
	    	 System.out.println("Try it again-This will be modified later");
	     }
	} //end of method

}

