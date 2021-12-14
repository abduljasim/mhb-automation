package androidmhb;

import org.testng.annotations.Test;

public class AndroidMHBmobileAutomation extends AndroidMHBLogin {
	
	@Test
	public static void androidmhbmain() {
//		AndroidMHBDashboard adashboard = new AndroidMHBDashboard();  //done
//		adashboard.androidmhbhome();test
	
//		AndroidMHBBroadcast abrdcst = new AndroidMHBBroadcast(); //done
//		abrdcst.androidmhbbroadcast(); 
	
//		AndroidMHBFreeText afreetxt = new AndroidMHBFreeText();  //done
//		afreetxt.androidmhbfreetxt(); 
		
		AndroidMHBGroupText agrptxt = new AndroidMHBGroupText();
		agrptxt.androidmhbgrouptext(); 
		
//		AndroidMHBPatients apatienttab = new AndroidMHBPatients(); //done
//		apatienttab.androidmhbpatients();
		
//		MHBmobileContacts acontacts = new MHBmobileContacts();
//		acontacts.mhbcontatcs();
//		

	}

}
