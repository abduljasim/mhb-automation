package androidmhb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;

public class AndroidMHBDashboard extends AndroidMHBLogin {

	public void androidmhbhome() {
		
		// =============karolyn============
		// Test login - Invalid username
		// Test login = Invalid password
		// ===== end ======================
		// Change status to Busy
		 if( new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Available']"))).isDisplayed()) 
	       {
	    	   System.out.println("User status Available - Change it to Busy");
	    	   driver.findElement(By.xpath("//*[@text='Available']")).click();
	    	   driver.findElement(By.xpath("//*[@text='Available']")).click();
	    	   driver.findElement(By.xpath("//*[@text='Busy']")).click();
	    	   driver.findElement(By.xpath("//*[@id='action_done']")).click();
	       } 
		 else if(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Busy']"))).isDisplayed())
	       {
			   System.out.println("User status Busy - Change it to Available");
	    	   driver.findElement(By.xpath("//*[@text='Busy']")).click();
	    	   driver.findElement(By.xpath("//*[@text='Busy']")).click();
	    	   driver.findElement(By.xpath("//*[@text='Available']")).click();
	    	   driver.findElement(By.xpath("//*[@id='action_done']")).click();
	       }
		 
		 // Set a Custom Message Keep Message on Logout
		 if(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Busy']]"))).isDisplayed())
		 {
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Busy']]"))).click();
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='csm_entry']"))).clear();
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='csm_entry']"))).sendKeys("Android Automation Testing Status Busy");
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_done']"))).click();
		 }
		 else if(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Available']"))).isDisplayed())
		 {
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Available']"))).click();
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='csm_entry']"))).clear();
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='csm_entry']"))).sendKeys("Android Automation Testing Status Available");
			 new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_done']"))).click();
		 }

	     
	     // Assign units
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Assigned Units']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='EDIT UNITS' and (./preceding-sibling::* | ./following-sibling::*)[@text='COCQA2']]"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='is_selected' and (./preceding-sibling::* | ./following-sibling::*)[@text='CHEMOTHERAPY']]"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='action_done']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
	     
	     // Dynamic Roles
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='android.widget.LinearLayout' and ./*[@text='Dynamic Roles']]"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='RT']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='dynamic_role_instance_assignment_switch' and (./preceding-sibling::* | ./following-sibling::*)[@text='RT J.7W 1 HCA Corp Hosp 567']]"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONFIRM']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='OK']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='More']"))).click();
	     
	     // More - User Profile
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='User Profile']"))).click();
	     if(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='corpsvctst1']"))).isDisplayed())
	     {
	    	 System.out.println("User Details Found");
	     }
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
     
	     // More - About
//	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='About']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='MH-CURE']"))).click();
	     System.out.println("Application name found!");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
  
	     // More - Terms and Conditions
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Terms And Conditions']"))).click();
	     System.out.println("Terms and Conditions!");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
	     
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     
	     // More - Uploading Logs
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Upload All Logs']"))).click();
	     System.out.println("Uploading Logs Done");
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@contentDescription='Navigate up']"))).click();
	     
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     
	     // Lock
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Lock']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='1']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='2']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='3']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='4']"))).click();
	     
	     // Lock - Forgot Password
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Lock']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Forgot PIN?']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='YES']"))).click();
	        driver.findElement(By.id("login_screen_username_text")).sendKeys("corpsvctst1");
	        driver.findElement(By.id("login_screen_password_text")).sendKeys("Enabled1");
	        driver.findElement(By.id("login_screen_login_button")).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='CONTINUE']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='1']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='2']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='3']"))).click();
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='4']"))).click();
	     
	     if(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Verify your new PIN']"))).isDisplayed())
	     {
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='1']"))).click();
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='2']"))).click();
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='3']"))).click();
		     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='4']"))).click();
	     }
	     
	     //check if user logged in
	     if(new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Corp TestOne']"))).isDisplayed())
	     {
	    	 System.out.println("Password reset finished");
	     }
	     
	     driver.executeScript("mobile: scroll", ImmutableMap.of("direction", "down"));
	     // Logout
	     new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Logout']"))).click();
	     System.out.println("Android Dashboard testing has Finished successfully");

	}

}
