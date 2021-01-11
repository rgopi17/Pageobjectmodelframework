package Chrome;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class Chrome {

	public WebDriver driver;

	public String Firstname;
	public String Lastname;
	public String Phonenumber;
	public String Email;
	public String Username;
	public String Password;
	/*
	 * public String Salestool; public String buildtool; public String addlead;
	 * public String selectlead; public String username; public String password;
	 */

	public ExtentReports report;
	public ExtentTest logger;

	public WebDriver initialize() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\selenium\\chromedriver\\chromedriver_win32 (1)\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.liidaveqa.com/");

		return driver;
	}

	public void Exceldata() throws IOException

	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\Resources\\TestData.xlsx";
		// FileInputStream excel=new FileInputStream("D:\\Exceldata\\TestData.xlsx");
		FileInputStream excel = new FileInputStream(otherFolder);
		XSSFWorkbook workbook = new XSSFWorkbook(excel);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowcount;
		int columncount;
		rowcount = sheet.getLastRowNum();
		XSSFCell firstname = sheet.getRow(1).getCell(1);
		String fn = firstname.toString().trim();
		XSSFCell lastname = sheet.getRow(2).getCell(1);
		String ln = lastname.toString().trim();
		XSSFCell phonenumber = sheet.getRow(3).getCell(1);
		String pn = phonenumber.toString().trim();
		XSSFCell email = sheet.getRow(4).getCell(1);
		String el = email.toString();
		Firstname = fn;
		Lastname = ln;
		Phonenumber = pn;
		Email = el;

		String path1 = System.getProperty("user.dir");
		String otherFolder1 = path1 + "\\src\\main\\Resources\\TestData.xlsx";
		FileInputStream excel1 = new FileInputStream("D:\\Exceldata\\TestData.xlsx");
		XSSFWorkbook workbook1 = new XSSFWorkbook(otherFolder1);
		XSSFSheet sheet1 = workbook1.getSheetAt(1);
		int rowcount1;
		rowcount1 = sheet1.getLastRowNum();
		XSSFCell username = sheet1.getRow(1).getCell(1);
		XSSFCell password = sheet1.getRow(2).getCell(1);
		String us = username.toString();
		String pd = password.toString();
		Username = us;
		Password = pd;

	}

	public static String screenshot(WebDriver driver) throws IOException
	{
	
		TakesScreenshot x = (TakesScreenshot) driver;
		
		File source =x.getScreenshotAs(OutputType.FILE);
		
		File sourcefile =
				  x.getScreenshotAs(OutputType.FILE);
				 String path =
				 System.getProperty("user.dir") + "/Screenshots/" + System.currentTimeMillis() + ".png"; 
				  
				  File finalDestination = new File(path); 
				  FileHandler.copy(source,finalDestination); 
				  
				  return path;

		
	}
}
