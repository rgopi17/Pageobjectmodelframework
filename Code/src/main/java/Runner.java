package Runnerfile;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Chrome.Chrome;
import PageObjects.Xpathpage;

public class Runner extends Chrome {

	@BeforeTest
	public void beforetest()
	{
		extenReport=new ExtentReports();
		htmlreporter=new ExtentHtmlReporter("ExtentReport.html");
		extenReport.attachReporter(htmlreporter);
	}
	
	@Test
	public void runnerfile() throws IOException
	{
		driver=initialize();
		Exceldata();
		
		
		PageFactory.initElements(driver, Xpathpage.class);
		
		Xpathpage.sigin.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		Xpathpage.username.sendKeys(Username);
		Xpathpage.password.sendKeys(Password);
		
		screenshot(driver);
		Xpathpage.submit.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		Xpathpage.Menubar.click();
		Xpathpage.Salestools.click();
		screenshot(driver);
		Xpathpage.buildproposal.click();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		
		WebElement element=Xpathpage.selectlead;
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
		screenshot(driver);
		
		Xpathpage.addlead.click();
		
		Xpathpage.FirstName.sendKeys(Firstname);
		Xpathpage.Lastname.sendKeys(Lastname);
		Xpathpage.Phonenumber.sendKeys(Phonenumber);
		Xpathpage.Email.sendKeys(Email);
		screenshot(driver);
		Xpathpage.Description.click();
		WebElement element1 =Xpathpage.Description;
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		Xpathpage.Scheduledate.click();
		Xpathpage.Calendarclick.click();
		
		
		Xpathpage.adddoc.click();
		
		WebElement element2=Xpathpage.addleadsindropdown;
		executor.executeScript("arguments[0].click();", element2);
		
	Select select=new Select(Xpathpage.dropdown);
		select.selectByIndex(3);
		
		String path3 = System.getProperty("user.dir");
			String Testdoc = path3 + "\\src\\main\\Resources\\Testdoc.docx";
			Xpathpage.selectfile.sendKeys(Testdoc);
			Xpathpage.addleadsindropdown.click();
			
		String path2 = System.getProperty("user.dir");
		String Testimage = path2 + "\\src\\main\\Resources\\Testimage.png";
				Xpathpage.addimage.sendKeys(Testimage);
				screenshot(driver);
				
				Xpathpage.savelead.click();
				
				driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
				screenshot(driver);
				
				WebElement Actual=Xpathpage.successmessage;
				String Text=Actual.getText();
				String Message="Lead Saved Successfully";
				Assert.assertEquals(Text, Message);
				
				
				
				
		
		
		
		
		
		
	
	}
	
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
		extenReport.flush();
	}
	
}
