package webTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

public class LearnWebTable {
	
	@Test
	public void learnWebTable(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximize
		driver.manage().window().maximize();
		
		// Launch Url
		driver.get("https://erail.in/");
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//clear the field
		driver.findElementById("txtStationFrom").clear();
		
		//Enter From Station/Departing
		driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
		
		//clear the field
		driver.findElementById("txtStationTo").clear();
		
		//Enter TO Station/Destination
		driver.findElementById("txtStationTo").sendKeys("NDLS",Keys.TAB);
						
		//find the table
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		//System.out.println(table);
		
		//find row (tr tag)
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		
		//WebElement FourthRow = allRows.get(3);
		//WebElement SecondRow = allRows.get(0);
		WebElement secondRow = allRows.get(1);
		System.out.println(secondRow);
		
		//find column (td tag)
		//List<WebElement> allFourthRColumn = FourthRow.findElements(By.tagName("td"));
		List<WebElement> allSecRColumn = secondRow.findElements(By.tagName("td"));
		System.out.println(allSecRColumn.size());
		
		WebElement SecondColumn = allSecRColumn.get(1);
		System.out.println(SecondColumn.getText());
		//WebElement FourthColumn = allSecRColumn.get(3);
		//System.out.println(FourthColumn.getText());
		
		
		
		
		
	}

}
