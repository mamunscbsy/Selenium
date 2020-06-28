package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LearnAUI {
	
	
	@FindBy(how = How.ID, using = "draggable") WebElement draggable;
	@FindBy(how = How.ID, using = "droppable" ) WebElement droppable;
	


	@Test
	public void main() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame(0);
		
		//page factory class
		PageFactory.initElements(driver, this);
		
		//WebElement resizable = driver.findElementById("resizable");
		
		
		//draggable.click();
		
		//WebElement username = driver.findElementById("username");
		//WebElement draggable = driver.findElementById("draggable");
		//WebElement droppable = driver.findElementById("droppable");
		
		
		Actions builder = new Actions(driver); // for any mouse and keyboard related action, we should create object for Actions
	builder.dragAndDrop(draggable, droppable).perform();
		
		
		
		
		

	}

}
