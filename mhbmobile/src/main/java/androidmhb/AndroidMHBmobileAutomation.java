package androidmhb;

import org.testng.annotations.Test;

public class AndroidMHBmobileAutomation extends AndroidMHBLogin {
	
	@Test
	public static void androidmhbmain() {
		AndroidMHBDashboard adashboard = new AndroidMHBDashboard();  //11
		adashboard.androidmhbhome();
	
		AndroidMHBBroadcast abrdcst = new AndroidMHBBroadcast(); // 26
		abrdcst.androidmhbbroadcast(); 
	
		AndroidMHBFreeText afreetxt = new AndroidMHBFreeText();  // 11
		afreetxt.androidmhbfreetxt(); 
		
		AndroidMHBGroupText agrptxt = new AndroidMHBGroupText(); //10
		agrptxt.androidmhbgrouptext(); 
		
		AndroidMHBPatients apatienttab = new AndroidMHBPatients(); //4
		apatienttab.androidmhbpatients();
		
		AndroidMHBContacts acontacts = new AndroidMHBContacts(); // 8
		acontacts.androidmhbcontacts();	

	}

}
