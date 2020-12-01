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
				
		//click Selectable (outside frame)
		driver.findElementByLinkText("Selectable").click();
		
		//Using index number- if your iframe has no Id or Name locator then go to Index number
		
		//Switching to frame - way 2
		//driver.switchTo().frame(0); // using index number - (Note: in java index starts from Zero[0])
								
		//Switching to frame- way-3	
		WebElement iframe = driver.findElementByClassName("demo-frame");
		driver.switchTo().frame(iframe);
		
		//OR 	
		//driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
					
		//clicking Item-1
		driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();
		
		//click item -2
		//driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
		
		//clicking Item-3 
		driver.findElementByXPath("//ol[@id='selectable']/li[3]").click(); 
				
		//click item-7
		driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
		
		//switch back to main HTML page 
		driver.switchTo().defaultContent();
		
		//click Demos (outside frame)
		Thread.sleep(3000);
		driver.findElementByLinkText("Demos").click();
		
		driver.close();

	}

}
