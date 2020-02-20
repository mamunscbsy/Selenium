package forPrac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrameAlerts {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		String txt = "name";
		
		String text = driver.switchTo().alert().getText(); //for read the text from alert
		System.out.println("text"); // print the text in console
		
		//driver.switchTo().alert().accept(); // click ok button from alert
		
		driver.switchTo().alert().dismiss(); //// click cancel button from alert
		
		
		
		
		
		
		
		

	}

}
