package mhbmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MHBmobileBroadcast extends MHBmobileLogin {

	public void mhbbroadcast() {

        if(new WebDriverWait(driver, 90).until(ExpectedConditions.elementToBeClickable(By.id("Broadcasts"))).isDisplayed())
        {
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(By.id("Broadcasts"))).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("TAB_BAR_PATIENTS_ITEM")));
        driver.findElement(By.xpath("//*[@text='Groups']")).click();
        }else
        {
        System.out.println("Restart");
        }
//GROUP BROADCAST Anywhere

        // FREE TEXT Broadcasts Text
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(By.id("TAB_BAR_PATIENTS_ITEM")));
        driver.findElement(By.id("Corp Test Users - Anywhere")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("AUTO-DIGI Broadcasts Testing - Anywhere");
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // CANCEL Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Anywhere")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("AUTO-DIGI Broadcasts Testing - Cancel");
        driver.findElement(By.id("Cancel")).click();

        // PATIENTS Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Anywhere")).click();
        driver.findElement(By.id("broadcast more button")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("TAB_BAR_PATIENTS_ITEM")));
        driver.findElement(By.xpath("//*[@id='Patients']")).click();
        driver.findElement(By.id("PATIENTS_NAME_LABEL")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // QUICK PICK Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Anywhere")).click();
        driver.findElement(By.id("broadcast more button")).click();
        driver.findElement(By.id("Quick Pick")).click();
        driver.findElement(By.id("MESSAGE_TEXT_LABEL")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // URGENT Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Anywhere")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcasts Urgent Testing");
        driver.findElement(By.id("broadcast urgent button")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // OVERRIDE Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Anywhere")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast OVERRIDE Text");
        driver.findElement(By.id("BROADCAST_COMPOSE_RECIVER_BUTTON")).click();
        driver.findElement(By.id("Anywhere")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

//GROUP BROADCAST Hospital/All Units

        // FREE TEXT Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Hospital/All Units")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast Hospitals All Units");
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // CANCEL Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Hospital/All Units")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast Hospitals All Units-cancel");
        driver.findElement(By.id("Cancel")).click();

        // PATIENTS Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Hospital/All Units")).click();
        driver.findElement(By.id("broadcast more button")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("TAB_BAR_PATIENTS_ITEM")));
        driver.findElement(By.xpath("//*[@id='Patients']")).click();
        driver.findElement(By.id("PATIENTS_NAME_LABEL")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // QUICK PICK Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Hospital/All Units")).click();
        driver.findElement(By.id("broadcast more button")).click();
        driver.findElement(By.id("Quick Pick")).click();
        driver.findElement(By.id("MESSAGE_TEXT_LABEL")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // URGENT Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Hospital/All Units")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast All units URGENT Text");
        driver.findElement(By.id("broadcast urgent button")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // OVERRIDE Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Hospital/All Units")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Broadcasts OVERRIDE Group Broadcasts Text");
        driver.findElement(By.id("BROADCAST_COMPOSE_RECIVER_BUTTON")).click();
        driver.findElement(By.id("Hospital Only")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

//GROUP BROADCAST Selected Units

        // FREE TEXT Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Selected Unit")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation GROUP BROADCAST Selected Units");
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // Testing CANCEL Broadcasts Text - Selected Unit
        driver.findElement(By.id("Corp Test Users - Selected Unit")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast CANCEL Broadcasts Text - Selected Unit");
        driver.findElement(By.id("Cancel"));

        // PATIENTS Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Selected Unit")).click();
        driver.findElement(By.id("broadcast more button")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("TAB_BAR_PATIENTS_ITEM")));
        driver.findElement(By.xpath("//*[@id='Patients']")).click();
        driver.findElement(By.id("PATIENTS_NAME_LABEL")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // QUICK PICK Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Selected Unit")).click();
        driver.findElement(By.id("broadcast more button")).click();
        driver.findElement(By.id("Quick Pick")).click();
        driver.findElement(By.id("MESSAGE_TEXT_LABEL")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // URGENT Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Selected Unit")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast URGENT Text - selected unit");
        driver.findElement(By.id("broadcast urgent button")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();

        // OVERRIDE Broadcasts Text
        driver.findElement(By.id("Corp Test Users - Selected Unit")).click();
        driver.findElement(By.id("BROADCASTS_GROUPS_CELL")).sendKeys("Automation Group Broadcast Override Text - selected unit");
        driver.findElement(By.id("BROADCAST_COMPOSE_RECIVER_BUTTON")).click();
        driver.findElement(By.id("Hospital Only")).click();
        driver.findElement(By.id("broadcast send button")).click();
        driver.findElement(By.id("DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON")).click();



// QUICK BROADCASTS
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.id("Quick")));
        // CORP Test Message - Location 567
        driver.findElement(By.id("Quick")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("Corp Test Message - Location 567")));
        driver.findElement(By.id("Corp Test Message - Location 567")).click();
        driver.findElement(By.xpath("//*[@accessibilityLabel='DIALOGUE_INPUT_TEXT_INPUT']")).sendKeys("Room #123");
        driver.findElement(By.xpath("//*[@text='DIALOGUE_INPUT_SUBMIT_BUTTON']")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_LONG_NO_TITLE_SUBMIT_BUTTON']")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']")).click();

        // CANCEL CORP Test Message - Location 567
        driver.findElement(By.xpath("//*[@text='Corp Test Message - Location 567']")).click();
        driver.findElement(By.xpath("//*[@accessibilityLabel='DIALOGUE_INPUT_TEXT_INPUT']")).sendKeys("Room #123");
        driver.findElement(By.xpath("//*[@text='DIALOGUE_INPUT_CANCEL_BUTTON']")).click();

        // CORP Test Message - Patient 567
        driver.findElement(By.xpath("//*[@text='Corp Test Message - Patient 567']")).click();
        driver.findElement(By.id("PATIENTS_NAME_LABEL")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_LONG_NO_TITLE_SUBMIT_BUTTON']")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']")).click();

        // CANCEL CORP Test Message - Patient 567
        driver.findElement(By.xpath("//*[@text='Corp Test Message - Patient 567']")).click();
        driver.findElement(By.id("PATIENTS_NAME_LABEL")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_LONG_NO_TITLE_CANCEL_BUTTON']")).click();

        // CORP Test Quick Broadcast 567
        driver.findElement(By.xpath("//*[@text='Corp Test Message - Patient 567']")).click();
        driver.findElement(By.xpath("//*[@text='Corp Test Quick Broadcast 567']")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_LONG_NO_TITLE_SUBMIT_BUTTON']")).click();
        driver.findElement(By.xpath("//*[@text='DIALOGUE_SHORT_TITLE_SUBMIT_BUTTON']")).click();

        // Exit Broadcasts
        driver.findElement(By.xpath("//*[@text='DASHBOARD_PAGE_LABEL']")).click();
       // new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(By.id("//*[@text='Patients']")));

	}

}
