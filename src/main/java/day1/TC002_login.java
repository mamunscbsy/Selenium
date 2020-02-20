package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002_login {
	public static void main(String[] args) {	
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElementById("email").sendKeys("mamunurrob@gmail.com");
		
		driver.findElement(By.id("email")).sendKeys("sdfad");
		
		driver.findElementById("password").sendKeys("720971");
		
		driver.manage().window().maximize();
		
		driver.quit();
		
		
		
		

	}

}
