package testCases;

import org.testng.annotations.Test;

import wrapper.GenericWrapper;

public class TC003_DeleteLead extends GenericWrapper{
	
	@Test
	public void deletelead() {
		
		invokeBrowser("chrome", "http://leaftaps.com/opentaps");
		enterByXpath("//input[@id='username']", "DemoSalesManager");
		enterByXpath("//input[@id='password']", "crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Find Leads");
		clickByLinkText("Phone");
		enterByName("phoneCountryCode", "1");
		enterByName("phoneAreaCode", "682");
		enterByName("phoneNumber", "2084048");
		clickByXpath("(//button[@type='button'])[7]");
	
		
		
		
		
	}
	
	

}
