package day1;

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
		  //driver.findElementByLinkText("Create Lead").click();
		  driver.findElementByXPath("//a[text()='Create Lead']").click();
		  //enter company name
		  driver.findElementByXPath("//input[@id='createLeadForm_companyName']").sendKeys("ABC");
		  //enter firstname
		  //driver.findElementById("createLeadForm_firstName").sendKeys("ABC");
		  driver.findElementByXPath("//input[@id='createLeadForm_firstName']").sendKeys("Rajkumar");
		  //enter lastname
		  driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("J");
		  //enter dercription
		  driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software company");
		  //enter phone number
		  driver.findElementByXPath("(//input[@name='primaryPhoneNumber'])[4]").sendKeys("123456");
		  
		  //enter email id
		  driver.findElementByXPath("//input[@id='createLeadForm_primaryEmail']").sendKeys("abc@yahoo.com");
		  
		  //click create lead button
		  driver.findElementByXPath("//input[@name='submitButton']").click();
		  
		  //close browser
		 // driver.close();
		  
		
		  
		  
		  
		  
		  
		 
	
		
		
		
		
		

	}

}
