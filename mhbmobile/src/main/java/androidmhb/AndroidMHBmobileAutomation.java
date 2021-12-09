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
		
//		MHBmobileGroupText agrptxt = new MHBmobileGroupText();
//		agrptxt.mhbgrouptext(); 
		
//		AndroidMHBPatients apatienttab = new AndroidMHBPatients(); //done
//		apatienttab.androidmhbpatients();
		
		MHBmobileContacts acontacts = new MHBmobileContacts();
		acontacts.mhbcontatcs();
		

	}

}
