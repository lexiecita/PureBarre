package com.purebarre.www.datatests;

import com.purebarre.www.dataaction.SignInAction;;

public class SignInTest {

	private SignInAction si;

	public void completeForm(final String browser) throws Exception {
		si = new SignInAction(browser);
		si.TestSetup();
		si.ReadData();
	}

}
