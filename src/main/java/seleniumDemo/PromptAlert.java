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
		
		//way-1
		String promptAlert = driver.switchTo().alert().getText();
		System.out.println(promptAlert);
		 Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Hi I am Tasnim");
		driver.switchTo().alert().accept();
		
		//way-2
		/*Alert promptAlert = driver.switchTo().alert();
		//promptAlert.getText();
		System.out.println(promptAlert.getText());
		
		Thread.sleep(3000);
		
		promptAlert.sendKeys("I am Anwar Hoque");
	
		
		Thread.sleep(3000);
		promptAlert.accept()
		promptAlert.dismiss;*/
		
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());
		
		Thread.sleep(3000);
		//close browser
		driver.close();
		
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
