package com.purebarre.www.dataaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.purebarre.www.driver.Constants;
import com.purebarre.www.driver.ParameterManager;
import com.purebarre.www.objects.FreeWeekObjects;


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
		FreeWeekObjects.button_FreeWeek().click();
		File src = new File(Constants.File);
		FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(0);
			FreeWeekObjects.textfield_FreeWeek_FirstName().sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(1);
			FreeWeekObjects.textfield_FreeWeek_LastName().sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(2);
			FreeWeekObjects.textfield_FreeWeek_Email().sendKeys(cell.getStringCellValue());
			cell = sheet.getRow(i).getCell(3);
			FreeWeekObjects.textfield_FreeWeek_Phone().sendKeys(cell.getRawValue());
			FreeWeekObjects.button_FreeWeek_Submit().click();
		}
	}
}






	
	


