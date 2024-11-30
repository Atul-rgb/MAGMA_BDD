package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver ldriver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		
	}
	@FindBy (xpath="//a[text()='View / Manage Inward (Inward generated)']")
	@CacheLookup
	  WebElement inward_generate;
	
	@FindBy (xpath="//input[@id='txtUserName']")
	@CacheLookup
	  WebElement txtUserName;
	
	@FindBy (xpath="//input[@id='txtPassword']")
	@CacheLookup
	  WebElement txtPassWord;
	
	
	@FindBy(id="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="//a[text()='Inward']")
	@CacheLookup
	WebElement inwardModule;
	
	
	@FindBy(xpath="//p[text()='Inward']")
	@CacheLookup
	WebElement subInward;
	public void click_Sub_inwardModule()
	{
		subInward.click();
	}
	
	
	public void click_inward_generate()
	{
		inward_generate.click();
	}
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassWord(String pwd)
	{
		
		txtPassWord.clear();
		txtPassWord.sendKeys(pwd);
	}
	
	public void entercaptcha() throws Exception
	{
		Thread.sleep(30000);
	}
	public void click_Login_Button()
	{
		btnLogin.click();
		//wait.until(ExpectedConditions.elementToBeClickable(btnLogin)).click();
	}

	public  void click_Inward_module() 
	{
		inwardModule.click();
	
	}
	
/*public void clickProfile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(profileLink)).click();
	}*/
	
	/*public void clickLogOut()
	{
		wait.until(ExpectedConditions.elementToBeClickable(logoutlink)).click();
	}*/
	
}
