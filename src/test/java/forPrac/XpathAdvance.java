package forPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAdvance {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//invokes linkedin.com
		driver.get("https://www.linkedin.com/");
		
		//Maximize browser
		driver.manage().window().maximize();
		
		Thread.sleep(2000); 
		
		driver.findElement(By.xpath("/html/body/nav/section[2]/button/li-icon")).click();
		//click on Sales
		//driver.findElement(By.xpath("//a[text()='Sales']")).click();
		
		//click on Engineering
		//driver.findElement(By.xpath("//a[text()='Engineering']")).click();
		
		//click on Business Development
		driver.findElement(By.xpath("//a[text()='Business Development']")).click();
		
		//click on Business Finance
		driver.findElement(By.xpath("//a[text()='Finance']")).click();
		
		//click on Healthcare Service
		driver.findElement(By.xpath("//a[text()='Healthcare Service']")).click();
		
		
		
		
		

	}

}
