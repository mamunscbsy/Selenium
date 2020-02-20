package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementByLinkText {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe"); 
		
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		//By LinkText
		//driver.findElement(By.linkText("REGISTER")).click();
				
		driver.findElement(By.name("firstName")).sendKeys("Mamunur");//Firstname
		System.out.println("Mamunur is entered successfully");
		
		driver.findElement(By.name("lastName")).sendKeys("Chowdhury");//Lastname
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("6822084048");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("mamun@gmail.com");//email
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("8820 saddlehorn Dr");//address
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Irving");//city
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Tx");//state
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("75063");//postal code
		
		//System.out.println("The element clicked successfully");
		//Dropdown in Selenium
				//WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId")); // for Source Element(Dropdown)
				//Select dd= new Select(src); // Create d object for Select class for Dropdown
				
				
		//By ParticalLinkText
		//driver.findElement(By.partialLinkText("REGIST").click();
		
		//driver.findElement(By.className("UniqueTagName")).click();
		 
		//driver.findElement(By.xpath("//input[@name='register']")).click();
		//driver.findElement(By.tagName("UniqueTagName")).click();
		
		
		
	}

}
