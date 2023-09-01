package mhbmobile;

import org.testng.annotations.Test;

public class MHBmobileAutomation extends MHBmobileLogin {
	
	// we need to add more test cases here	
	@Test
	public void mhbmain() throws InterruptedException {
		// Dashboard tab	
		MHBmobileHome dashboard = new MHBmobileHome();
		dashboard.home();
		
		// Broadcast		
		MHBmobileBroadcast brdcst = new MHBmobileBroadcast();
		brdcst.mhbbroadcast();
		
		// Free Text	
		MHBmobileFreeText freetxt = new MHBmobileFreeText();
		freetxt.mhbfreetxt();
		
		// Group Text
		MHBmobileGroupText grptxt = new MHBmobileGroupText();
		grptxt.mhbgrouptext();
		
		// Re-write
		MHBmobilePatients patienttab = new MHBmobilePatients();
		patienttab.mhbpatients();
		
		// Contacts
		MHBmobileContacts contacttab = new MHBmobileContacts();
		contacttab.mhbcontatcs();
	}
	
}
