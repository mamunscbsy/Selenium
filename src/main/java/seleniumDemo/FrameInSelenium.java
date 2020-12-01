package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		
		//driver.get("https://jqueryui.com/selectable/");
		
		//driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//way-1 -Switching to frame 
		
		driver.switchTo().frame("iframeResult");
			
		//way-2
		//driver.switchTo().frame(1);
		
		//way-3
		
		//WebElement iframe = driver.findElementByXPath("//iframe[@id='iframeResult']");
		//driver.switchTo().frame(iframe);
		
		//OR
		//driver.switchTo().frame(driver.findElementByXPath("//iframe[@id='iframeResult']"));
		
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("Basith");
		
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='lname']").clear();
		driver.findElementByXPath("//input[@id='lname']").sendKeys("Taphadar");
			
		//driver.switchTo().parentFrame();
		//OR
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		driver.close();
		
		
		/*//driver.findElementByXPath("(//a[text()='Try it Yourself »'])[1]").click();
		
		//way-1
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		//SimpleAlert
		Alert SimpleAlert = driver.switchTo().alert();
		SimpleAlert.getText();
		//System.out.println(SimpleAlert.getText());
	
		Thread.sleep(3000);
		SimpleAlert.accept();*/
	
		
		//driver.switchTo().defaultContent();

	}

}
