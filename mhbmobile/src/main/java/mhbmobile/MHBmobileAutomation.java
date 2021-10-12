package mhbmobile;

import org.testng.annotations.Test;

public class MHBmobileAutomation extends MHBmobileLogin {

	@Test
	public void mhbmain() {
	
//		MHBmobileBroadcast brdcst = new MHBmobileBroadcast();
//		brdcst.mhbbroadcast();
		
//		MHBmobileFreeText fretxt = new MHBmobileFreeText();
//		fretxt.mhbfreetxt();
		
		MHBmobileGroupText grptxt = new MHBmobileGroupText();
		grptxt.mhbgrouptext();
	}

}
