package day1_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC0001_login {

	public static void main(String[] args) throws InterruptedException {

		//Open the browser(Chrome browser)
					
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		//ChromeDriver driver = new ChromeDriver();
		
		//Open the browser(FireFoxBrowser)
		
		//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		//Launch the Url
		//driver.get("http://www.google.com");
		
		// launch google.com
		//driver.get("http://www.google.com");
		
		//Maximize window
		driver.manage().window().maximize(); 
	
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Launch application
		driver.get("http://leaftaps.com/opentaps");
		
		//Page Title
				
		System.out.println(driver.getTitle());
	
		//enter username
	
		
		
		//Get title of the page
		
	
		
		  
		  driver.manage().window().maximize();
		  
		  //enter username
		  driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		  
		  //enter password
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  
		  //click Login button
		  driver.findElement(By.className("decorativeSubmit")).click();
		
		  
		  

			//close browser
			driver.close();
		  
		 // driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		  //driver.findElement(By.id("password")).sendKeys("crmsfa");
		  //driver.findElement(By.className("decorativeSubmit")).click();
		  //driver.findElement(By.className("decorativeSubmit")).click();
		 // driver.findElement(By.linkText("CRM/SFA")).click();
		 
		
		
		//System.out.println(driver.getPageSource());
		
		//driver.navigate().to("http://yahoo.com");
		
		//Thread.sleep(2000);
		//driver.navigate().back();
								
		//driver.navigate().forward();
		
		//driver.close();
		
		//driver.quit();

	
	}
}
