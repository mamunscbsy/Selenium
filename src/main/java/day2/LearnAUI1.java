package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnAUI1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.switchTo().frame(0);
		
		//xpath of Drag me to my target = //div[@id='draggable'] 
		//xpath of Drop here = //div[@id="droppable"] 
		
		/*WebElement item1 = driver.findElementByXPath("//ol[@id='selectable']/li[1]");
		WebElement item3 = driver.findElementByXPath("//ol[@id='selectable']/li[3]");
		WebElement item5 = driver.findElementByXPath("//ol[@id='selectable']/li[5]");
		WebElement item7 = driver.findElementByXPath("//ol[@id='selectable']/li[7]");*/
		
		WebElement item2 = driver.findElementByXPath("//ol[@id='selectable']/li[2]");
		WebElement item4 = driver.findElementByXPath("//ol[@id='selectable']/li[4]");
		WebElement item6 = driver.findElementByXPath("//ol[@id='selectable']/li[6]");
		
		
		
		Actions builder = new Actions(driver);
		//builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).click(item7).release().perform();
		
		builder.keyDown(Keys.CONTROL).click(item2).click(item4).click(item6).release().perform();
		
		
		

	}

}
