package com.purebarre.www.dataaction;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.purebarre.www.driver.ParameterManager;
import com.relevantcodes.extentreports.ExtentTest;

import pageObjects.DataDrivenObjects;

public class SignInAction extends ParameterManager {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	private ExtentTest test;
	public WebDriver driver;
	public WebDriverWait wait;
	public static DataDrivenObjects obj;

	public SignInAction() {

	}

	public SignInAction(final String browser) {
		setBrowser(browser);
	}

	@BeforeTest
	public void TestSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Alexis//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Constants.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void ReadData() throws IOException {
		System.out.println("i am here");
		DataDrivenObjects.button_TryAFreeWeek().click();
		/*
		 * final File src = new File(Constants.File);
		 * final FileInputStream finput = new FileInputStream(src);
		 * workbook = new XSSFWorkbook(finput);
		 * sheet = workbook.getSheetAt(0);
		 * for (int i = 1; i < sheet.getLastRowNum(); i++) {
		 * final int[] cellsArray = { 1, 2, 3, 4 };
		 * for (int j = 0; j < cellsArray.length; j++) {
		 * cell = sheet.getRow(i).getCell(j);
		 * DataDrivenObjects.textfield_FreeWeek_FirstName().sendKeys(cell.getStringCellValue());
		 * }
		 * cell = sheet.getRow(i).getCell(cellsArray[0]);
		 * DataDrivenObjects.textfield_FreeWeek_FirstName().sendKeys(cell.getStringCellValue());
		 * cell = sheet.getRow(i).getCell(2);
		 * DataDrivenObjects.textfield_FreeWeek_LastName().sendKeys(cell.getStringCellValue());
		 * cell = sheet.getRow(i).getCell(3);
		 * DataDrivenObjects.textField_FreeWeek_Email().sendKeys(cell.getStringCellValue());
		 * cell = sheet.getRow(i).getCell(4);
		 * DataDrivenObjects.textField_FreeWeek_Phone().sendKeys(cell.getRawValue());
		 * DataDrivenObjects.button_FreeWeek_Submit().click();
		 * }
		 */
	}
}
