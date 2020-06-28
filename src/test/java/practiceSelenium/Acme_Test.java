package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme_Test {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("http://acme-test.uipath.com/account/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//input[@id='email']").sendKeys("kumar.testleaf@gmail.com");
		
		driver.findElementByXPath("//input[@id='password']").sendKeys("leaf@12");
		
		driver.findElementByXPath("//button[@id='buttonLogin']").click();
		
		//Mouse Over on Vendors element
		WebElement vendor = driver.findElementByXPath("(//button[@type='button'])[6]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(vendor).perform();
		
		driver.findElementByLinkText("Search for Vendor").click();
		
		driver.findElementByXPath("//input[@id='vendorName']").sendKeys("Blue Lagoon");
		
		driver.findElementByXPath("//button[text()='Search']").click();
		
		//didn't perform "find the country name based on the vendor"
		
		driver.findElementByXPath("//a[text()='Log Out']").click();
						
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
