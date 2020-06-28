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
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
						
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		Thread.sleep(3000);
		promptAlert.sendKeys("Mamun");
		Thread.sleep(3000);
		promptAlert.accept();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("result")).getText());*/
		
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Mamun");
		Thread.sleep(3000);
		promptAlert.accept();
	
		//promptAlert.dismiss();
		System.out.println(driver.findElement(By.id("demo")).getText());
	
		
	}

}
