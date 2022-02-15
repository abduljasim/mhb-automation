package mhbmobile;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class MHBmobileAutomation extends MHBmobileLogin {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest home,broadcasttest,mhbfreetxt,mhbgrouptext,mhbpatients,mhbcontatcs;
	
	@BeforeSuite
	public void setup() {
		htmlReporter = new ExtentSparkReporter("mhbReport.html");
		// create ExtentReports and attach reporter(s)
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
		
	@Test
	public void mhbmain() throws InterruptedException {
		// Dashboard tab
		home = extent.createTest("MHB Dashboard Testing", "Validate all elements on Dashbaord");
		home.log(Status.INFO, "Dashboard - Starting test cases");
		
		MHBmobileHome dashboard = new MHBmobileHome();
		dashboard.home();
		
		// Broadcast
		broadcasttest = extent.createTest("MHB Broadcast Testing", "Testing Group and Quick Broadcast");
		broadcasttest.log(Status.INFO, "Braodcast - Starting test cases");
		
		MHBmobileBroadcast brdcst = new MHBmobileBroadcast();
		brdcst.mhbbroadcast();
		
		// Free Text
		mhbfreetxt = extent.createTest("MHB Free Text Testing", "Testing Free Text");
		mhbfreetxt.log(Status.INFO, "Free Text - Starting test cases");
		
		MHBmobileFreeText freetxt = new MHBmobileFreeText();
		freetxt.mhbfreetxt();
		
		// Group Text
		mhbgrouptext = extent.createTest("MHB Group Text Testing", "Testing Group Text");
		mhbgrouptext.log(Status.INFO, "Group Text - Starting test cases");
		
		MHBmobileGroupText grptxt = new MHBmobileGroupText();
		grptxt.mhbgrouptext();
		
		// Patient
		mhbpatients = extent.createTest("MHB Patients Testing", "Testing Patients Tab");
		mhbpatients.log(Status.INFO, "Patients Tab - Starting test cases");
		
		MHBmobilePatients patienttab = new MHBmobilePatients();
		patienttab.mhbpatients();
		
		// Contacts
		mhbcontatcs = extent.createTest("MHB Contacts Testing", "Testing Contacts Tab");
		mhbcontatcs.log(Status.INFO, "Contacts Tab - Starting test cases");
		
		MHBmobileContacts contacttab = new MHBmobileContacts();
		contacttab.mhbcontatcs();
	}

	@AfterMethod
	public void getResult(ITestResult result)
	{
	    if(result.getStatus() == ITestResult.FAILURE) {
	        home.log(Status.FAIL,
	                MarkupHelper.createLabel(result.getName()
	                        + " Test case FAILED due to below issues:",
	                        ExtentColor.RED));
	        home.fail(result.getThrowable());
	    }
	    else
	    	 if (result.getStatus() == ITestResult.SUCCESS) {
	    	        home.log(
	    	                Status.PASS,
	    	                MarkupHelper.createLabel(result.getName()
	    	                        + " Test Case PASSED", ExtentColor.GREEN));
	    	    }

	}
	
	@AfterSuite
	public void tearDown() {
		
		// calling flush writes everything to the log file
		home.info("Dashboard Test Completed");
        extent.flush();
	}
}
