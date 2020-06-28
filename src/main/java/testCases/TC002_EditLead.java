package testCases;

import org.testng.annotations.Test;

import wrapper.GenericWrapper01;

public class TC002_EditLead extends GenericWrapper01{
	
	@Test
	public void editlead() throws InterruptedException{
		
		invokeBrowser("chrome", "http://leaftaps.com/opentaps");
		enterByID("username", "DemoSalesManager");
		enterByID("password", "crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
		clickByXpath("//a[@href='/crmsfa/control/leadsMain']"); 
		clickByXpath("//a[@href='/crmsfa/control/findLeads']");
		enterByXpath("(//input[@name='firstName'])[3]", "g");
		clickByXpath("(//button[@type='button'])[7]");
		Thread.sleep(2000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
			
		
	}
	

}
