package PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Chrome.Chrome;

public class Xpathpage extends Chrome {
	

	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public static WebElement sigin;
	
	@FindBy(id="j_username")
	public static WebElement username;
	
	@FindBy(id="j_password")
	public static WebElement password;
	
	@FindBy(id="loginSubmit")
	public static WebElement submit;
	
	@FindBy(xpath="//i[@class='far fa-bars v2-hamburger-menu']")
	public static WebElement Menubar;
	
	@FindBy(xpath="(//a[contains(text(),'Sales Tools')])[1]")
	public static WebElement Salestools;
	
	@FindBy(xpath="//a[contains(text(),'Build a Proposal')]")
	public static WebElement buildproposal;	
	
	@FindBy(xpath="//a[contains(text(),'SELECT LEAD')]")
	public static WebElement selectlead;	
	
	@FindBy(xpath="(//span[contains(text(),'ADD LEAD')])[2]")
	public static WebElement addlead;	
	
	
	@FindBy(id="firstName")
	public static WebElement FirstName;	
	
	@FindBy(id="lastName")
	public static WebElement Lastname;
	
	@FindBy(id="phNo")
	public static WebElement Phonenumber;
	
	@FindBy(id="email")
	public static WebElement Email;
	
	@FindBy(xpath="//*[@id=\"oldSystemDescription\"]")
	public static WebElement Description;
	
	
	@FindBy(xpath="//*[@id=\"calender1\"]")
	public static WebElement Scheduledate;
	
	@FindBy(xpath="//a[contains(text(),'20')]")
	public static WebElement Calendarclick;
	
	@FindBy(xpath="//*[@id=\"btn-addLeadsForm\"]/span")
public static WebElement savelead;

	@FindBy(xpath="//*[@id=\"globalMessages\"]/div/ul/li")
	public static WebElement successmessage;
	
	@FindBy(xpath = "//*[@class=\"leads-uploads-add-icon\"]")
	public static WebElement adddoc;
	
	@FindBy(xpath="(//select[@class='styled-select documents'])[2]")
	public static WebElement dropdown;
	
	
	@FindBy(xpath="//*[@id=\"modal-edit-lead-add-doc\"]/div/div/div[6]/a[2]/span")
	public static WebElement addleadsindropdown;
	
	@FindBy(xpath="//*[@id=\"multipleImageSelect[0]\"]")
	public static WebElement addimage;
	
	@FindBy(xpath="//*[@id=\"multipleFileSelect-1\"]")
	public static WebElement selectfile;
	
	
	
	

	/*
	 * public WebDriver driver;
	 * 
	 * Chrome y = new Chrome(); public String fn = y.Firstname;
	 * 
	 * public String ln = y.Lastname;
	 * 
	 * public String pn = y.phonenumber;
	 * 
	 * public String em = y.email;
	 * 
	 * public String st = y.Salestool;
	 * 
	 * public String bt = y.buildtool;
	 * 
	 * public String sl = y.selectlead;
	 * 
	 * public String al = y.addlead;
	 * 
	 * public String us = y.username; public String ps = y.password;
	 * 
	 * By signin = By.xpath("//a[contains(text(),'Sign In')]");
	 * 
	 * By username = By.id("j_username");
	 * 
	 * By password = By.id("j_password");
	 * 
	 * By submit = By.id("loginSubmit");
	 * 
	 * By menuclick = By.xpath("//i[@class='far fa-bars v2-hamburger-menu']");
	 * 
	 * By salestools = By.xpath("(//a[contains(text(),'Sales Tools')])[1]");
	 * 
	 * By buildproposal = By.xpath("//a[contains(text(),'Build a Proposal')]");
	 * 
	 * By selectlead = By.xpath("//a[contains(text(),'SELECT LEAD')]");
	 * 
	 * By addlead = By.xpath("(//span[contains(text(),'ADD LEAD')])[2]");
	 * 
	 * By Firstname = By.id("firstName");
	 * 
	 * By Lastname = By.id("lastName");
	 * 
	 * By phonenumber = By.id("phNo");
	 * 
	 * By email = By.id("email");
	 * 
	 * By scheduleddate = By.id("calender1");
	 * 
	 * By calendarclick = By.xpath("//a[contains(text(),'11')]");
	 * 
	 * public Xpathpage(WebDriver driver) { this.driver = driver; }
	 * 
	 * public WebElement signin() { return driver.findElement(signin); }
	 * 
	 * public WebElement username()
	 * 
	 * {
	 * 
	 * return driver.findElement(username);
	 * 
	 * }
	 * 
	 * public WebElement password() { return driver.findElement(password); }
	 * 
	 * public WebElement submit() { return driver.findElement(submit); }
	 * 
	 * public WebElement menuclick() { return driver.findElement(menuclick); }
	 * 
	 * public WebElement salestools() { return driver.findElement(salestools); }
	 * 
	 * public WebElement buildproposal() { return driver.findElement(buildproposal);
	 * }
	 * 
	 * public WebElement selectlead() { return driver.findElement(selectlead); }
	 * 
	 * public WebElement addlead() { return driver.findElement(addlead); }
	 * 
	 * public WebElement Firstname() { return driver.findElement(Firstname); }
	 * 
	 * public WebElement Lastname() { return driver.findElement(Lastname); }
	 * 
	 * public WebElement phonenumber() { return driver.findElement(phonenumber); }
	 * 
	 * public WebElement email() { return driver.findElement(email); }
	 * 
	 * public WebElement scheduleddate() { return driver.findElement(scheduleddate);
	 * }
	 * 
	 * public WebElement calendarclick() { return driver.findElement(calendarclick);
	 * }
	 */
}
