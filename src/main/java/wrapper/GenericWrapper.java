package wrapper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper {

	public RemoteWebDriver driver;

	//1. Invoke any Browser	
	public void invokeBrowser(String browser, String url) { //pass the value runtime as arguments

		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
			driver = new ChromeDriver(); // For Chrome
		} else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver(); // For Firefox
		}else if (browser.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(); // For IE
		}else if(browser.contentEquals("")) {
			
			
		}

		//pass the value in Runetime like String url
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browswer "+browser+" launched successfully");

	}

	//2. enter the value for only Id locator
	public void enterByID(String loc, String value) {
		driver.findElementById(loc).sendKeys(value);
		System.out.println("The data "+value+" is entered Successfully");
	}

	//public void enterBy(String loc, String value){
	//driver.findElementByName(loc).sendKeys(value);
	//System.out.println("The data "+value+" is entered Successfully");
	//}


	//3. Click the element for only ID locator
	public void clickById(String loc) {
		driver.findElementById(loc).click();
		System.out.println("The Element clicked sucessfully");
	}

	//4. click the element by Name locator
	public void clickByClassName(String loc) {
		driver.findElementByClassName(loc).click();
		System.out.println("The Element clicked sucessfully");
		;		
	}
	//5. Enter the value for only Name locator
	public void enterByName(String loc, String value) {
		driver.findElementByName(loc).sendKeys(value);
		System.out.println("The date "+value+" is entered Successfully");

	}

	//public void enterBy(String loc, String value) {
	////driver.findElementByName(loc).sendKeys(value);
	//System.out.println("The date "+value+" is entered successfully");
	//}

	//6. enter the value by Xpath locator
	public void enterByXpath(String loc, String value) {
		driver.findElementByXPath(loc).sendKeys(value);
		System.out.println("The date "+value+" is entered successfuly");
	}
	//public void enterBy(String loc, String value) {
	//driver.findElementByXPath(value);
	//System.out.println("The date "+value+" is entered successfully");
	//}
	//Enter the value by class locator
	public void enterByClass(String loc, String value) {
		driver.findElementByClassName(loc).sendKeys(value);
		System.out.println("The date "+value+" is entered successfully");

	}
	

	//public void clickByLinkText1(String loc) {
	//driver.findElementByLinkText(loc).click();
	//System.out.println("The Element clicked successfully");
	//}

	//enter the element by ID locator
	public void enetrById(String loc, String value) {
		driver.findElementById(loc).sendKeys(value);
		System.out.println("The date "+value+" is entered successfully");
	}

	//click the element by linkText locator
	public void clickByLinkText(String loc) {
		driver.findElementByLinkText(loc).click();
		System.out.println("The Element clicked successfully");
	}

	//click the element by Xpath locator
	public void clickByXpath(String loc) {
		driver.findElementByXPath(loc).click();
		System.out.println("The element clicked successfully");
	}
	//Dropdown by using Id locator (visible text)
	public void selectByVisibleTextById(String id, String value) {
		WebElement ele = driver.findElementById(id);
		Select dd =new Select(ele);
		dd.selectByVisibleText(value);	
		System.out.println("Done");
	}


	public void selectByValueById(String id, String value) {
		WebElement ele = driver.findElementById(id);
		Select dd =new Select(ele);
		dd.selectByValue(value);	
	}
	public void selectIndexById(String id, int value) {
		WebElement ele = driver.findElementById(id);
		Select dd =new Select(ele);
		dd.selectByIndex(value);
	}
	public void selectByVisibleTextByName(String name, String value) {
		WebElement ele = driver.findElementById(name);
		Select dd =new Select(ele);
		dd.selectByVisibleText(value);	
		System.out.println("Done");
	}
	
	public void selectByValueByName(String name, String value) {
		WebElement ele = driver.findElementById(name);
		Select dd =new Select(ele);
		dd.selectByValue(value);
	}
	public void selectIndexByName(String name, int value) {
		WebElement ele = driver.findElementById(name);
		Select dd =new Select(ele);
		dd.selectByIndex(value);
	}
	
	
	
} 