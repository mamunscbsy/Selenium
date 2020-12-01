package learnAUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Enter into the frame (because our element inside frame)
		driver.switchTo().frame(0);
		
		
		WebElement Dragable = driver.findElementById("draggable");
		
		WebElement Dropable = driver.findElementById("droppable");
		
		Actions action = new Actions(driver);
			
		Thread.sleep(2000);
		//Right click
		action.contextClick(Dragable);
		
		Thread.sleep(2000);
		action.dragAndDrop(Dragable, Dropable).perform();
		
		//action.dragAndDrop(Dragable, Dropable).perform();
		
		//action.clickAndHold(Dragable).moveToElement(Dropable).release().build().perform();
		
		//switch back from frame
		driver.switchTo().defaultContent();
		
		//click Selectable
		driver.findElementByLinkText("Selectable").click();
		
		//driver.close();

	}

}
