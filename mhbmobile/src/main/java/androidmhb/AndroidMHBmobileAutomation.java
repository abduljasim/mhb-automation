package androidmhb;

import org.testng.annotations.Test;

public class AndroidMHBmobileAutomation extends AndroidMHBLogin {
	
	@Test
	public static void androidmhbmain() {
//		MHBmobileHome dashboard = new MHBmobileHome();
//		dashboard.home();
	
		AndroidMHBBroadcast abrdcst = new AndroidMHBBroadcast();
		abrdcst.androidmhbbroadcast(); 
	
//		MHBmobileFreeText afretxt = new MHBmobileFreeText();
//		afretxt.mhbfreetxt(); //~2.5
		
//		MHBmobileGroupText agrptxt = new MHBmobileGroupText();
//		agrptxt.mhbgrouptext(); 
		
//		MHBmobilePatients apatienttab = new MHBmobilePatients();
//		apatienttab.mhbpatients();
		
//		MHBmobileContacts acontacts = new MHBmobileContacts();
//		acontacts.mhbcontatcs();
		

	}

}
