package learnException;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleExceptions {

	@Test
	public void handleExceptions() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");

		// className obj = new className();
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();
		
						
		try {
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		}

		catch (NoSuchElementException e ) {
			System.out.println("The element not found");
			
			Thread.sleep(2000);
			
			throw new RuntimeException();
		}

		finally { System.out.println("The element found");
		
		}
		// Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm.sfa link
		try {
		driver.findElementByLinkText("CRM/SFA").click();
		}
		catch (NoSuchElementException e ) {
			System.out.println("The element not found");
			
			Thread.sleep(2000);
			
			throw new RuntimeException();
		}
		finally { 
			System.out.println("The element found");
			}
		
		System.out.println("TestCase Completed");

	}

}
