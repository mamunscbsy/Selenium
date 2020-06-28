package wrapper;

import org.testng.annotations.Test;

public class TC002_EditLead extends GenericWrapper{
	
	
	@Test
	public void editLead() throws InterruptedException {
		
		invokeApp("http://leaftaps.com/opentaps");
		enterByName("USERNAME", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
		clickByXpath("//a[@href='/crmsfa/control/leadsMain']"); 
		clickByXpath("//a[@href='/crmsfa/control/findLeads']");
		enterByXpath("(//input[@name='firstName'])[3]", "g");
		clickByXpath("(//button[@type='button'])[7]");
		Thread.sleep(2000);
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a");
		System.out.println(driver.getTitle());
		clickByXpath("//a[text()='Edit']");
		enterById("updateLeadForm_companyName", "X");
		clickByXpath("//input[@value='Update']");
		verifyTextById("viewLead_companyName_sp", "tcs");
		quitBrowser();	
		
	}
	

}
