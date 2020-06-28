package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		
		driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElementById("draggable");
		WebElement droppable = driver.findElementById("droppable");
		
		//WebElement draggable = driver.findElementById("draggable");
		//WebElement droppable = driver.findElementById("droppable");
		Actions action = new Actions(driver);
		
		Thread.sleep(3000);
		action.dragAndDrop(draggable, droppable).perform();
		
		
		//action.dragAndDrop(draggable, droppable).perform();
		
		
		
	}

}
