package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class LearnAUI_MouseMovement {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("http://mrbool.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					
		WebElement content = driver.findElementByClassName("menulink");
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(content).perform();
			
		
		//click on Articles
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[text()='Articles'])[1]").click();
		
	//driver.close();
		
		//select Content and store it in a variable
		/*WebElement ele = driver.findElementByXPath("//a[@class='menulink']");
		Actions builder = new Actions(driver);
		builder.moveToElement(ele).perform();*/
		

	}

}
