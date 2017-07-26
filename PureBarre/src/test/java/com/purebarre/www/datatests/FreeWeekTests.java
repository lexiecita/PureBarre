package com.purebarre.www.datatests;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.purebarre.www.dataaction.FreeWeekFormActions;

public class FreeWeekTests {
	
	private FreeWeekFormActions si;

	@Parameters({"browser"})
	@Test 
	public void FreeWeekForm() throws IOException {
		si = new FreeWeekFormActions();
		si.ReadData();
	}

}
