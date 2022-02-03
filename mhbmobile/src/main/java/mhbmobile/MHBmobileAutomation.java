package mhbmobile;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.testng.Assert;



public class MHBmobileAutomation extends MHBmobileLogin {


	@Test
	public void mhbmain() {
		// create a toggle for the given test, adds all log events under it
		//ExtentTest dashboardreport = extent.createTest("Dashboard Testing", "iOS Dashboard Test Reprot");
	//	dashboardreport.log(Status.INFO, "Dashboard Testing Started");

//		MHBmobileHome dashboard = new MHBmobileHome();
//		dashboard.home();
//		dashboardreport.log(Status.PASS, "Dashboard Testing Passed");
//		email = new ExtentEmailReporter("email.html");
//		email.config().setDocumentTitle("MyReport");
		MHBmobileBroadcast brdcst = new MHBmobileBroadcast();
		brdcst.mhbbroadcast(); //~5 min

		//		MHBmobileFreeText fretxt = new MHBmobileFreeText();
		//		fretxt.mhbfreetxt(); //~2.5

		//		MHBmobileGroupText grptxt = new MHBmobileGroupText();
		//		grptxt.mhbgrouptext(); 

		//		MHBmobilePatients patienttab = new MHBmobilePatients();
		//		patienttab.mhbpatients();

		//		MHBmobileContacts contacts = new MHBmobileContacts();
		//		contacts.mhbcontatcs();
		//		
	}

//	@AfterSuite
//	public void reportTeardown()
//	{
//		// Calling flush writes everything to the log file
//		extent.flush();
//	}
}
