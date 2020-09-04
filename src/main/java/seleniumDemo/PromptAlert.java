package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
						
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());*/
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		/*driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();*/
		
		Alert promptAlert = driver.switchTo().alert();
		//promptAlert.getText();
		System.out.println(promptAlert.getText());
		Thread.sleep(3000);
		promptAlert.sendKeys("I am Zahid Hussain");
		Thread.sleep(3000);
		promptAlert.accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());
		
		
		/*driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		alert.getText();
		//alert.sendKeys("I am Atiqul Huda");
		alert.sendKeys("I am Atia Sultana an Automation Engineer");
		alert.accept();
		//print the message
		System.out.println(driver.findElement(By.id("demo")).getText());*/
	
		
	}

}
