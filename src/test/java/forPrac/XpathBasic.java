package forPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasic {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//navigate jqueryi.com
		driver.get("https://jqueryui.com/selectable/");
		//Maximize browser
		driver.manage().window().maximize();
		
		//xpath of Item 1
		driver.findElement(By.xpath("//li[text()='Item 1']")).click();
		
		
		

	}

}
