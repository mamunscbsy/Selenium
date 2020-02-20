package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC0001_login {

	public static void main(String[] args) {

		//Open the browser(chrome)
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 
		
		//Launch the Url
		//driver.get("http://google.com");
		
		//Launch application
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
				
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//System.out.println(driver.getPageSource());
		
		//driver.navigate().to("http://yahoo.com");
		
		//driver.navigate().back();
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				
		//driver.navigate().forward();
		
		//driver.close();
		
		//driver.quit();

	}

}
