package seleniumDemo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/jsref/met_win_open.asp");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElementByPartialLinkText("Try it Yourself »").click();

		//String currentWindow = driver.getWindowHandle();
		//System.out.println(currentWindow);

		Set<String> allWin = driver.getWindowHandles();
		
		//Set<String> allWin = driver.getWindowHandles(); 
		// Set<String> allWin = driver.getWindowHandles();
		//System.out.println(allWin);

		for (String eachWin : allWin) {
			
			System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			
			//System.out.println(driver.getTitle());
			
		}

		// System.out.println(driver.getTitle());

		//driver.switchTo().frame("iframeResult");

		//driver.findElementByXPath("//button[text()='Try it']").click();

		// driver.close(); // closing the child/new window

		/*
		 * driver.get("https://www.irctc.co.in");
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * 
		 * driver.findElementByLinkText("AGENT LOGIN").click();
		 * driver.findElementByLinkText("Contact Us").click();
		 */

	}

}
