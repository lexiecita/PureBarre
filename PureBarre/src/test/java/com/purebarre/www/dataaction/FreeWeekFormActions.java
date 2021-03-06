package com.purebarre.www.dataaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.purebarre.www.driver.Constants;
import com.purebarre.www.driver.Manager;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.FreeWeekObjects;
import com.purebarre.www.utils.WaitTypes;

public class FreeWeekFormActions extends ParameterManager {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	public WebDriverWait wait;
	public WebElement element;

	public FreeWeekFormActions() {

	}

	public FreeWeekFormActions(final String browser) {
		setBrowser(browser);
	}

	public void ReadData() throws IOException {
		WaitTypes wait = new WaitTypes(Manager.getDriver());
		wait.waitForElement_Clickable(FreeWeekObjects.button_FreeWeek(), 5);
		FreeWeekObjects.button_FreeWeek().click();
		final File src = new File(Constants.File);
		final FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);
		//TODO put the following in an multidimensional array?
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			FreeWeekObjects.textfield_FreeWeek_FirstName().sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(1);
			FreeWeekObjects.textfield_FreeWeek_LastName().sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(2);
			FreeWeekObjects.textfield_FreeWeek_Email().sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(3);
			FreeWeekObjects.textfield_FreeWeek_Phone().sendKeys(cell.getRawValue());
		}
	}
	
	public void selectDropdown_State(String state) throws IOException {
		Select selectState = new Select(FreeWeekObjects.dropdown_FreeWeek_SelectState());
		selectState.selectByVisibleText(state);
	}
	
	public void selectDropdown_Studio(String studio) throws IOException {
		Select selectStudio = new Select(FreeWeekObjects.dropdown_FreeWeek_SelectStudio());
		selectStudio.selectByValue(studio);
	}
	
	public void clickCTA_Submit() throws IOException {
		FreeWeekObjects.button_FreeWeek_Submit().click();
	}
}
