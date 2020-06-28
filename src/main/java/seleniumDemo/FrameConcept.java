package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameConcept {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		
		driver.get("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		
		//Using index number- if your iframe has no Id or Name locator then go to Index number
		//Switching to frame - way 2
		driver.switchTo().frame(0); // using index number - (Note: in java index starts from Zero[0])
		//Switching to frame- way-3				
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame")); //Select WebElement by CalssName
		
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click(); //clicking Item 1 element 
		
		
		
		
		//switch back to main HTML page 
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.findElementByLinkText("Demos").click();

	}

}
