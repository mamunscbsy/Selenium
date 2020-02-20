package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class common {
	//ChromeDriver driver = new ChromeDriver();
	public static WebDriver  id(){	
		ChromeDriver driver = new ChromeDriver();
		//driver.findElement(By.id(locator));
	 return driver;
	}

}
