package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class BrowserTest {

	//public static void main(String[] args) throws InterruptedException {

	@Test
	public void browserTest (){
		//launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		// load url
		driver.get("http://leaftaps.com/opentaps");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//Print Title of the page
		
		
		 System.out.println(driver.getTitle());
		 
		 //Implicitly wait
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 //enter username
		 driver.findElementById("username").sendKeys("DemoSalesManager");
		 
		 //enter password
		 driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		 
		 //click login btn
		 driver.findElementByClassName("decorativeSubmit").click();
		 
		 //click CRM/SFA
		 driver.findElementByLinkText("CRM/SFA").click();
		 
		 //close browser
		// driver.close();
		 
		

		
		
		
	}

}
