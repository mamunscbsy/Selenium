package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElementByXPath("(//input[@id='searchBtn'])[1]").click();
		
		/*Alert simple_alert = driver.switchTo().alert();
		System.out.println(simple_alert.getText());
		
		Thread.sleep(3000);
		simple_alert.accept();*/
		
		
		String actual_msg = driver.switchTo().alert().getText();
		//System.out.println(actual_msg);
		
		System.out.println("Alert message is: "+ actual_msg);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

}
