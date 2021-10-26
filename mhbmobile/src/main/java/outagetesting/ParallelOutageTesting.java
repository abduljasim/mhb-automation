package outagetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ParallelOutageTesting extends ParallelLogin{
	
	
	@Test
	public void usertest1() {
		//System.out.println("I am inside test 1 | "+Thread.currentThread().getId());
		
		//get the quick link then iterate through the list
		driver.findElement(By.xpath("//*[@accessibilityLabel='LOGIN_USER_INPUT']")).sendKeys("cwd-1974s");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Login"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='LOGIN_USER_INPUT']"))).sendKeys("corpgenmhbtst1");
        driver.findElement(By.xpath("//*[@text='LOGIN_PW_INPUT']")).sendKeys("Quality13");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGIN_SUBMIT_BUTTON']"))).click();
        
        // Broadcast testing
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Broadcasts']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Groups']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='BROADCASTS_GROUPS_NAME_LABEL']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='BROADCAST_COMPOSE']/*[@class='UIAView' and @height>0])[2]"))).sendKeys("Automation Broadcasts Outage Testing - Testbot1");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("broadcast send button"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
        
	}
	
	@Test
	public void usertest2() {
		//System.out.println("I am inside test 2 | "+Thread.currentThread().getId());
		driver.findElement(By.xpath("//*[@accessibilityLabel='LOGIN_USER_INPUT']")).sendKeys("cwd-1974s");
        driver.findElement(By.id("Login")).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Login"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='LOGIN_USER_INPUT']"))).sendKeys("corpgenmhbtst2");
        driver.findElement(By.xpath("//*[@text='LOGIN_PW_INPUT']")).sendKeys("Quality13");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='LOGIN_SUBMIT_BUTTON']"))).click();
        
        // Broadcast testing
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Broadcasts']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Groups']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@accessibilityLabel='BROADCASTS_GROUPS_NAME_LABEL']"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@text='BROADCAST_COMPOSE']/*[@class='UIAView' and @height>0])[2]"))).sendKeys("Automation Broadcasts Outage Testing - Testbot2");
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("broadcast send button"))).click();
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON"))).click();
	}


}
 