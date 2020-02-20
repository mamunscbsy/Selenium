package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementBy {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe"); 
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().window().maximize();
		
		WebElement objWE;
		
		driver.findElement(By.id("email")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
		driver.findElement(By.name("register")).click();
		Thread.sleep(5000);
		//driver.quit();
		
		
	}

}
