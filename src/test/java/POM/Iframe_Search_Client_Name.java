package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Comman_Cod;

public class Iframe_Search_Client_Name {
	
	WebDriver ldriver;
	WebDriverWait wait;
	Comman_Cod comman_Cod;
	public Iframe_Search_Client_Name(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		comman_Cod=new Comman_Cod(ldriver);
	}
	@FindBy (id="TxtSearchFor")
	@CacheLookup
	  WebElement search_Box;
	
	@FindBy (id="BtnSearch")
	@CacheLookup
	  WebElement HB_Search_Radio_Button;

	@FindBy (id="tbn_fetchData")
	@CacheLookup
	  WebElement GC_Search_Radio_Button;
	

	@FindBy (xpath="//iframe[@id='ctl00_PageBodyControls_Iframe2']")
	@CacheLookup
	  WebElement iframe_clienty_name;
	@FindBy (xpath="//table[@id='GridView1']//tbody//tr[2]//td[9]")
	@CacheLookup
	  WebElement result_go_button;
	public  void Click_result_go_button() throws Exception 
	{  
		result_go_button.click();
	Thread.sleep(3000);
		//comman_Cod.waitLoader();
		comman_Cod.accept_alert();
	}
    public void  move_to_iframe()
    {
    	comman_Cod.shitch_to_Iframe(iframe_clienty_name);
    }
    
    public void  move_to_parentframe()
    {
    	comman_Cod.shitch_to_Parent();
    }
    
	public  void Click_GC_Search_Radio_Button() 
	{
		GC_Search_Radio_Button.sendKeys();
	
	}
	public  void enter_data_SearchBox(String data) 
	{
		search_Box.sendKeys(data);
	
	}
	
	public  void clicK_HB_Search_Radio_Button() 
	{
		HB_Search_Radio_Button.click();
	
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
