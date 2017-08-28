package com.purebarre.www.datatests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.purebarre.www.dataaction.FreeWeekFormActions;
import com.purebarre.www.objects.FreeWeekObjects;

public class FreeWeekTests {
	
	private FreeWeekFormActions fw;
	private WebElement fieldnotempty, state, studio;
	
	@Parameters({"browser"})
	@Test 
	public void FreeWeekForm() throws IOException {
		fw = new FreeWeekFormActions();
		fw.ReadData();
		//TODO Add check for error states
		fieldnotempty = FreeWeekObjects.getText_FieldNotEmpty();
		if (fieldnotempty.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Parameters({"browser"})
	@Test
	public void FreeWeekForm_SelectState() throws IOException {
		fw = new FreeWeekFormActions();
		fw.ReadData();
		fw.selectDropdown_State("Alabama");
		state = FreeWeekObjects.dropdown_FreeWeek_SelectedState("'Alabama'");
		if (state.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		//TODO add error checking
		//TODO put states into an arraylist to test?
	}
	
	@Parameters({"browser"})
	@Test
	public void FreeWeekForm_SelectStudio() throws IOException, InterruptedException {
		fw = new FreeWeekFormActions();
		fw.ReadData();
		fw.selectDropdown_State("Alabama");
		Thread.sleep(2000);
		fw.selectDropdown_Studio("Mobile");
		studio = FreeWeekObjects.dropdown_FreeWeek_SelectedStudio("'Mobile'");
		if (studio.isDisplayed()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
		//TODO add error checking
		//TODO put studios into an arraylist to test?
		//TODO find replacement for thread.sleep
	}
	
	@Parameters({"browser"})
	@Test
	public void FreeWeekForm_Submit() throws IOException, InterruptedException {
		fw = new FreeWeekFormActions();
		fw.ReadData();
		fw.selectDropdown_State("Alabama");
		Thread.sleep(2000);
		fw.selectDropdown_Studio("Mobile");
		fw.clickCTA_Submit();
		//TODO add expected for production
		//TODO Find replacement for thread.sleep
	}
	

}
