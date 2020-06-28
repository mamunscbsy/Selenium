package testCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import wrapper.GenericWrapper01;



public class TC001_CreateLead extends GenericWrapper01 {
	
	@Test
	public void createLead() throws InterruptedException {
		invokeBrowser("chrome", "http://leaftaps.com/opentaps");
		enterByID("username", "DemoSalesManager");
		enterByID("password", "crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Create Lead");
		
		enterByXpath("//input[@id='createLeadForm_companyName']", "ABC");
		enterByXpath("//input[@id='createLeadForm_firstName']", "Ma");
		enterByXpath("//input[@id='createLeadForm_lastName']", "C");
		enterByXpath("//input[@id='createLeadForm_firstNameLocal']", "m");
		enterByName("lastNameLocal", "C");
		
		enterByName("personalTitle", "Dear Mr.");
		selectByVisibleTextById("createLeadForm_dataSourceId", "Employee");
		enterByXpath("(//input[@class='inputBox'])[9]", "Mr");
		enterByName("annualRevenue", "200000");
		selectByVisibleTextById("createLeadForm_industryEnumId", "Finance");
		selectByVisibleTextById("createLeadForm_ownershipEnumId", "Corporation");
		enterByName("sicCode", "0123");
		enterByID("createLeadForm_description", "This is a Software Development company");
		enterByName("importantNote", "It's very secured");
		//enterByID("createLeadForm_primaryPhoneCountryCode", "1"); //org.openqa.selenium.ElementNotInteractableException: element not interactable
		enterByXpath("//input[@id='createLeadForm_primaryPhoneAreaCode']", "682");
		enetrById("createLeadForm_primaryPhoneExtension", "103");
		enterByXpath("//input[@id='createLeadForm_departmentName']", "MKT");
		selectByVisibleTextById("createLeadForm_currencyUomId", "USD - American Dollar");
		enterByXpath("//input[@id='createLeadForm_numberEmployees']", "100");
		enterByXpath("//input[@id='createLeadForm_tickerSymbol']", "#");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneAskForName']", "H");	
		enterByXpath("//input[@id='createLeadForm_primaryWebUrl']", "www.testleaf.com");
		enterByXpath("//input[@id='createLeadForm_generalToName']", "Ja");
		enterByXpath("//input[@id='createLeadForm_generalAddress1']", "88 saddle dr,252 ir, Tx");
		enterByXpath("//input[@id='createLeadForm_generalAddress2']", "8820 saddle Dr, irving, Tx");
		enterByXpath("//input[@id='createLeadForm_generalCity']", "Dallas");
		selectByVisibleTextById("createLeadForm_generalStateProvinceGeoId", "Texas");
		selectByVisibleTextById("createLeadForm_generalCountryGeoId", "United States");
		enterByXpath("//input[@id='createLeadForm_generalPostalCode']", "75068");
		enterByXpath("//input[@id='createLeadForm_generalPostalCodeExt']", "123");
		selectByVisibleTextById("createLeadForm_marketingCampaignId", "Automobile");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneNumber']", "683-207-4149");
		enterByXpath("//input[@id='createLeadForm_primaryEmail']", "arc@gmail.com");
		clickByXpath("//input[@name='submitButton']");
		
		
		
	}

}
