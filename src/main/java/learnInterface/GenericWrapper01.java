package learnInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GenericWrapper01 implements WrapperMethods01 {

	public ChromeDriver driver;
	

	public void launchBrowser(String Url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void enterById(String locator, String locatorValue) {
		driver.findElementById(locator).sendKeys(locatorValue);
	}

	public void enterByName(String locator, String locatorValue) {
		driver.findElementByName(locator).sendKeys(locatorValue);
	}
	
	public void enterByLinkText(String locator, String locatorValue) {
		driver.findElementByLinkText(locator).sendKeys(locatorValue);
	}

	public void enterByXpath(String locator, String locatorValue) {
		driver.findElementByXPath(locator).sendKeys(locatorValue);
	}

	public void enterByCssSelactor(String locator, String locatorValue) {
		driver.findElementByCssSelector(locator).sendKeys(locatorValue);
	}

	public void clickByName(String locator) {
		driver.findElementByName(locator).click();
	}

	public void clickByLinkText(String locator) {
		driver.findElementByLinkText(locator).click();
	}

	public void clickByXpath(String locator) {
		driver.findElementByXPath(locator).click();
	}

	public void selectByVisibleTextById(String Id, String Value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByVisibleText(Value);
	}

	public void selectByVisibleTextByName(String Name, String Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd = new Select(ele);
		dd.selectByVisibleText(Value);
	}

	public void selectIndexById(String Id, int Value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByIndex(Value);
	}

	public void selectIndexByName(String Name, int Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd = new Select(ele);
		dd.selectByIndex(Value);
	}

	public void selectByValueById(String Id, String Value) {
		WebElement ele = driver.findElementById(Id);
		Select dd = new Select(ele);
		dd.selectByValue(Value);
	}

	public void selectByValueByName(String Name, String Value) {
		WebElement ele = driver.findElementByName(Name);
		Select dd = new Select(ele);
		dd.selectByValue(Value);
		
	}
	
	public void getTextById(String Id) {
		WebElement Text = driver.findElementById(Id);
		System.out.println(Text);
	}

	public void clickByClassName(String locator) {
		// TODO Auto-generated method stub
		
	}
	public void verifyTextById(String id, String text) {
		String txt = driver.findElementById(id).getText();
		if (txt.equals(text)) {
			System.out.println("text is matched");
		} else {
			System.out.println("text is not matched");
		}
	}

	public void login(String url) {
		// TODO Auto-generated method stub
		
	}
}
