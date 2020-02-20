package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeBrowser {  	

	public static void main(String[] args) { 	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe"); 
		//WebDriver driver=new ChromeDriver(); 	
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.mycontactform.com/"); 
		
		System.out.println(driver.getCurrentUrl()); 
		
		System.out.println(driver.getTitle()); 	  	  //Login page 	
		
		
		driver.findElement(By.id("user")).sendKeys("Prabhu123"); 
			
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("12345");
		
		//username.sendKeys("Prabhu123"); 	 
		
		WebElement password = driver.findElement(By.xpath("//*[@id='pass']"));
		password.sendKeys("12345"); 
		
		driver.findElement(By.cssSelector("#right_col_top > form > div > input")).click(); 	 	    
		
		//WebElement us
	}
}