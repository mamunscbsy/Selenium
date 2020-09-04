package day2_AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LearnAUI1 {
	
	@FindBy(how = How.XPATH,using = "//ol[@id='selectable']/li[1]") WebElement item1;
	@FindBy(how = How.XPATH,using = "//ol[@id='selectable']/li[3]") WebElement item3;
	@FindBy(how = How.XPATH, using = "//ol[@id='selectable']/li[5]") WebElement item5;
	@FindBy(how = How.XPATH, using = "//ol[@id='selectable']/li[7]") WebElement item7;
	@FindBy(how = How.XPATH, using = "//ol[@id='selectable']/li[2]") WebElement item2;
	@FindBy(how = How.XPATH, using = "//ol[@id='selectable']/li[4]") WebElement item4;
	@FindBy(how = How.XPATH, using = "//li[text()='Item 6']" ) WebElement item6;
	
	
	
@Test
	public void main() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.switchTo().frame(0);
		
		PageFactory.initElements(driver, this);
		
		//xpath of Drag me to my target = //div[@id='draggable'] 
		//xpath of Drop here = //div[@id="droppable"] 
		
		//WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		//WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		//WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		//WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");
		
		//WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']/li[2]");
		//WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		//WebElement item6 = driver.findElementByXPath("//ol[@id='selectable']/li[6]");
		
		
		
		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).release().perform();
		
		//builder.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6).release().perform();
		
		
		

	}

}
