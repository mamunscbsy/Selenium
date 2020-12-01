package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver(); 

		driver.get("http://mrbool.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement content = driver.findElementByClassName("menulink");
		//Actions is a class // create object of Actions class
		
		Actions action = new Actions(driver);
		action.moveToElement(content).perform();
		

		/*WebElement content = driver.findElementByClassName("menulink");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(content).perform();*/

		
		Thread.sleep(3000);
		
		//click on ARTICLES
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();

		//driver.close();


	}

}
