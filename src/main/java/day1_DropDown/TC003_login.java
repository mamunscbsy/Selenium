package day1_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TC003_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
				
		  driver.get("http://leaftaps.com/opentaps");
		  
		  driver.manage().window().maximize();
		  
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  //enter username
		 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		  //enter password
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		  //click on login button
		  driver.findElementByClassName("decorativeSubmit").click();
		 
		  //click CRM/SFA 
		  driver.findElementByLinkText("CRM/SFA").click();
		  
		  //click create lead
		  driver.findElementByLinkText("Create Lead").click();
		  
		  driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		  //driver.findElementByName("companyName").sendKeys("XYZ");
		  //enter firstname
		  driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Hema");
		  
		  //enter lastName
		  driver.findElementByXPath("(//input[@name='lastName'])[3]").sendKeys("Ma");
		  
		  //annual revenue
		  driver.findElementByXPath("//input[@id='createLeadForm_annualRevenue']").sendKeys("100");
		  //enter Description
		  driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is Software company");
		  
		//enter phone number
		  driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("123456");
		  // enter important note
		  driver.findElementByXPath("//textarea[@id='createLeadForm_importantNote'] ").sendKeys("importantNote");
		  //enter email
		  driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@yahoo.com");
		  // enter web url
		  driver.findElementByXPath("//input[@id='createLeadForm_primaryWebUrl']").sendKeys("yahoo.com");
		  //enter city
		  driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("Channai");
		  //click create lead btn
		 driver.findElementByXPath("//input[@value='Create Lead']").click();
		  
		 //verify title of the page
		 System.out.println(driver.getTitle());
		
		  //close browser
		 driver.close();
		  
		
		  
		  
		  
		  
		  
		 
	
		
		
		
		
		

	}

}
