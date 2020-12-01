package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardKeys {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Enter into the frame
		driver.switchTo().frame(0);

		
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		
	

		Actions action = new Actions(driver);
		//action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5);
		
		action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).release().perform();
		
		//back to main Html page or come out from frame
		driver.switchTo().parentFrame();
		
		driver.close();

	}

}
