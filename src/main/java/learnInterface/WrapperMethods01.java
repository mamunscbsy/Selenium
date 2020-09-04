package learnInterface;

public interface WrapperMethods01 {
	
	public void login(String url);
	public void enterById(String locator, String locatorValue);
	
	public void enterByName(String locator, String locatorValue);
	
	public void enterByLinkText(String locator, String locatorValue);
	
	public void enterByXpath(String locator, String locatorValue);
	
	public void enterByCssSelactor(String locator, String locatorValue);
	
	public void clickByName(String locator);
	
	public void clickByClassName(String locator);
	
	public void clickByLinkText(String locator);
	
	public void clickByXpath(String locator);
	
	public void selectByVisibleTextById(String Id, String Value);
	
	public void selectByVisibleTextByName(String Name, String Value);
	
	public void selectIndexById(String Id, int Value);
	
	public void selectIndexByName(String Name, int Value);
	
	public void selectByValueById(String Id, String Value);
	
	public void selectByValueByName(String Name, String Value);
	
	public void getTextById(String Id);

}
