package day1_DropDown;

import org.testng.annotations.Test;

import wrapper.GenericWrapper01;

public class TestCase1 extends GenericWrapper01 {
	
	@Test
	public void login() {
		invokeBrowser("chrome", "http://leaftaps.com/opentaps");
		enterByID("username", "DemoSalesManager");
		enterByID("password", "crmsfa");
		//enterByName("USERNAME","DemoSalesManager");
		//enterByName("PASSWORD","crmsfa");
		//enterByXpath("//*[@id=\"username\"]","DemoSalesManager");
		//enterByXpath("//*[@id=\"password\"]","crmsfa");
		//enterByClass("inputLogin","DemoSalesManager");
		//enterByClass("inputLogin","crmsfa"); //class locator is not working because of Username & password are same value 
		//enterByXpath("//*[@id=\"password\"]","crmsfa");
		clickByClassName("decorativeSubmit"); // click on Login element
		clickByLinkText("CRM/SFA"); // click on CRM/SFA element
		//clickById("ext-gen603"); // click on 
		clickByLinkText("Leads"); // click on Leads element
		clickByLinkText("Find Leads");// question
		//clickByXpath("//*[@id=\'ext-gen855\']"); //click on Find Leads element (question)
		enterByXpath("(//input[@name='firstName'])[3]","Mamunur"); //enter First Name as Mamunur
		enterByXpath("(//input[@name='lastName'])[3]","Chowdhury");
		enterByXpath("(//input[@name='companyName'])[2]","Abc");//
		//clickByXpath("//*[@id='ext-gen334']");
		//selectByVisibleTextById("employee");
		
	}

}
