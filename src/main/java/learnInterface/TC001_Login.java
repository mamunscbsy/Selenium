package learnInterface;

import org.testng.annotations.Test;

public class TC001_Login extends GenericWrapper01 {
	
	@Test
	public void login() {
		
		launchBrowser("http://leaftaps.com/opentaps");
		
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByXpath("//input[@value='Login']");

		clickByLinkText("CRM/SFA");
		clickByLinkText("Leads");
		clickByLinkText("Create Lead");
		enterById("createLeadForm_companyName", "TCS");
		enterByCssSelactor("input#createLeadForm_firstName", "Gopi");
		enterByCssSelactor("#createLeadForm_lastName", "j");
		enterByCssSelactor("input#createLeadForm_firstNameLocal", "Gopi");
		enterByXpath("//input[@id='createLeadForm_lastNameLocal']", "Jayakumar");
		enterByXpath("//input[@name='personalTitle']", "Mr.");
		selectByVisibleTextById("createLeadForm_dataSourceId", "Website");
		enterByXpath("//input[@name='generalProfTitle']", "Mr");
		enterByXpath("//input[@name='annualRevenue']", "1000");
		selectByVisibleTextById("createLeadForm_industryEnumId", "Insurance");
		selectByVisibleTextByName("ownershipEnumId", "Sole Proprietorship");
		enterByXpath("//input[@name='sicCode']", "1010");
		enterByXpath("//textarea[@name='description']", "It is a Software Development company");
		enterByCssSelactor("textarea#createLeadForm_importantNote", "It's a trusted company");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneCountryCode']", "0088");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneAreaCode']", "682");
		enterByXpath("//input[@id='createLeadForm_primaryPhoneExtension']", "101");
		enterByXpath("//input[@id='createLeadForm_departmentName']", "QA");
		selectByVisibleTextById("createLeadForm_currencyUomId", "BDT - Bangladesh Taka");
		enterByXpath("//input[@id='createLeadForm_numberEmployees']", "1002");
		enterByXpath("//input[@name='tickerSymbol']", "$");
		enterByXpath("//input[@name='primaryPhoneAskForName']", "Gopi");
		enterByXpath("//input[@name='primaryWebUrl']", "www.google.com");
		enterByXpath("//input[@name='generalToName']", "Gnath");
		enterByXpath("//input[@name='generalAddress1']", "8821 Saddlehorn Dr");
		enterByXpath("//input[@name='generalAddress2']", "APT 252");
		enterByXpath("//input[@id='createLeadForm_generalCity']", "DAL");
		selectByVisibleTextById("createLeadForm_generalStateProvinceGeoId", "Texas");
		selectByVisibleTextById("createLeadForm_generalCountryGeoId", "Bangladesh");
		enterByXpath("//input[@id='createLeadForm_generalPostalCode']", "75061");
		enterByXpath("//input[@id='createLeadForm_generalPostalCodeExt']", "111");
		selectByVisibleTextById("createLeadForm_marketingCampaignId", "Car and Driver");
		enterById("createLeadForm_primaryPhoneNumber", "347-612-1535");
		enterById("createLeadForm_primaryEmail", "mrc_77@gmail.com");
		clickByXpath("//input[@name='submitButton']");
		verifyTextById("viewLead_firstName_sp", "Gopi");
		

	}


	}


