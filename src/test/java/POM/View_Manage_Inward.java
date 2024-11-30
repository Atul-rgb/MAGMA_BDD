package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Comman_Cod;

public class View_Manage_Inward {
	
	WebDriver ldriver;
	WebDriverWait wait;
	Comman_Cod comman_Cod;
	public View_Manage_Inward(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		wait = new WebDriverWait(rdriver, 90);
		comman_Cod=new Comman_Cod(ldriver);
	}
	
	
	@FindBy (xpath="//a[text()='Add New']")
	@CacheLookup
	  WebElement inward_Add_butoon;
	@FindBy (id="ctl00_PageBodyControls_txtDCNNumber")
	@CacheLookup
	  WebElement DCN_field;
	
	@FindBy (id="ctl00_PageBodyControls_btnSearch")
	@CacheLookup
	  WebElement search_button;
	@FindBy (xpath="//img[@alt='Edit Client']")
	@CacheLookup
	  WebElement edit_DCN;
	@FindBy (xpath="//img[@alt='Proceed For QC']")
	@CacheLookup
	  WebElement Proceed_For_QC;
	@FindBy (xpath="//b[contains(text(),'Mapping')]")
	@CacheLookup
	  WebElement mapping_status;
	@FindBy (xpath="//img[@alt='Proceed For Proposal']")
	@CacheLookup
	  WebElement proceed_for_praposal;
	
	
	public void click_proceed_for_praposalbutoon() throws Exception
	{
		proceed_for_praposal.click();
		comman_Cod.waitLoader();
	//	comman_Cod.accept_alert();
	}
	public String check_mapping_status() {
	 return 	mapping_status.getText();
	}
	
	public void click_Proceed_For_QC_buuton() throws Exception
	{
		Proceed_For_QC.click();
		comman_Cod.waitLoader();
	//	comman_Cod.accept_alert();
	}
	public void click_edit_DCN_buuton()
	{
		edit_DCN.click();
		comman_Cod.accept_alert();
	}
	
	public void click_inward_Add_buuton()
	{
		inward_Add_butoon.click();
	}
	public void click_search_button() throws Exception
	{
		//search_button.click();
		comman_Cod.javascript_click_specific_element(search_button);
		comman_Cod.waitLoader();
	}
	
	public void enter_dcn(String str) {
		DCN_field.sendKeys(str);
	}	

	
}
