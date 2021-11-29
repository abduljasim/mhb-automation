package mhbmobile;

import org.testng.annotations.Test;

public class MHBmobileAutomation extends MHBmobileLogin {

	@Test
	public void mhbmain() {
//		MHBmobileHome dashboard = new MHBmobileHome();
//		dashboard.home();
	
//		MHBmobileBroadcast brdcst = new MHBmobileBroadcast();
//		brdcst.mhbbroadcast(); //~5 min
	
//		MHBmobileFreeText fretxt = new MHBmobileFreeText();
//		fretxt.mhbfreetxt(); //~2.5
		
//		MHBmobileGroupText grptxt = new MHBmobileGroupText();
//		grptxt.mhbgrouptext(); 
		
		MHBmobilePatients patienttab = new MHBmobilePatients();
		patienttab.mhbpatients();
		
//		MHBmobileContacts contacts = new MHBmobileContacts();
//		contacts.mhbcontatcs();
		
	}

}
