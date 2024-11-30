package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Comman_Cod;

public class AddEditCollection {
	
	WebDriver ldriver;
	WebDriverWait wait;
	Comman_Cod comman_Cod;
	public AddEditCollection(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		comman_Cod=new Comman_Cod(ldriver);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Get')]")
	@CacheLookup
	WebElement get_collection_id;
	@FindBy(xpath="//iframe[contains(@src,'Receipt')]")
	@CacheLookup
	WebElement iframe_reciept;
	@FindBy(id="TxtSearchFor")
	@CacheLookup
	WebElement iframe_search_box;
	@FindBy(id="BtnSearch")
	@CacheLookup
	WebElement iframe_Go_button;
	@FindBy(xpath="//img[contains(@src,'btn-go')]")
	@CacheLookup
	WebElement iframe_result_go_button;
	@FindBy(id="ctl00_PageBodyControls_grdCollectionInfo_ctl02_ChkSelect")
	@CacheLookup
	WebElement check_box_recept;
	@FindBy(id="ctl00_PageBodyControls_grdCollectionInfo_ctl02_txtMapAmt")
	@CacheLookup
	WebElement tag_amount_field;
	@FindBy(id="ctl00_PageBodyControls_btnSubmit")
	@CacheLookup
	WebElement mapping_collection_button;
	
	@FindBy(id="ctl00_PageBodyControls_imgOK")
	@CacheLookup
	WebElement collection_tagging_popup_ok_button;
	public void Click_collection_tagging_popup_ok_button()
	{
		collection_tagging_popup_ok_button.click();
	}
	
	public void Click_mapping_collection_button()
	{
		mapping_collection_button.click();
	}
	
	
	public void enter_tag_amount_field(String str)
	{
		tag_amount_field.sendKeys(str);
	}
	
	
	public void click_check_box_recept()
	{
		check_box_recept.click();
	}
	
	public void click_iframe_result_go_button() throws Exception
	{ comman_Cod.waitLoader();
		iframe_result_go_button.click();
		comman_Cod.waitLoader();
		comman_Cod.shitch_to_Parent();
	}
	public void click_get_collection_id()
	{
		get_collection_id.click();
	}
	public void click_iframe_Go_button()
	{
		iframe_Go_button.click();
	}
	
	public void enter_data_in_search_box(String data)
	{
		comman_Cod.shitch_to_Iframe(iframe_reciept);
		iframe_search_box.sendKeys(data);
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
