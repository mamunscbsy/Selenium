package selenium_SivaC1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenerricMethods {
	WebDriver driver = null;
	public void launchBrowser(String browser) {
		
				
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equals("IE")) {
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browser.equals("safari")) {
			WebDriverManager.operadriver();
			 driver = new OperaDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
			}
	public void getUrl(String Url) {
		driver.get(Url);
	}
	public void closebrowser() {
		driver.quit();
	}
	
	public void click(WebElement element) {
		element.click();
	}
	public void inputData(WebElement element,String inputData) {
		element.sendKeys(inputData);
	}
}
