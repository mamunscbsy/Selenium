package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI2 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.findElementByXPath("//button[text()='✕']").click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		
		 //driver.getKeyboard().sendKeys(keysToSend);
		 
		 //select Electronics and store it in a variable 
		WebElement elec = driver.findElementByXPath("//span[text()='Electronics']"); 
		 Actions builder =  new Actions(driver); 
		 builder.moveToElement(elec).perform();
		 
		
	
		driver.findElementByLinkText("Samsung").click();


	}

}
