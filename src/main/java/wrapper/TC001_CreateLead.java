package wrapper;

import org.testng.annotations.Test;

public class TC001_CreateLead extends GenericWrapper {
	
	@Test
	public void createLead() {
		
		invokeApp("http://leaftaps.com/opentaps");
		enterByName("USERNAME", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByXpath("//input[@value='Login']");
		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", "TCS");
		enterByCssSelector("input#createLeadForm_firstName", "Gopi");
		enterByCssSelector("#createLeadForm_lastName", "J");
		enterByCssSelector("input#createLeadForm_firstNameLocal", "Gopi");
		enterByXpath("//input[@id='createLeadForm_lastNameLocal']", "Jayakumar");
		enterByXpath("//input[@name='personalTitle']", "Mr.");
		selectVisibileTextById("createLeadForm_dataSourceId", "Website");
		enterByXpath("//input[@name='generalProfTitle']", "Mr.");
		enterByXpath("//input[@name='annualRevenue']", "1000");
		selectVisibileTextById("createLeadForm_industryEnumId", "Insurance");
		selectByVisibleTextByName("ownershipEnumId", "Sole Proprietorship");
		enterByXpath("//input[@name='sicCode']", "1010");
		enterByXpath("//textarea[@name='description']", "It's a Software Development company");
		enterByCssSelector("textarea#createLeadForm_importantNote", "It's a trusted company");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneCountryCode']", "0088");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneAreaCode']", "682");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneNumber']", "2084048");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneExtension']", "101");
		enterByXpath("//input[@id='createLeadForm_departmentName']", "QA");
		selectVisibileTextById("createLeadForm_currencyUomId", "BDT - Bangladesh Taka");
		enterByXpath("//input[@id='createLeadForm_numberEmployees']", "1002");
		enterByXpath("//input[@name='tickerSymbol']", "$");
		enterByXpath("//input[@name='primaryPhoneAskForName']", "Gopi");
		enterByXpath("//input[@name='primaryWebUrl']", "www.google.com");
		enterByXpath("//input[@name='generalToName']", "Gnath");
		enterByXpath("//input[@name='generalAddress1']", "8821 Saddlehorn Dr");
		enterByXpath("//input[@name='generalAddress2']", "APT 252");
		enterByXpath("//input[@id='createLeadForm_generalCity']", "DAL");
		selectVisibileTextById("createLeadForm_generalStateProvinceGeoId", "Texas");
		selectVisibileTextById("createLeadForm_generalCountryGeoId", "Bangladesh");
		enterByXpath("//input[@id='createLeadForm_generalPostalCode']", "75061");
		enterByXpath("//input[@id='createLeadForm_generalPostalCodeExt']", "111");
		selectVisibileTextById("createLeadForm_marketingCampaignId", "Car and Driver");
		enterById("createLeadForm_primaryPhoneNumber", "347-612-1535");
		enterById("createLeadForm_primaryEmail", "mrc_77@gmail.com");
		clickByXpath("//input[@name='submitButton']");
		verifyTextById("viewLead_firstName_sp", "Gopi");
		
	}

}
