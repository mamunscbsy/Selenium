package demoFireFoxBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowser_Googlecom {

	public static void main(String[] args) {

		//Open the browser(chrome browser)
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				
	
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\mamun\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();
		
		//ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
	
		//Load url		
		driver.get("http://google.com");
				
		//get title of the page
		System.err.println(driver.getTitle());
			
		//click About
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.linkText("About").click();
		//driver.findElementByPartialLinkText("About this").click();
		
		//click products
		//driver.findElementByXPath("//a[@title='Products']").click();
		
		//close browser
		
		driver.close();
		
		
	}

}
