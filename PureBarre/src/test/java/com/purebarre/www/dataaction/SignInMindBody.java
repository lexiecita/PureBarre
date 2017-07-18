package com.purebarre.www.dataaction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInMindBody {

	private static XSSFWorkbook workbook;
	private static XSSFSheet sheet;
	private static XSSFCell cell;
	public WebDriver driver;

	@BeforeTest
	public void TestSetup() {
		System.setProperty("webdriver.chrome.driver",
				"C://Users//Alexis//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://staging.purebarre.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void ReadData() throws IOException, InterruptedException {
		driver.findElement(By.xpath("//li[@id='menu-item-92']//a[contains(text(), 'Locations')]")).click();
		driver.findElement(By.xpath("//*[@id='states']//option[contains(text(), 'Alabama')]")).click();
		driver.findElement(By.xpath("//p[contains(text(), '205-982-8366')]//following-sibling::p")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'My Account')]")).click();
		final File src = new File("C://Users//Alexis//Desktop//Book1.xlsx");
		final FileInputStream finput = new FileInputStream(src);
		workbook = new XSSFWorkbook(finput);
		sheet = workbook.getSheetAt(0);
		for (int i = 1; i < sheet.getLastRowNum(); i++) {
			cell = sheet.getRow(i).getCell(1);
			Thread.sleep(2000);
			final WebElement username = driver
					.findElement(By.xpath("//label[@for='mb_client_session_username']"));
			final Actions builder = new Actions(driver);
			final Action goToUsername = builder.moveToElement(username).build();
			goToUsername.perform();
			final Action sendUsername = builder.sendKeys(cell.getStringCellValue()).build();
			sendUsername.perform();

			cell = sheet.getRow(i).getCell(2);
			Thread.sleep(2000);
			final WebElement password = driver
					.findElement(By.xpath("//label[@for='mb_client_session_password']"));
			final Action goToPassword = builder.moveToElement(password).build();
			goToPassword.perform();
			final Action sendPassword = builder.sendKeys(cell.getStringCellValue()).build();
			sendPassword.perform();
			driver.findElement(By.xpath("//button[@class='cta']")).click();

			driver.close();
		}
	}
}