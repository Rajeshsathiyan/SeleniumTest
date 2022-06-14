package testproject;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;


public class Testnew{  
    public static void main(String args[]) throws InterruptedException{ 
    	WebDriver driver =null; 
    	System.setProperty("webdriver.chrome.driver","S:\\chromedriver.exe");
    	driver=new ChromeDriver();
    	driver.get("https://loan.sivren.org/loan/ins/index.php/authentication/login");
       Thread.sleep(3000);
    	driver.manage().window().maximize();
  driver.findElement(By.id("username")).sendKeys("rajesh@db1.com");
    driver.findElement(By.id("password")).sendKeys("Rajesh@123");
    	driver.findElement(By.name("submit")).click();
    	
    // Mlcb application 
    	WebElement target = driver.findElement(By.xpath("//a[text()='MLCB']"));
    	WebElement targ1 = driver.findElement(By.xpath("//a[text()='1. Application Form']")); 
    	Actions s = new Actions (driver);
    	driver.findElement(By.xpath("//a[text()='MLCB']")); 
    	s.moveToElement(target);
    	s.click(targ1);
    	s.build().perform();
    	WebElement targ2 =  driver.findElement(By.xpath("//a[text()='Add Mlcb Application(Personal)']"));
    	Actions a = new Actions (driver);
    	a.click(targ2);
    	a.build().perform();
 
    // Fill Mlcb application field 
    	Select drpidtype = new Select(driver.findElement(By.name("identification_type_id")));
    	drpidtype.selectByVisibleText("Singapore NRIC No");
    driver.findElement(By.id("uid")).sendKeys("S9258252C");
    driver.findElement(By.id("name")).sendKeys("Loanapplication2");
    Select nationality = new Select(driver.findElement(By.name("country_id")));
    nationality.selectByVisibleText("Singapore Citizen");
    driver.findElement(By.id("amount")).sendKeys("5000");
    Select property = new Select(driver.findElement(By.name("property_ownership")));
    property.selectByVisibleText("Landed");
    driver.findElement(By.name("monthly_income")).sendKeys("400");
    driver.findElement(By.name("IncMon2")).sendKeys("4000");
    driver.findElement(By.name("IncMon3")).sendKeys("4000");
    Select estatus = new Select(driver.findElement(By.name("EmpSta")));
    estatus.selectByVisibleText("Self Employed");
    Select doctype = new Select(driver.findElement(By.name("DocTyp1")));
    doctype.selectByVisibleText("PaySlip");
    driver.findElement(By.id("BthDat")).sendKeys("12-03-1996");
    Select gender = new Select(driver.findElement(By.name("Gen")));
    gender.selectByVisibleText("Male");
    Select eth = new Select(driver.findElement(By.name("ethnic_group_id")));
    eth.selectByVisibleText("Malay");
    driver.findElement(By.id("CurEmp")).sendKeys("SS Pte Ltd");
    Select spe = new Select(driver.findElement(By.name("specialisations_id")));
    spe.selectByVisibleText("Manufacturing");
    Select position = new Select(driver.findElement(By.name("positions_id")));
    position.selectByVisibleText("Senior Manager");
    Select typeresprop = new Select(driver.findElement(By.name("ProTyp")));
    typeresprop.selectByVisibleText("Landed");
    driver.findElement(By.name("AddPos")).sendKeys("627890");
    driver.findElement(By.name("AddBlk")).sendKeys("12");
    driver.findElement(By.name("AddStr")).sendKeys("Benoi Lane");
    driver.findElement(By.name("AddUnt")).sendKeys("#1-2");
    driver.findElement(By.name("AddBld")).sendKeys("BL");
    driver.findElement(By.name("ConNo")).sendKeys("95977268");
    WebElement chkbox = driver.findElement(By.name("valid_license"));
    chkbox.click();
    WebElement submit = driver.findElement(By.name("submit_save_back"));
    submit.click();
  //  driver.findElement(By.xpath(" //*[@id=\"session_message\"]/ul/li[3]/a")).click();
 //   driver.findElement(By.linkText("ML Borrower Report - Individual for S9838868J/Testloan")).click();
    Thread.sleep(2000);
//    
    //New give loan 
//    WebElement glf = driver.findElement(By.xpath("//a[text()='MLCB']"));
//	WebElement targ3 = driver.findElement(By.xpath("//a[text()='2. New Give Loan']")); 
//	Actions ng = new Actions (driver);
//	ng.moveToElement(glf);
//	ng.click(targ3);
//	ng.build().perform();
	
	//driver.findElements(By.xpath("//*[@id=\"disbursement1_mlcb_application_id\"]")).get(1).click();
	
	//select.SelectByIndex(2);
//	  Select mlcb = new Select(driver.findElement(By.id("disbursement1_mlcb_application_id")));
//	  mlcb.selectByVisibleText("1412-Rajesh-$8000.00");
	  Select mlcbdrp = new Select(driver.findElement(By.id("disbursement1_mlcb_application_id")));
	  mlcbdrp.selectByIndex(3);
	 // mlcb.selectByIndex(2);
//	driver.findElement(By.name("borrower1_uid")).sendKeys("S9921623I");
//	driver.findElement(By.xpath("//*[@id=\"uid_search_button\"]")).click();
	// driver.findElement(By.cssSelector("#uid_search_button")).click();
//	driver.findElement(By.xpath("//*[@id=\"disbursement1_loan_plan_id\"]")).click();
	 Select loanplan = new Select(driver.findElement(By.name("disbursement1_loan_plan_id")));
	  loanplan.selectByVisibleText("MONTHLY");
	  Select selectbranch = new Select(driver.findElement(By.name("disbursement1_branch_id")));
	  selectbranch.selectByVisibleText("Main");
	  driver.findElement(By.xpath("//*[@id=\"borrower1_entry\"]/fieldset[1]/div[6]/input[2]")).click();
	 Thread.sleep(2000);
	   // window handle
	   String windowHandle = driver.getWindowHandle();

	 //Get the list of window handles
	 ArrayList tabs = new ArrayList (driver.getWindowHandles());
	 System.out.println(tabs.size());
	 //Use the list of window handles to switch between windows
	 driver.switchTo().window((String) tabs.get(0));

	
	 //  driver.switchTo().window("https://loan.sivren.org/loan/ins/index.php/application_june/giveloan?regs=oct2015");
	
	
	 //  driver.get("https://loan.sivren.org/loan/ins/index.php/application_june/giveloan?regs=oct2015");
//	    WebElement submitglf = driver.findElement(By.xpath("//*[@id=\"submit_form\"]"));
//	    submitglf.click();
	   driver.findElement(By.xpath("//*[@id=\"submit_form\"]")).click();
//	  
	   // download report 
		WebElement report = driver.findElement(By.xpath("//a[text()='Menu']"));
    	WebElement repo = driver.findElement(By.xpath("//a[text()='Download Report(CBS)']")); 
    	Actions r = new Actions (driver);
    	driver.findElement(By.xpath("//a[text()='Menu']")); 
    	s.moveToElement(report);
    	s.click(repo);
    	s.build().perform();
	    
//	  //*[@id="session_message"]/ul/li[3]/a
   // driver.findElement(By.xpath("//a[text()=' ML Borrower Report - Individual for S9921623I/Rajesh']")).click(); 
    	
    }  	
}  